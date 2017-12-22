/*
 * Copyright 2017 Sterling Talent Solutions
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import sts.oda.client.*;
import sts.oda.client.auth.*;
import sts.oda.client.model.*;
import sts.oda.client.api.DefaultApi;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


public class Example {

    public static void main(String[] args) {
        boolean isProd = false;//set to true to use production endpoints
        String env = (isProd) ? "api" : "api-int";
        String basicCredentials = System.getenv("credentials");//pulls auth credentials from env

        ////
        /// AUTHORIZING
        ///
        if(basicCredentials == null || basicCredentials.isEmpty()){
            System.err.println("Credentials not set");
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

        ////
        // SET UP API CLIENT
        ////
        ApiClient apiClient = new ApiClient()
            .addDefaultHeader("Authorization", String.format("Bearer %s", accessToken.getAccessToken()))
            .setBasePath(String.format("https://%s.kennect.com/v1", env));

        DefaultApi apiInstance = new DefaultApi(apiClient);
        try {
            BillingCodesResponse result = apiInstance.billingCodesGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#billingCodesGet");
            e.printStackTrace();
            return;
        }



        ////
        //CREATE CANDIDATE
        ////
        Address candidateAddress = new Address();
        CandidateAlias candidateAlias = new CandidateAlias();
        DriversLicense driversLicense = new DriversLicense();
        CandidateRequest candidateRequest = new CandidateRequest();
        List<CandidateAlias> candidateAliases = new ArrayList<CandidateAlias>();

        candidateAddress.addressLine("222333 PEACHTREE PLACE");
        candidateAddress.countryCode("US");
        candidateAddress.municipality("ATLANTA");
        candidateAddress.postalCode("30318");
        candidateAddress.regionCode("US-GA");

        candidateAlias.confirmedNoMiddleName(false);
        candidateAlias.familyName("FamilyNameAlias1");
        candidateAlias.givenName("GivenAlias1");
        candidateAlias.middleName("MiddleNameAlias1");
        candidateAliases.add(candidateAlias);

        driversLicense.licenseNumber("A1234567");
        driversLicense.issuingAgency("CA");
        driversLicense.type("personal");

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
        candidateRequest.ssn("691221234"); //This SSN is fake

        CandidateResponse candidateResponse = null;

        try{
            candidateResponse = apiInstance.candidatesPost(candidateRequest);
            System.out.println(candidateResponse);
        }catch(ApiException e){
            System.err.println("Exception when calling DefaultApi#candidatesPost");
            e.printStackTrace();
            return;
        }

        ////
        // CHECK PACKAGES
        ////
        List<PackageResponse> packageResponses = null;
        try{
            packageResponses = apiInstance.packagesGet("false");
            System.out.println("Number of Packages:"+packageResponses.size());
        }catch(ApiException e){
            System.err.println("Exception when calling DefaultApi#packagesGet");
            e.printStackTrace();
            return;
        }

        String ssnTracePackageId = null;

        if(packageResponses != null && packageResponses.size()>0){
            for(PackageResponse packageResponse : packageResponses){
                List<String> components = packageResponse.getComponents();
                if(components.size() == 1 && components.get(0).equals("SSN Trace")){
                    System.out.println(packageResponse);
                    ssnTracePackageId = packageResponse.getId();
                    System.out.println("ID of the 'SSN Trace Only' Package: "+ssnTracePackageId);
                    break;
                }
            }
        }

        if(ssnTracePackageId == null){
            System.err.println("Cannot find a package containing just an \"SSN Trace\" component");
            return;
        }

        ////
        //CREATE SCREENING
        ////
        CallbackRequest callbackRequest = new CallbackRequest();
        ScreeningRequest screeningRequest = new ScreeningRequest();

        //WARNING: This URL is for demonstration only, it is visible to the public. It should only be used with mock information.
        callbackRequest.uri("https://requestb.in/v9nhx1v9");

        if(candidateResponse != null){
            screeningRequest.candidateId(candidateResponse.getId());
        }
        screeningRequest.packageId(ssnTracePackageId);
        screeningRequest.callback(callbackRequest);

        try{
            ScreeningResponse screeningResponse = apiInstance.screeningsPost(screeningRequest,"");
            System.out.println("Screening Created");
            System.out.println(screeningResponse);
        }catch(ApiException e){
            System.err.println("Exception when calling DefaultApi#screeningsPost");
            e.printStackTrace();
            return;
        }


    }

}