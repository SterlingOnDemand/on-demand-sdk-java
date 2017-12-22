package sts.oda.client.model;

import sts.oda.client.api.BaseTest;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class DisputeTest extends BaseTest{
    private static Dispute subject;
    /**
     * Setup before running any test case
     */
    @BeforeClass
    public static void setUpBeforeClass()
    {
        subject = new Dispute();
        subject.createdAt(new DateTime(0, DateTimeZone.UTC));
        subject.deactivatedAt(new DateTime(0, DateTimeZone.UTC));
        subject.status("status");
    }

    /**
     * Test "Dispute"
     */
    @Test
    public void testDispute() throws IOException {
        String expectedJson = "{\n" +
                "  \"createdAt\": \"1970-01-01T00:00:00+00:00\",\n" +
                "  \"deactivatedAt\": \"1970-01-01T00:00:00+00:00\",\n" +
                "  \"status\": \"status\"\n" +
                "}";
        OBJECT_MAPPER.readValue(expectedJson, subject.getClass());
}

    /**
     * Test attribute "created_at"
     */
    @Test
    public void testPropertyCreatedAt()
    {
        assertEquals(0, subject.getCreatedAt().getMillis());
    }

    /**
     * Test attribute "deactivated_at"
     */
    @Test
    public void testPropertyDeactivatedAt()
    {
        assertEquals(0, subject.getDeactivatedAt().getMillis());
    }

    /**
     * Test attribute "status"
     */
    @Test
    public void testPropertyStatus()
    {
        assertEquals("status", subject.getStatus());
    }
}
