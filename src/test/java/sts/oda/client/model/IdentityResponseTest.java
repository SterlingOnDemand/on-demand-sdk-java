package sts.oda.client.model;

import sts.oda.client.api.BaseTest;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IdentityResponseTest extends BaseTest {
    private static IdentityResponse subject;
    /**
     * Setup before running any test case
     */
    @BeforeClass
    public static void setUpBeforeClass()
    {
        subject = new IdentityResponse();
        subject.candidateId("candidate_id");
        subject.id("id");
        subject.kba(new KnowledgeBasedAnswer());
        subject.status("status");
        subject.type("type");
    }
    /**
     * Test "IdentityResponse"
     */
    @Test
    public void testIdentityResponse()
    {
        String expectedJson = "{\n" +
                "  \"candidateId\": \"candidate_id\",\n" +
                "  \"id\": \"id\",\n" +
                "  \"kba\": {},\n" +
                "  \"status\": \"status\",\n" +
                "  \"type\": \"type\"\n" +
                "}";
        assertEquals(expectedJson, gson.toJson(subject));
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
     * Test attribute "id"
     */
    @Test
    public void testPropertyId()
    {
        assertEquals("id", subject.getId());
    }

    /**
     * Test attribute "kba"
     */
    @Test
    public void testPropertyKba()
    {
        assertEquals(new KnowledgeBasedAnswer(), subject.getKba());
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
}
