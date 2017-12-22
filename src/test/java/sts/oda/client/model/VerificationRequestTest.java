package sts.oda.client.model;

import sts.oda.client.api.BaseTest;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VerificationRequestTest extends BaseTest {
    private static VerificationRequest subject;
    /**
     * Setup before running any test case
     */
    @BeforeClass
    public static void setUpBeforeClass()
    {
        subject = new VerificationRequest();
        subject.kba(new KnowledgeBasedAnswer());
    }
    /**
     * Test "VerificationRequest"
     */
    @Test
    public void testVerificationRequest()
    {
        String expectedJson = "{\n" +
                "  \"kba\": {}\n" +
                "}";
        assertEquals(expectedJson, gson.toJson(subject));
}

    /**
     * Test attribute "kba"
     */
    @Test
    public void testPropertyKba()
    {
        assertEquals(new KnowledgeBasedAnswer(), subject.getKba());
    }
}
