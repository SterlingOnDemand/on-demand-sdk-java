package sts.oda.client.integration;

import sts.oda.client.ApiClient;
import sts.oda.client.ApiException;
import sts.oda.client.api.DefaultApi;
import sts.oda.client.auth.AuthClient;
import sts.oda.client.model.*;
import org.joda.time.DateTime;


import static org.junit.Assert.fail;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.Assert.assertTrue;

public class BaseIntegrationTest {

    protected static DefaultApi apiInstance;

    public BaseIntegrationTest(){
        boolean isProd = false;
        String env = (isProd) ? "api" : "api-int";
        String basicCredentials = System.getenv("credentials");
        if (basicCredentials == null || basicCredentials.equals("")) {
            fail("'credentials' env var not set. Cannot run integration tests. Please set 'credentials' or @ignore the integration tests");
            return;
        }

        AuthClient authClient = new AuthClient(String.format("https://%s.kennect.com/oauth/token", env), basicCredentials);
        AccessToken accessToken;

        try {
            accessToken = authClient.auth();
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthClient#auth");
            e.printStackTrace();
            return;
        }

        ApiClient apiClient = new ApiClient()
                .addDefaultHeader("Authorization", String.format("Bearer %s", accessToken.getAccessToken()))
                .setBasePath(String.format("https://%s.kennect.com/v1", env));

        apiInstance = new DefaultApi(apiClient);
    }


    protected CandidateRequest makeCandidateRequest() {

        Address candidateAddress = new Address();
        candidateAddress.addressLine("222333 PEACHTREE PLACE");
        candidateAddress.countryCode("US");
        candidateAddress.municipality("ATLANTA");
        candidateAddress.postalCode("30318");
        candidateAddress.regionCode("US-GA");

        CandidateAlias candidateAlias = new CandidateAlias();
        candidateAlias.confirmedNoMiddleName(false);
        candidateAlias.familyName("FamilyNameAlias1");
        candidateAlias.givenName("GivenAlias1");
        candidateAlias.middleName("MiddleNameAlias1");

        DriversLicense driversLicense = new DriversLicense();
        driversLicense.licenseNumber("A1234567");
        driversLicense.issuingAgency("CA");
        driversLicense.type("personal");

        List<CandidateAlias> candidateAliases = new ArrayList<CandidateAlias>();
        candidateAliases.add(candidateAlias);
        CandidateRequest candidateRequest = new CandidateRequest();
        candidateRequest.address(candidateAddress);
        candidateRequest.aliases(candidateAliases);
        candidateRequest.clientReferenceId(UUID.randomUUID().toString());
        candidateRequest.confirmedNoMiddleName(true);
        candidateRequest.dob("1975-02-28");
        candidateRequest.driversLicense(driversLicense);
        candidateRequest.email(UUID.randomUUID().toString()+"@example.com");
        candidateRequest.familyName("McFamilyName");
        candidateRequest.givenName("FirstName");
        candidateRequest.phone("+12121231234");
        candidateRequest.ssn("691221234");
        return candidateRequest;
    }

    protected void assertIsDateTime(DateTime actual) {
        assertTrue(actual instanceof DateTime);
    }


}
