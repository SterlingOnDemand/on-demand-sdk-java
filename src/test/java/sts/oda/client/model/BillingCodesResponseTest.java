package sts.oda.client.model;

import sts.oda.client.api.BaseTest;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BillingCodesResponseTest extends BaseTest {

    private static BillingCodesResponse subject;

    /**
     * Setup before running any test case
     */
    @BeforeClass
    public static void setUpBeforeClass()
    {
        subject = new BillingCodesResponse();
        subject.addBillingCodesItem("1");
        subject.addBillingCodesItem("2");
    }

    /**
     * Test "BillingCodesResponse"
     */
    @Test
    public void testBillingCodesResponse()
    {
        String expectedJson = "{\n" +
                "  \"billingCodes\": [\n" +
                "    \"1\",\n" +
                "    \"2\"\n" +
                "  ]\n" +
                "}";
    assertEquals(expectedJson, gson.toJson(subject));
}

    /**
     * Test attribute "billing_codes"
     */
    @Test
    public void testPropertyBillingCodes()
    {
        assertEquals("1", subject.getBillingCodes().get(0));
        assertEquals("2", subject.getBillingCodes().get(1));
    }
}
