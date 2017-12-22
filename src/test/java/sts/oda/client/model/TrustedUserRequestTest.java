package sts.oda.client.model;

import sts.oda.client.api.BaseTest;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrustedUserRequestTest extends BaseTest {
    private static TrustedUserRequest subject;
    /**
     * Setup before running any test case
     */
    @BeforeClass
    public static void setUpBeforeClass()
    {
        subject = new TrustedUserRequest();
        subject.identityId("identity_id");
    }

    /**
     * Test "TrustedUserRequest"
     */
    @Test
    public void testTrustedUserRequest()
    {
        String expectedJson = "{\n" +
                "  \"identityId\": \"identity_id\"\n" +
                "}";
        assertEquals(expectedJson, gson.toJson(subject));
}

    /**
     * Test attribute "identity_id"
     */
    @Test
    public void testPropertyIdentityId()
    {
        assertEquals("identity_id", subject.getIdentityId());
    }
}
