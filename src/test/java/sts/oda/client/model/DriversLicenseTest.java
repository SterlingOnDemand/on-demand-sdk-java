package sts.oda.client.model;

import sts.oda.client.api.BaseTest;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DriversLicenseTest extends BaseTest {
    private static DriversLicense subject;

    /**
     * Setup before running any test case
     */
    @BeforeClass
    public static void setUpBeforeClass()
    {
        subject = new DriversLicense();
        subject.issuingAgency("issuing_agency");
        subject.licenseNumber("license_number");
        subject.type("type");
    }
    /**
     * Test "DriversLicense"
     */
    @Test
    public void testDriversLicense()
    {
        String expectedJson = "{\n" +
                "  \"issuingAgency\": \"issuing_agency\",\n" +
                "  \"licenseNumber\": \"license_number\",\n" +
                "  \"type\": \"type\"\n" +
                "}";
        assertEquals(expectedJson, gson.toJson(subject));
}

    /**
     * Test attribute "issuing_agency"
     */
    @Test
    public void testPropertyIssuingAgency()
    {
        assertEquals("issuing_agency", subject.getIssuingAgency());
    }

    /**
     * Test attribute "license_number"
     */
    @Test
    public void testPropertyLicenseNumber()
    {
        assertEquals("license_number", subject.getLicenseNumber());
    }

    /**
     * Test attribute "type"
     */
    @Test
    public void testPropertyType()
    {
        assertEquals("type", subject.getType());
    }
}
