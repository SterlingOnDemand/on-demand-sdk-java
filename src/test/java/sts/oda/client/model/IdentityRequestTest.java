package sts.oda.client.model;

import sts.oda.client.api.BaseTest;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IdentityRequestTest extends BaseTest {
    private static IdentityRequest subject;
    /**
     * Setup before running any test case
     */
    @BeforeClass
    public static void setUpBeforeClass()
    {
        subject = new IdentityRequest();
        subject.candidateId("candidate_id");
        subject.type("type");
    }

    /**
     * Test "IdentityRequest"
     */
    @Test
    public void testIdentityRequest()
    {
        String expectedJson = "{\n" +
                "  \"candidateId\": \"candidate_id\",\n" +
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
     * Test attribute "type"
     */
    @Test
    public void testPropertyType()
    {
        assertEquals("type", subject.getType());
    }
}
