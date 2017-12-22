package sts.oda.client.integration;

import sts.oda.client.ApiException;
import sts.oda.client.model.*;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ScreeningIntTest extends BaseIntegrationTest {

    public ScreeningIntTest()
    {
        super();
    }

    @Test
    public void test_createAndGet() throws ApiException {
        CandidateRequest candidateRequest = this.makeCandidateRequest();
        CandidateResponse createdCandidate = apiInstance.candidatesPost(candidateRequest);
        assertNotNull(createdCandidate.getId());

        PackageResponse ssnOnlyPackage = this.findSsnOnlyPackage();
        assertNotNull(ssnOnlyPackage);

        ScreeningRequest screeningRequest = this.makeScreeningRequest(createdCandidate.getId(), ssnOnlyPackage.getId());
        ScreeningResponse screeningResponse =  apiInstance.screeningsPost(screeningRequest, "");

        assertEquals(screeningRequest.getCandidateId(), screeningResponse.getCandidateId());
        assertEquals(screeningRequest.getPackageId(), screeningResponse.getPackageId());
        assertNotNull(screeningResponse.getId());
        assertEquals(createdCandidate.getId(), screeningResponse.getCandidateId());
        assertNotNull(screeningResponse.getLinks());
        assertNotNull(screeningResponse.getResult());
        assertNotNull(screeningResponse.getReportItems());
        assertNotNull(screeningResponse.getStatus());
        assertIsDateTime(screeningResponse.getSubmittedAt());
        assertIsDateTime(screeningResponse.getUpdatedAt());
    }

    private ScreeningRequest makeScreeningRequest(String candidateId, String packageId) {
        ScreeningRequest screeningRequestData =  new ScreeningRequest();
        screeningRequestData.candidateId(candidateId);
        screeningRequestData.packageId(packageId);
        return screeningRequestData;
    }

    private PackageResponse findSsnOnlyPackage() throws ApiException {
        List<PackageResponse> packagesResponses = apiInstance.packagesGet("false");
        for(PackageResponse packagesResponse : packagesResponses) {
            if (packagesResponse.getTitle().equalsIgnoreCase("SSN Trace Only")) {
                return packagesResponse;
            }
        }
        return null;
    }
}
