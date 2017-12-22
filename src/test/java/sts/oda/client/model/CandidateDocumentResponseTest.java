package sts.oda.client.model;

import sts.oda.client.api.BaseTest;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.TimeZone;

import static org.junit.Assert.assertEquals;

public class CandidateDocumentResponseTest extends BaseTest{

    private static CandidateDocumentResponse subject;

    /**
     * Setup before running any test case
     */
    @BeforeClass
    public static void setUpBeforeClass()
    {
        subject = new CandidateDocumentResponse();
        subject.candidateId("candidate_id");
        subject.createdAt(new DateTime(0, DateTimeZone.UTC));
        subject.fileName("file_name");
        subject.id("id");
        subject.updatedAt(new DateTime(0, DateTimeZone.UTC));
    }

    /**
     * Test "CandidateDocumentResponse"
     */
    @Test
    public void testCandidateDocumentResponse() throws IOException {
        String expectedJson = "{\n" +
                "  \"candidateId\": \"candidate_id\",\n" +
                "  \"createdAt\": \"1970-01-01T00:00:00+00:00\",\n" +
                "  \"fileName\": \"file_name\",\n" +
                "  \"id\": \"id\",\n" +
                "  \"updatedAt\": \"1970-01-01T00:00:00+00:00\"\n" +
                "}";
        OBJECT_MAPPER.readValue(expectedJson, subject.getClass());
}

    /**
     * Test attribute "candidate_id"
     */
    @Test
    public void testPropertyCandidateId()
    {
        assertEquals("candidate_id", subject.getCandidateId());
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
     * Test attribute "file_name"
     */
    @Test
    public void testPropertyFileName()
    {
        assertEquals("file_name", subject.getFileName());
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
     * Test attribute "updated_at"
     */
    @Test
    public void testPropertyUpdatedAt()
    {
        assertEquals(0, subject.getUpdatedAt().getMillis());
    }

}
