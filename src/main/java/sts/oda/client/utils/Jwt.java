package sts.oda.client.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.impl.DefaultClaims;

import java.io.IOException;
import java.time.Instant;
import java.util.Base64;
import java.util.List;

public class Jwt {

    private Long exp;
    private Clock clock;
    private String access_token;
    private DefaultClaims body;
    private String sub;
    private String email;
    private List<String> roles;
    private long expirationFuzzSeconds = 5;

    public Jwt(String access_token) throws IOException {
        this.access_token = access_token;
        loadFromToken(access_token);
    }

    public Jwt(String access_token, Clock clock) throws IOException {
        loadFromToken(access_token, clock);
    }

    public void setClock(Clock clock) {
        if(clock != null) {
            this.clock = clock;
        }
        else {
            this.clock = new Clock();
        }
    }


    protected void loadFromToken(String token) throws IOException {
        loadFromToken(token, clock);
    }

    protected void loadFromToken(String token, Clock clock) throws IOException {
        setClock(clock);

        access_token = token;

        try {
            body = (DefaultClaims) Jwts.parser().setClock(clock).parse(token).getBody();
        } catch(ExpiredJwtException | IllegalArgumentException e) {
            body = extractBody(token);
        }
        roles = (List<String>) ((DefaultClaims) body).get("roles");
        email = (String) body.get("email");

        sub = (String) ((DefaultClaims) body).get("sub");

    }

    private DefaultClaims extractBody(String token) throws IOException {
        String[] split_token = token.split("\\.");
        if (split_token.length < 2) {
            return null;
        }
        String jwtPayload = split_token[1];
        String json = new String(Base64.getDecoder().decode(jwtPayload));
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(json, DefaultClaims.class);
    }

    public boolean isExpired() {
        return isExpired(clock);
    }

    public boolean isExpired(Clock clock) {
        long fuzzedNow = clock.instant().plusSeconds(expirationFuzzSeconds).toEpochMilli();
        return expiresAtInEpochMilli() < fuzzedNow;
    }

    protected long expiresAtInEpochMilli() {
        return Instant.ofEpochSecond(getExp()).toEpochMilli();
    }

    private long getExp() {
        try {
            return ((DefaultClaims) body).getExpiration().toInstant().getEpochSecond();
        } catch (Exception e) {
            return Instant.now().getEpochSecond();
        }
    }

}
