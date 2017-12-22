package sts.oda.client.model;

import sts.oda.client.api.BaseTest;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrustedUserResponseTest extends BaseTest{
    private static TrustedUserResponse subject;
    /**
     * Setup before running any test case
     */
    @BeforeClass
    public static void setUpBeforeClass()
    {
        subject = new TrustedUserResponse();
        subject.id("id");
        subject.identityId("identity_id");
    }

    /**
     * Test "TrustedUserResponse"
     */
    @Test
    public void testTrustedUserResponse()
    {
        String expectedJson = "{\n" +
                "  \"id\": \"id\",\n" +
                "  \"identityId\": \"identity_id\"\n" +
                "}";
        assertEquals(expectedJson, gson.toJson(subject));
}

    /**
     * Test attribute "id"
     */
    @Test
    public void testPropertyId()
    {
        assertEquals("id", subject.getId());
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
