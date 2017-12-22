package sts.oda.client.model;

import sts.oda.client.api.BaseTest;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ErrorResponseTest extends BaseTest {
    private static ErrorResponse subject;
    /**
     * Setup before running any test case
     */
    @BeforeClass
    public static void setUpBeforeClass()
    {
        List<ErrorDetail> errorDetails = new ArrayList<ErrorDetail>();
        errorDetails.add(new ErrorDetail());
        subject = new ErrorResponse();
        subject.errors(errorDetails);
    }

    /**
     * Test "ErrorResponse"
     */
    @Test
    public void testErrorResponse()
    {
        String expectedJson = "{\n" +
                "  \"errors\": [\n" +
                "    {}\n" +
                "  ]\n" +
                "}";
        assertEquals(expectedJson, gson.toJson(subject));
    }

    /**
     * Test attribute "errors"
     */
    @Test
    public void testPropertyErrors()
    {
        assertEquals(new ErrorDetail(), subject.getErrors().get(0));
    }
}
