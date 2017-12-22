package sts.oda.client.model;

import sts.oda.client.api.BaseTest;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CallbackRequestTest extends BaseTest {

    private static CallbackRequest subject;

    /**
     * Setup before running any test case
     */
    @BeforeClass
    public static void setUpBeforeClass()
    {
        subject = new CallbackRequest();
        subject.credentials(new CallbackCredentials());
        subject.uri("uri");
    }

    /**
     * Test "CallbackRequest"
     */
    @Test
    public void testCallbackRequest()
    {
        String expectedJson = "{\n" +
                "  \"credentials\": {},\n" +
                "  \"uri\": \"uri\"\n" +
                "}";
        assertEquals(expectedJson, gson.toJson(subject));
}

    /**
     * Test attribute "credentials"
     */
    @Test
    public void testPropertyCredentials()
    {
        assertEquals(new CallbackCredentials(), subject.getCredentials());
    }

    /**
     * Test attribute "uri"
     */
    @Test
    public void testPropertyUri()
    {
        assertEquals("uri", subject.getUri());
    }
}
