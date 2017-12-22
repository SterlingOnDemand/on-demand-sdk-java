package sts.oda.client.model;

import sts.oda.client.api.BaseTest;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ScreeningResponseTest extends BaseTest {
    private static ScreeningResponse subject;
    /**
     * Setup before running any test case
     */
    @BeforeClass
    public static void setUpBeforeClass()
    {
        List<AdverseActionResponse> adverseActionResponses = new ArrayList<AdverseActionResponse>();
        adverseActionResponses.add(new AdverseActionResponse());
        List<ReferenceCode> referenceCodes = new ArrayList<ReferenceCode>();
        referenceCodes.add(new ReferenceCode());
        List<ScreeningResponseReportItem> screeningResponseReportItems = new ArrayList<ScreeningResponseReportItem>();
        screeningResponseReportItems.add(new ScreeningResponseReportItem());
        subject = new ScreeningResponse();
        subject.adverseActions(adverseActionResponses);
        subject.billingCode("billing_code");
        subject.callback(new CallbackResponse());
        subject.candidateId("candidate_id");
        subject.clientCriteriaResult("client_criteria_result");
        subject.dispute(new Dispute());
        subject.id("id");
        subject.invite(new Invite());
        subject.links(new ScreeningResponseLink());
        subject.packageId("package_id");
        subject.referenceCodes(referenceCodes);
        subject.reportItems(screeningResponseReportItems);
        subject.result("result");
        subject.status("status");
        subject.submittedAt(new DateTime(0, DateTimeZone.UTC));
        subject.trustedUserId("trusted_user_id");
        subject.updatedAt(new DateTime(0, DateTimeZone.UTC));
    }
    /**
     * Test "ScreeningResponse"
     */
    @Test
    public void testScreeningResponse() throws IOException {
        String expectedJson = "{\n" +
                "  \"adverseActions\": [\n" +
                "    {}\n" +
                "  ],\n" +
                "  \"billingCode\": \"billing_code\",\n" +
                "  \"callback\": {},\n" +
                "  \"candidateId\": \"candidate_id\",\n" +
                "  \"clientCriteriaResult\": \"client_criteria_result\",\n" +
                "  \"dispute\": {},\n" +
                "  \"id\": \"id\",\n" +
                "  \"invite\": {},\n" +
                "  \"links\": {},\n" +
                "  \"packageId\": \"package_id\",\n" +
                "  \"referenceCodes\": [\n" +
                "    {}\n" +
                "  ],\n" +
                "  \"reportItems\": [\n" +
                "    {}\n" +
                "  ],\n" +
                "  \"result\": \"result\",\n" +
                "  \"status\": \"status\",\n" +
                "  \"submittedAt\": \"1970-01-01T00:00:00+00:00\",\n" +
                "  \"trustedUserId\": \"trusted_user_id\",\n" +
                "  \"updatedAt\": \"1970-01-01T00:00:00+00:00\"\n" +
                "}";
        OBJECT_MAPPER.readValue(expectedJson, subject.getClass());
    }

    /**
     * Test attribute "adverse_actions"
     */
    @Test
    public void testPropertyAdverseActions()
    {
        assertEquals(new AdverseActionResponse(), subject.getAdverseActions().get(0));
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
        assertEquals(new CallbackResponse(), subject.getCallback());
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
     * Test attribute "client_criteria_result"
     */
    @Test
    public void testPropertyClientCriteriaResult()
    {
        assertEquals("client_criteria_result", subject.getClientCriteriaResult());
    }

    /**
     * Test attribute "dispute"
     */
    @Test
    public void testPropertyDispute()
    {
        assertEquals(new Dispute(), subject.getDispute());
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
     * Test attribute "invite"
     */
    @Test
    public void testPropertyInvite()
    {
        assertEquals(new Invite(), subject.getInvite());
    }

    /**
     * Test attribute "links"
     */
    @Test
    public void testPropertyLinks()
    {
        assertEquals(new ScreeningResponseLink(), subject.getLinks());
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
     * Test attribute "report_items"
     */
    @Test
    public void testPropertyReportItems()
    {
        assertEquals(new ScreeningResponseReportItem(), subject.getReportItems().get(0));
    }

    /**
     * Test attribute "result"
     */
    @Test
    public void testPropertyResult()
    {
        assertEquals("result", subject.getResult());
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
     * Test attribute "trusted_user_id"
     */
    @Test
    public void testPropertyTrustedUserId()
    {
        assertEquals("trusted_user_id", subject.getTrustedUserId());
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
