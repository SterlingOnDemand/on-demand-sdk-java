package sts.oda.client.model;

import sts.oda.client.api.BaseTest;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CallbackCredentialsTest extends BaseTest {

    private static CallbackCredentials subject;

    /**
     * Setup before running any test case
     */
    @BeforeClass
    public static void setUpBeforeClass()
    {
        subject = new CallbackCredentials();
        subject.basicAuth("basic_auth");
    }

    /**
     * Test "CallbackCredentials"
     */
    @Test
    public void testCallbackCredentials()
    {
        String expectedJson = "{\n" +
                "  \"basic-auth\": \"basic_auth\"\n" +
                "}";
    assertEquals(expectedJson, gson.toJson(subject));
}

    /**
     * Test attribute "basic_auth"
     */
    @Test
    public void testPropertyBasicAuth()
    {
        assertEquals("basic_auth", subject.getBasicAuth());
    }
}
