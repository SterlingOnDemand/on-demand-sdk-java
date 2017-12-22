package sts.oda.client.model;

import sts.oda.client.api.BaseTest;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PackageResponseTest extends BaseTest {
    private static PackageResponse subject;
    /**
     * Setup before running any test case
     */
    @BeforeClass
    public static void setUpBeforeClass()
    {
        List<String> components = new ArrayList<String>();
        components.add("components");
        List<String> requiredFields = new ArrayList<String>();
        requiredFields.add("required_fields");
        subject = new PackageResponse();
        subject.active(true);
        subject.components(components);
        subject.id("id");
        subject.requiredFields(requiredFields);
        subject.supported(true);
        subject.title("title");
    }

    /**
     * Test "PackageResponse"
     */
    @Test
    public void testPackageResponse()
    {
        String expectedJson = "{\n" +
                "  \"active\": true,\n" +
                "  \"components\": [\n" +
                "    \"components\"\n" +
                "  ],\n" +
                "  \"id\": \"id\",\n" +
                "  \"requiredFields\": [\n" +
                "    \"required_fields\"\n" +
                "  ],\n" +
                "  \"supported\": true,\n" +
                "  \"title\": \"title\"\n" +
                "}";
        assertEquals(expectedJson, gson.toJson(subject));
}

    /**
     * Test attribute "active"
     */
    @Test
    public void testPropertyActive()
    {
        assertEquals(true, subject.getActive());
    }

    /**
     * Test attribute "components"
     */
    @Test
    public void testPropertyComponents()
    {
        assertEquals("components", subject.getComponents().get(0));
    }

    /**
     * Test attribute "id"
     */
    @Test
    public void testPropertyId()
    {
        assertEquals("id", subject.getId());
    }

    /**
     * Test attribute "required_fields"
     */
    @Test
    public void testPropertyRequiredFields()
    {
        assertEquals("required_fields", subject.getRequiredFields().get(0));
    }

    /**
     * Test attribute "supported"
     */
    @Test
    public void testPropertySupported()
    {
        assertEquals(true, subject.getSupported());
    }

    /**
     * Test attribute "title"
     */
    @Test
    public void testPropertyTitle()
    {
        assertEquals("title", subject.getTitle());
    }
}
