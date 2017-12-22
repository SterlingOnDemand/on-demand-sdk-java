package sts.oda.client.model;

import sts.oda.client.api.BaseTest;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ScreeningRequestTest extends BaseTest {
    private static ScreeningRequest subject;
    /**
     * Setup before running any test case
     */
    @BeforeClass
    public static void setUpBeforeClass()
    {
        List<ReferenceCode> referenceCodes = new ArrayList<ReferenceCode>();
        referenceCodes.add(new ReferenceCode());
        subject = new ScreeningRequest();
        subject.billingCode("billing_code");
        subject.callback(new CallbackRequest());
        subject.candidateId("candidate_id");
        subject.invite(new Invite());
        subject.packageId("package_id");
        subject.referenceCodes(referenceCodes);
        subject.trustedUserId("trusted_user_id");
    }
    /**
     * Test "ScreeningRequest"
     */
    @Test
    public void testScreeningRequest()
    {
        String expectedJson = "{\n" +
                "  \"billingCode\": \"billing_code\",\n" +
                "  \"callback\": {},\n" +
                "  \"candidateId\": \"candidate_id\",\n" +
                "  \"invite\": {},\n" +
                "  \"packageId\": \"package_id\",\n" +
                "  \"referenceCodes\": [\n" +
                "    {}\n" +
                "  ],\n" +
                "  \"trustedUserId\": \"trusted_user_id\"\n" +
                "}";
        assertEquals(expectedJson, gson.toJson(subject));
}

    /**
     * Test attribute "billing_code"
     */
    @Test
    public void testPropertyBillingCode()
    {
        assertEquals("billing_code", subject.getBillingCode());
    }

    /**
     * Test attribute "callback"
     */
    @Test
    public void testPropertyCallback()
    {
        assertEquals(new CallbackRequest(), subject.getCallback());
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
     * Test attribute "invite"
     */
    @Test
    public void testPropertyInvite()
    {
        assertEquals(new Invite(), subject.getInvite());
    }

    /**
     * Test attribute "package_id"
     */
    @Test
    public void testPropertyPackageId()
    {
        assertEquals("package_id", subject.getPackageId());
    }

    /**
     * Test attribute "reference_codes"
     */
    @Test
    public void testPropertyReferenceCodes()
    {
        assertEquals(new ReferenceCode(), subject.getReferenceCodes().get(0));
    }

    /**
     * Test attribute "trusted_user_id"
     */
    @Test
    public void testPropertyTrustedUserId()
    {
        assertEquals("trusted_user_id", subject.getTrustedUserId());
    }
}
