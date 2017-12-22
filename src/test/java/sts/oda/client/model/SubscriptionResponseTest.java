package sts.oda.client.model;

import sts.oda.client.api.BaseTest;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class SubscriptionResponseTest extends BaseTest {
    private static SubscriptionResponse subject;
    /**
     * Setup before running any test case
     */
    @BeforeClass
    public static void setUpBeforeClass()
    {
        subject = new SubscriptionResponse();
        subject.createdAt(new DateTime(0, DateTimeZone.UTC));
        subject.id("id");
        subject.metrics(new Metrics());
        subject.nextRunAt(new DateTime(0, DateTimeZone.UTC));
        subject.schedule(new Schedule());
        subject.screening(new ScreeningRequest());
        subject.status("status");
        subject.updatedAt(new DateTime(0, DateTimeZone.UTC));
    }
    /**
     * Test "SubscriptionResponse"
     */
    @Test
    public void testSubscriptionResponse() throws IOException {
        String expectedJson = "{\n" +
                "  \"createdAt\": \"1970-01-01T00:00:00+00:00\",\n" +
                "  \"id\": \"id\",\n" +
                "  \"metrics\": {},\n" +
                "  \"nextRunAt\": \"1970-01-01T00:00:00+00:00\",\n" +
                "  \"schedule\": {},\n" +
                "  \"screening\": {},\n" +
                "  \"status\": \"status\",\n" +
                "  \"updatedAt\": \"1970-01-01T00:00:00+00:00\"\n" +
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
     * Test attribute "id"
     */
    @Test
    public void testPropertyId()
    {
        assertEquals("id", subject.getId());
    }

    /**
     * Test attribute "metrics"
     */
    @Test
    public void testPropertyMetrics()
    {
        assertEquals(new Metrics(), subject.getMetrics());
    }

    /**
     * Test attribute "next_run_at"
     */
    @Test
    public void testPropertyNextRunAt()
    {
        assertEquals(0, subject.getNextRunAt().getMillis());
    }

    /**
     * Test attribute "schedule"
     */
    @Test
    public void testPropertySchedule()
    {
        assertEquals(new Schedule(), subject.getSchedule());
    }

    /**
     * Test attribute "screening"
     */
    @Test
    public void testPropertyScreening()
    {
        assertEquals(new ScreeningRequest(), subject.getScreening());
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
     * Test attribute "updated_at"
     */
    @Test
    public void testPropertyUpdatedAt()
    {
        assertEquals(0, subject.getUpdatedAt().getMillis());
    }
}
