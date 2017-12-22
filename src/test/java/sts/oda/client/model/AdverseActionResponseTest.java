package sts.oda.client.model;

import sts.oda.client.api.BaseTest;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class AdverseActionResponseTest extends BaseTest {

    private static AdverseActionResponse adverseActionResponse;

    /**
     * Setup before running any test case
     */
    @BeforeClass
    public static void setUpBeforeClass()
    {
        adverseActionResponse = new AdverseActionResponse();
        adverseActionResponse.id("id");
        adverseActionResponse.status("status");
        adverseActionResponse.updatedAt(new DateTime(1, DateTimeZone.UTC));
    }

    /**
     * Test "AdverseActionResponse"
     */
    @Test
    public void testAdverseActionResponse() throws IOException
    {

        String expectedJson = "{\n" +
                "  \"id\": \"id\",\n" +
                "  \"status\": \"status\",\n" +
                "  \"updatedAt\": \"1970-01-01T00:00:01+00:00\"\n" +
                "}";
        OBJECT_MAPPER.readValue(expectedJson, adverseActionResponse.getClass());
}


    /**
     * Test attribute "id"
     */
    @Test
    public void testPropertyId()
    {
        assertEquals("id", adverseActionResponse.getId());
    }

    /**
     * Test attribute "status"
     */
    @Test
    public void testPropertyStatus()
    {
        assertEquals("status", adverseActionResponse.getStatus());

    }

    /**
     * Test attribute "updated_at"
     */
    @Test
    public void testPropertyUpdatedAt()
    {
        assertEquals(1, adverseActionResponse.getUpdatedAt().getMillis());
    }

}
