package sts.oda.client.model;

import sts.oda.client.api.BaseTest;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class SubscriptionScreeningTest extends BaseTest{
    private static SubscriptionScreening subject;
    /**
     * Setup before running any test case
     */
    @BeforeClass
    public static void setUpBeforeClass()
    {
        subject = new SubscriptionScreening();
        subject.createdAt(new DateTime(0, DateTimeZone.UTC));
        subject.id("id");
    }

    /**
     * Test "SubscriptionScreening"
     */
    @Test
    public void testSubscriptionScreening() throws IOException {
        String expectedJson = "{\n" +
                "  \"createdAt\": \"1970-01-01T00:00:00+00:00\",\n" +
                "  \"id\": \"id\"\n" +
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
}
