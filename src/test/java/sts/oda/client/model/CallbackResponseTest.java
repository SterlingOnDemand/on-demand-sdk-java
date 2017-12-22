package sts.oda.client.model;

import sts.oda.client.api.BaseTest;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CallbackResponseTest extends BaseTest{

    private static CallbackResponse subject;

    /**
     * Setup before running any test case
     */
    @BeforeClass
    public static void setUpBeforeClass()
    {
        subject = new CallbackResponse();
        subject.uri("uri");
    }

    /**
     * Test "CallbackResponse"
     */
    @Test
    public void testCallbackResponse()
    {
        String expectedJson = "{\n" +
                "  \"uri\": \"uri\"\n" +
                "}";
        assertEquals(expectedJson, gson.toJson(subject));
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
