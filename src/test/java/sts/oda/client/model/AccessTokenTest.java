package sts.oda.client.model;

import io.jsonwebtoken.Jwts;
import sts.oda.client.api.BaseTest;
import sts.oda.client.utils.Clock;
import sts.oda.client.utils.Jwt;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.sql.Date;
import java.time.Instant;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class AccessTokenTest extends BaseTest{

    private String jwt = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1lIjoiZm9vQGJhci5jb20iLCJlbWFpbCI6ImZvb0BiYXIuY29tIiwicm9sZXMiOltdLCJpc3MiOiJodHRwczovL3h4eC5hdXRoMC5jb20vIiwic3ViIjoiYXV0aDB8MSIsImF1ZCI6Inh4eCIsImlhdCI6MTIwOTU1Mzc1NiwiZXhwIjoxMjA5NTg5NzU2fQ.t5ATZAySPRtdIUQs9LYKIfrM5Z5vHPefi42Oiiq_NGQ";

    private static AccessToken accessToken;
    private static Clock clock;
    private static Instant past;
    private static Instant now;
    private static Instant future;


    @BeforeClass
    public static void setup(){
        clock = new Clock();
        now = Instant.now();
        past = now.minusSeconds(1200);
        future = now.plusSeconds(1200);
        accessToken = new AccessToken();
    }

    @Test
    public void testGetAccessToken()
    {
        accessToken.accessToken(this.jwt);
        assertSame(this.jwt, accessToken.getAccessToken());
    }

    @Test
    public void testIsExpired_willReturnTrueIfExpiryIsInPast() throws IOException
    {

        String jwtString = Jwts.builder()
                .setExpiration(Date.from(past))
                .compact();

        Jwt jwt = new Jwt(jwtString, clock);
        accessToken.payload(jwt);

        assertTrue(accessToken.isExpired());
    }

    @Test
    public void testIsExpired_willReturnFalseIfExpiryIsInFuture() throws IOException {
        String jwtString = Jwts.builder()
                .setExpiration(Date.from(future))
                .compact();

        Jwt jwt = new Jwt(jwtString, clock);
        accessToken.payload(jwt);

        assertFalse(accessToken.isExpired());
    }

}
