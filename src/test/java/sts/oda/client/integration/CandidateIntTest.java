package sts.oda.client.integration;

import sts.oda.client.ApiException;
import sts.oda.client.model.CandidateRequest;
import sts.oda.client.model.CandidateResponse;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CandidateIntTest extends BaseIntegrationTest {

    public CandidateIntTest(){
        super();
    }

    @Test
    public void test_CreateAndGet() throws ApiException{
        CandidateRequest candidateRequest = makeCandidateRequest();
        CandidateResponse createdCandidate = assertCreateCandidate(candidateRequest);

        assertGetCandidate(candidateRequest, createdCandidate.getId());
    }

    private CandidateResponse assertCreateCandidate(CandidateRequest candidateRequest) throws ApiException {
        CandidateResponse candidateResponse = apiInstance.candidatesPost(candidateRequest);

        assertEquals(candidateRequest.getAddress(), candidateResponse.getAddress());
        assertEquals(candidateRequest.getAliases(), candidateResponse.getAliases());
        assertEquals(candidateRequest.getClientReferenceId(), candidateResponse.getClientReferenceId());
        assertEquals(candidateRequest.getConfirmedNoMiddleName(), candidateResponse.getConfirmedNoMiddleName());
        assertEquals(candidateRequest.getDob(), candidateResponse.getDob());
        assertEquals(candidateRequest.getDriversLicense(), candidateResponse.getDriversLicense());
        assertEquals(candidateRequest.getEmail(), candidateResponse.getEmail());
        assertEquals(candidateRequest.getFamilyName(), candidateResponse.getFamilyName());
        assertEquals(candidateRequest.getGivenName(), candidateResponse.getGivenName());
        assertEquals(candidateRequest.getMiddleName(), candidateResponse.getMiddleName());
        assertEquals(candidateRequest.getPhone(), candidateResponse.getPhone());
        assertEquals(candidateRequest.getSsn(), candidateResponse.getSsn());
        assertNotNull(candidateResponse.getId());

        return candidateResponse;
    }

    private void assertGetCandidate(CandidateRequest expectedCandidate, String candidateId) throws ApiException {
        CandidateResponse candidateResponse = apiInstance.candidatesIdGet(candidateId);
        assertEquals(expectedCandidate.getAddress(), candidateResponse.getAddress());
        assertEquals(expectedCandidate.getAliases(), candidateResponse.getAliases());
        assertEquals(expectedCandidate.getClientReferenceId(), candidateResponse.getClientReferenceId());
        assertEquals(expectedCandidate.getConfirmedNoMiddleName(), candidateResponse.getConfirmedNoMiddleName());
        assertEquals(expectedCandidate.getDob(), candidateResponse.getDob());
        assertEquals(expectedCandidate.getDriversLicense(), candidateResponse.getDriversLicense());
        assertEquals(expectedCandidate.getEmail(), candidateResponse.getEmail());
        assertEquals(expectedCandidate.getFamilyName(), candidateResponse.getFamilyName());
        assertEquals(expectedCandidate.getGivenName(), candidateResponse.getGivenName());
        assertEquals(expectedCandidate.getMiddleName(), candidateResponse.getMiddleName());
        assertEquals(expectedCandidate.getPhone(), candidateResponse.getPhone());
        assertEquals(expectedCandidate.getSsn(), candidateResponse.getSsn());
        assertEquals(candidateId, candidateResponse.getId());
    }
}
