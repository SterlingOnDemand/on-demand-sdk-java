package sts.oda.client.model;

import sts.oda.client.api.BaseTest;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PackagePriceResponseTest extends BaseTest {
    private static PackagePriceResponse subject;
    /**
     * Setup before running any test case
     */
    @BeforeClass
    public static void setUpBeforeClass()
    {
        subject = new PackagePriceResponse();
        subject.currencyType("currency_type");
        subject.total(12.34);
    }
    /**
     * Test "PackagePriceResponse"
     */
    @Test
    public void testPackagePriceResponse()
    {
        String expectedJson = "{\n" +
                "  \"currencyType\": \"currency_type\",\n" +
                "  \"total\": 12.34\n" +
                "}";
        assertEquals(expectedJson, gson.toJson(subject));
}

    /**
     * Test attribute "currency_type"
     */
    @Test
    public void testPropertyCurrencyType()
    {
        assertEquals("currency_type", subject.getCurrencyType());
    }

    /**
     * Test attribute "total"
     */
    @Test
    public void testPropertyTotal()
    {
        assertEquals(12.34, subject.getTotal().doubleValue(), 0.00001);
    }
}
