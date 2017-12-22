package sts.oda.client.model;

import sts.oda.client.api.BaseTest;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class ScreeningResponseReportItemTest extends BaseTest {
    private static ScreeningResponseReportItem subject;
    /**
     * Setup before running any test case
     */
    @BeforeClass
    public static void setUpBeforeClass()
    {
        subject = new ScreeningResponseReportItem();
        subject.id("id");
        subject.result("result");
        subject.status("status");
        subject.type("type");
        subject.updatedAt(new DateTime(0, DateTimeZone.UTC));
    }
    /**
     * Test "ScreeningResponseReportItem"
     */
    @Test
    public void testScreeningResponseReportItem() throws IOException {
        String expectedJson = "{\n" +
                "  \"id\": \"id\",\n" +
                "  \"result\": \"result\",\n" +
                "  \"status\": \"status\",\n" +
                "  \"type\": \"type\",\n" +
                "  \"updatedAt\": \"1970-01-01T00:00:00+00:00\"\n" +
                "}";
        OBJECT_MAPPER.readValue(expectedJson, subject.getClass());
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
     * Test attribute "result"
     */
    @Test
    public void testPropertyResult()
    {
        assertEquals("result", subject.getResult());
    }

    /**
     * Test attribute "status"
     */
    @Test
    public void testPropertyStatus()
    {
        assertEquals("status", subject.getStatus());
    }

    /**
     * Test attribute "type"
     */
    @Test
    public void testPropertyType()
    {
        assertEquals("type", subject.getType());
    }

    /**
     * Test attribute "updated_at"
     */
    @Test
    public void testPropertyUpdatedAt()
    {
        assertEquals(0, subject.getUpdatedAt().getMillis());
    }

}
