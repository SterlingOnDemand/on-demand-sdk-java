package sts.oda.client.model;

import sts.oda.client.api.BaseTest;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReferenceCodeTest extends BaseTest {
    private static ReferenceCode subject;
    /**
     * Setup before running any test case
     */
    @BeforeClass
    public static void setUpBeforeClass()
    {
        subject = new ReferenceCode();
    }
    /**
     * Test "ReferenceCode"
     */
    @Test
    public void testReferenceCode()
    {
        String expectedJson = "{}";
        assertEquals(expectedJson, gson.toJson(subject));
    }
}
