package sts.oda.client.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import sts.oda.client.api.BaseTest;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddressTest extends BaseTest {
    private static Address address;
    private Gson gson = new GsonBuilder().setPrettyPrinting().create();

    /**
     * Setup before running any test case
     */
    @BeforeClass
    public static void setUpBeforeClass()
    {
        address = new Address();
        address.addressLine("addressLine");
        address.countryCode("countryCode");
        address.municipality("municipality");
        address.postalCode("postalCode");
        address.regionCode("regionCode");
    }

    /**
     * Test "Address"
     */
    @Test
    public void testAddress()
    {
        String expectedJson = "{\n" +
                "  \"addressLine\": \"addressLine\",\n" +
                "  \"countryCode\": \"countryCode\",\n" +
                "  \"municipality\": \"municipality\",\n" +
                "  \"postalCode\": \"postalCode\",\n" +
                "  \"regionCode\": \"regionCode\"\n" +
                "}";
        assertEquals(expectedJson, gson.toJson(address));
    }

    /**
     * Test attribute "address_line"
     */
    @Test
    public void testPropertyAddressLine()
    {
        assertEquals("addressLine", address.getAddressLine());
    }

    /**
     * Test attribute "country_code"
     */
    @Test
    public void testPropertyCountryCode()
    {
        assertEquals("countryCode", address.getCountryCode());
    }

    /**
     * Test attribute "municipality"
     */
    @Test
    public void testPropertyMunicipality()
    {
        assertEquals("municipality", address.getMunicipality());
    }

    /**
     * Test attribute "postal_code"
     */
    @Test
    public void testPropertyPostalCode()
    {
        assertEquals("postalCode", address.getPostalCode());
    }

    /**
     * Test attribute "region_code"
     */
    @Test
    public void testPropertyRegionCode()
    {
        assertEquals("regionCode", address.getRegionCode());
    }

}
