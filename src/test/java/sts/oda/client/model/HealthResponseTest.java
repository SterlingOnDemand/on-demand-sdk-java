package sts.oda.client.model;

import sts.oda.client.api.BaseTest;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HealthResponseTest extends BaseTest {
    private static HealthResponse subject;
    /**
     * Setup before running any test case
     */
    @BeforeClass
    public static void setUpBeforeClass()
    {
        subject = new HealthResponse();
    }
    /**
     * Test "HealthResponse"
     */
    @Test
    public void testHealthResponse()
    {
        String expectedJson = "{}";
        assertEquals(expectedJson, gson.toJson(subject));
    }
}
