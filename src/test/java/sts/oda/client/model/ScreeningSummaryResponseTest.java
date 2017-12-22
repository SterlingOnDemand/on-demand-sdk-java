package sts.oda.client.model;

import sts.oda.client.api.BaseTest;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class ScreeningSummaryResponseTest extends BaseTest {
    private static ScreeningSummaryResponse subject;
    /**
     * Setup before running any test case
     */
    @BeforeClass
    public static void setUpBeforeClass()
    {
        subject = new ScreeningSummaryResponse();
        subject.candidate(new CandidateResponse());
        subject.id("id");
        subject.status("status");
        subject.submittedAt(new DateTime(0, DateTimeZone.UTC));
        subject.updatedAt(new DateTime(0, DateTimeZone.UTC));
    }
    /**
     * Test "ScreeningSummaryResponse"
     */
    @Test
    public void testScreeningSummaryResponse() throws IOException {
        String expectedJson = "{\n" +
                "  \"candidate\": {},\n" +
                "  \"id\": \"id\",\n" +
                "  \"status\": \"status\",\n" +
                "  \"submittedAt\": \"1970-01-01T00:00:00+00:00\",\n" +
                "  \"updatedAt\": \"1970-01-01T00:00:00+00:00\"\n" +
                "}";
        OBJECT_MAPPER.readValue(expectedJson, subject.getClass());
    }

    /**
     * Test attribute "candidate"
     */
    @Test
    public void testPropertyCandidate()
    {
        assertEquals(new CandidateResponse(), subject.getCandidate());
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
     * Test attribute "status"
     */
    @Test
    public void testPropertyStatus()
    {
        assertEquals("status", subject.getStatus());
    }

    /**
     * Test attribute "submitted_at"
     */
    @Test
    public void testPropertySubmittedAt()
    {
        assertEquals(0, subject.getSubmittedAt().getMillis());
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
