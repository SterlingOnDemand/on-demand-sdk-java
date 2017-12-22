package sts.oda.client.model;

import sts.oda.client.api.BaseTest;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ErrorDetailTest extends BaseTest {

    private static ErrorDetail subject;
    /**
     * Setup before running any test case
     */
    @BeforeClass
    public static void setUpBeforeClass()
    {
        subject = new ErrorDetail();
        subject.code("code");
        subject.message("message");
    }

    /**
     * Test "ErrorDetail"
     */
    @Test
    public void testErrorDetail()
    {
        String expectedJson = "{\n" +
                "  \"code\": \"code\",\n" +
                "  \"message\": \"message\"\n" +
                "}";
        assertEquals(expectedJson, gson.toJson(subject));
}

    /**
     * Test attribute "code"
     */
    @Test
    public void testPropertyCode()
    {
        assertEquals("code", subject.getCode());
    }

    /**
     * Test attribute "message"
     */
    @Test
    public void testPropertyMessage()
    {
        assertEquals("message", subject.getMessage());
    }
}
