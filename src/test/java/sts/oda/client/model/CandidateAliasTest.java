package sts.oda.client.model;

import sts.oda.client.api.BaseTest;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CandidateAliasTest extends BaseTest {

    private static CandidateAlias subject;
    /**
     * Setup before running any test case
     */
    @BeforeClass
    public static void setUpBeforeClass()
    {
        subject = new CandidateAlias();
        subject.confirmedNoMiddleName(true);
        subject.familyName("family_name");
        subject.givenName("given_name");
        subject.middleName("middle_name");
    }
    /**
     * Test "CandidateAlias"
     */
    @Test
    public void testCandidateAlias()
    {
        String expectedJson = "{\n" +
                "  \"confirmedNoMiddleName\": true,\n" +
                "  \"familyName\": \"family_name\",\n" +
                "  \"givenName\": \"given_name\",\n" +
                "  \"middleName\": \"middle_name\"\n" +
                "}";
        assertEquals(expectedJson, gson.toJson(subject));
}

    /**
     * Test attribute "confirmed_no_middle_name"
     */
    @Test
    public void testPropertyConfirmedNoMiddleName()
    {
        assertTrue( subject.getConfirmedNoMiddleName());
    }

    /**
     * Test attribute "family_name"
     */
    @Test
    public void testPropertyFamilyName()
    {
        assertEquals("family_name", subject.getFamilyName());
    }

    /**
     * Test attribute "given_name"
     */
    @Test
    public void testPropertyGivenName()
    {
        assertEquals("given_name", subject.getGivenName());
    }

    /**
     * Test attribute "middle_name"
     */
    @Test
    public void testPropertyMiddleName()
    {
        assertEquals("middle_name", subject.getMiddleName());
    }
}
