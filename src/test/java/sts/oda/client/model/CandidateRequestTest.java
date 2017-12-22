package sts.oda.client.model;

import sts.oda.client.api.BaseTest;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CandidateRequestTest extends BaseTest{

    private static CandidateRequest subject;

    /**
     * Setup before running any test case
     */
    @BeforeClass
    public static void setUpBeforeClass()
    {
        List<CandidateAlias> candidateAliasList = new ArrayList<CandidateAlias>();
        candidateAliasList.add(new CandidateAlias());
        subject = new CandidateRequest();
        subject.address(new Address());
        subject.aliases(candidateAliasList);
        subject.clientReferenceId("client_reference_id");
        subject.confirmedNoMiddleName(true);
        subject.dob("dob");
        subject.driversLicense(new DriversLicense());
        subject.email("email");
        subject.familyName("family_name");
        subject.givenName("given_name");
        subject.middleName("middle_name");
        subject.phone("phone");
        subject.ssn("ssn");
    }
    /**
     * Test "CandidateRequest"
     */
    @Test
    public void testCandidateRequest()
    {
        String expectedJson = "{\n" +
                "  \"address\": {},\n" +
                "  \"aliases\": [\n" +
                "    {}\n" +
                "  ],\n" +
                "  \"clientReferenceId\": \"client_reference_id\",\n" +
                "  \"confirmedNoMiddleName\": true,\n" +
                "  \"dob\": \"dob\",\n" +
                "  \"driversLicense\": {},\n" +
                "  \"email\": \"email\",\n" +
                "  \"familyName\": \"family_name\",\n" +
                "  \"givenName\": \"given_name\",\n" +
                "  \"middleName\": \"middle_name\",\n" +
                "  \"phone\": \"phone\",\n" +
                "  \"ssn\": \"ssn\"\n" +
                "}";
     assertEquals(expectedJson, gson.toJson(subject));
}

    /**
     * Test attribute "address"
     */
    @Test
    public void testPropertyAddress()
    {
        assertEquals(new Address(), subject.getAddress());
    }

    /**
     * Test attribute "aliases"
     */
    @Test
    public void testPropertyAliases()
    {
        assertEquals(new CandidateAlias(), subject.getAliases().get(0));
    }

    /**
     * Test attribute "client_reference_id"
     */
    @Test
    public void testPropertyClientReferenceId()
    {
        assertEquals("client_reference_id", subject.getClientReferenceId());
    }

    /**
     * Test attribute "confirmed_no_middle_name"
     */
    @Test
    public void testPropertyConfirmedNoMiddleName()
    {
        assertEquals(true, subject.getConfirmedNoMiddleName());
    }

    /**
     * Test attribute "dob"
     */
    @Test
    public void testPropertyDob()
    {
        assertEquals("dob", subject.getDob());
    }

    /**
     * Test attribute "drivers_license"
     */
    @Test
    public void testPropertyDriversLicense()
    {
        assertEquals(new DriversLicense(), subject.getDriversLicense());
    }

    /**
     * Test attribute "email"
     */
    @Test
    public void testPropertyEmail()
    {
        assertEquals("email", subject.getEmail());
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

    /**
     * Test attribute "phone"
     */
    @Test
    public void testPropertyPhone()
    {
        assertEquals("phone", subject.getPhone());
    }

    /**
     * Test attribute "ssn"
     */
    @Test
    public void testPropertySsn()
    {
        assertEquals("ssn", subject.getSsn());
    }
}
