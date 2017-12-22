package sts.oda.client.model;

import sts.oda.client.api.BaseTest;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class ScheduleTest extends BaseTest {
    private static Schedule subject;
    /**
     * Setup before running any test case
     */
    @BeforeClass
    public static void setUpBeforeClass()
    {
        subject = new Schedule();
        subject.endAt(new DateTime(0, DateTimeZone.UTC));
        subject.interval(new Interval());
        subject.startAt(new DateTime(0, DateTimeZone.UTC));
    }

    /**
     * Test "Schedule"
     */
    @Test
    public void testSchedule() throws IOException {
        String expectedJson = "{\n" +
                "  \"endAt\": \"1970-01-01T00:00:00+00:00\",\n" +
                "  \"interval\": {},\n" +
                "  \"startAt\": \"1970-01-01T00:00:00+00:00\"\n" +
                "}";
        OBJECT_MAPPER.readValue(expectedJson, subject.getClass());
}

    /**
     * Test attribute "end_at"
     */
    @Test
    public void testPropertyEndAt()
    {
        assertEquals(0, subject.getEndAt().getMillis());
    }

    /**
     * Test attribute "interval"
     */
    @Test
    public void testPropertyInterval()
    {
        assertEquals(new Interval(), subject.getInterval());
    }

    /**
     * Test attribute "start_at"
     */
    @Test
    public void testPropertyStartAt()
    {
        assertEquals(0, subject.getEndAt().getMillis());
    }
}
