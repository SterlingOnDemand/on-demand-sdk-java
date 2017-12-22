package sts.oda.client.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.annotations.SerializedName;
import sts.oda.client.utils.Jwt;
import org.joda.time.LocalTime;

import java.io.IOException;
import java.util.Base64;

import static org.joda.time.DateTime.now;

public class AccessToken {
    @SerializedName("access_token")
    private String accessToken;

    @SerializedName("token_type")
    private String tokenType;

    @SerializedName("expires_in")
    private String expiresIn;

    @SerializedName("pay_load")
    private Jwt payload;

    @SerializedName("time_provider")
    private LocalTime timeProvider;

    public AccessToken accessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    public AccessToken payload(Jwt payload) {
        this.payload = payload;
        return this;
    }

    public AccessToken payload(String accessToken) {
        try {
            this.payload = decodeJwt(accessToken);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public boolean isExpired() {
        return this.payload.isExpired();
    }

    private Jwt decodeJwt(String jwt) throws Exception {
        String[] segments = jwt.split("\\.");

        Jwt payload = null;
        if (segments.length != 3) {
            throw new Exception("Invalid Token");
        }

        String decodedPayload = new String(Base64.getDecoder().decode(segments[1]));
        try {
            payload = (new ObjectMapper()).readValue(decodedPayload, Jwt.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return payload;
    }
}
