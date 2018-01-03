# SwaggerClient-java

This SDK allows you to call the Sterling Talent Solutions On-Demand API.

## Requirements

Maven 2.3.2 or later

Java 8 JDK

## Export credentials
The example script as well as the Integration tests require valid credentials. For these scripts, the 'credentials'
environmental variable needs to be set to your API credentials. These credentials are a base64 hash of
"[apiusername]:[password]".

For example, the base64 hash of "username@yourcompany.com:somepassword" is "dXNlcm5hbWVAeW91cmNvbXBhbnkuY29tOnNvbWVwYXNzd29yZA=="


## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>sts.oda</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "sts.oda:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Running Tests

Run the tests by executing:

    mvn test



## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import sts.oda.client.*;
import sts.oda.client.auth.*;
import sts.oda.client.model.*;
import sts.oda.client.api.DefaultApi;


public class Example {

    public static void main(String[] args) {
        boolean isProd = false;//set to true to use production endpoints
        String env = (isProd) ? "api" : "api-int";
        String basicCredentials = System.getenv("credentials");//pulls auth credentials from env

        // AUTHORIZE
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

        // SET UP API CLIENT
        ApiClient apiClient = new ApiClient()
            .addDefaultHeader("Authorization", String.format("Bearer %s", accessToken.getAccessToken()))
            .setBasePath(String.format("https://%s.kennect.com/v1", env));

        DefaultApi apiInstance = new DefaultApi(apiClient);

        //TRY AN ENDPOINT
        //GET PACKAGES
        try{
            List<PackageResponse> packageResponses = apiInstance.packagesGet("false");
            System.out.println("Number of Packages:"+packageResponses.size());
        }catch(ApiException e){
            System.err.println("Exception when calling DefaultApi#packagesGet");
            e.printStackTrace();
            return;
        }
    }
}

```

### For more code examples, see also: Example.java

## Documentation for API Endpoints

All URIs are relative to *https://api-int.kennect.com/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**billingCodesGet**](docs/DefaultApi.md#billingCodesGet) | **GET** /billing-codes | 
*DefaultApi* | [**candidatesGet**](docs/DefaultApi.md#candidatesGet) | **GET** /candidates | 
*DefaultApi* | [**candidatesIdDocumentsGet**](docs/DefaultApi.md#candidatesIdDocumentsGet) | **GET** /candidates/{id}/documents | 
*DefaultApi* | [**candidatesIdDocumentsPost**](docs/DefaultApi.md#candidatesIdDocumentsPost) | **POST** /candidates/{id}/documents | 
*DefaultApi* | [**candidatesIdGet**](docs/DefaultApi.md#candidatesIdGet) | **GET** /candidates/{id} | 
*DefaultApi* | [**candidatesIdPut**](docs/DefaultApi.md#candidatesIdPut) | **PUT** /candidates/{id} | 
*DefaultApi* | [**candidatesIdTrustPost**](docs/DefaultApi.md#candidatesIdTrustPost) | **POST** /candidates/{id}/trust | 
*DefaultApi* | [**candidatesPost**](docs/DefaultApi.md#candidatesPost) | **POST** /candidates | 
*DefaultApi* | [**healthGet**](docs/DefaultApi.md#healthGet) | **GET** /health | 
*DefaultApi* | [**identitiesIdGet**](docs/DefaultApi.md#identitiesIdGet) | **GET** /identities/{id} | 
*DefaultApi* | [**identitiesIdRetryPost**](docs/DefaultApi.md#identitiesIdRetryPost) | **POST** /identities/{id}/retry | 
*DefaultApi* | [**identitiesIdVerificationPut**](docs/DefaultApi.md#identitiesIdVerificationPut) | **PUT** /identities/{id}/verification | 
*DefaultApi* | [**identitiesPost**](docs/DefaultApi.md#identitiesPost) | **POST** /identities | 
*DefaultApi* | [**packagesGet**](docs/DefaultApi.md#packagesGet) | **GET** /packages | 
*DefaultApi* | [**packagesIdPriceGet**](docs/DefaultApi.md#packagesIdPriceGet) | **GET** /packages/{id}/price | 
*DefaultApi* | [**referenceCodesGet**](docs/DefaultApi.md#referenceCodesGet) | **GET** /reference-codes | 
*DefaultApi* | [**screeningsGet**](docs/DefaultApi.md#screeningsGet) | **GET** /screenings | 
*DefaultApi* | [**screeningsIdAdverseActionsPost**](docs/DefaultApi.md#screeningsIdAdverseActionsPost) | **POST** /screenings/{id}/adverse-actions | 
*DefaultApi* | [**screeningsIdDocumentsPost**](docs/DefaultApi.md#screeningsIdDocumentsPost) | **POST** /screenings/{id}/documents | 
*DefaultApi* | [**screeningsIdGet**](docs/DefaultApi.md#screeningsIdGet) | **GET** /screenings/{id} | 
*DefaultApi* | [**screeningsIdInvitePost**](docs/DefaultApi.md#screeningsIdInvitePost) | **POST** /screenings/{id}/invite | 
*DefaultApi* | [**screeningsIdReportGet**](docs/DefaultApi.md#screeningsIdReportGet) | **GET** /screenings/{id}/report | 
*DefaultApi* | [**screeningsIdReportLinksPost**](docs/DefaultApi.md#screeningsIdReportLinksPost) | **POST** /screenings/{id}/report-links | 
*DefaultApi* | [**screeningsIdReportPdfGet**](docs/DefaultApi.md#screeningsIdReportPdfGet) | **GET** /screenings/{id}/report.pdf | 
*DefaultApi* | [**screeningsPost**](docs/DefaultApi.md#screeningsPost) | **POST** /screenings | 
*DefaultApi* | [**subscriptionsIdDelete**](docs/DefaultApi.md#subscriptionsIdDelete) | **DELETE** /subscriptions/{id} | 
*DefaultApi* | [**subscriptionsIdEventsGet**](docs/DefaultApi.md#subscriptionsIdEventsGet) | **GET** /subscriptions/{id}/events | 
*DefaultApi* | [**subscriptionsIdGet**](docs/DefaultApi.md#subscriptionsIdGet) | **GET** /subscriptions/{id} | 
*DefaultApi* | [**subscriptionsPost**](docs/DefaultApi.md#subscriptionsPost) | **POST** /subscriptions | 
*DefaultApi* | [**trustedUsersIdGet**](docs/DefaultApi.md#trustedUsersIdGet) | **GET** /trusted-users/{id} | 
*DefaultApi* | [**trustedUsersPost**](docs/DefaultApi.md#trustedUsersPost) | **POST** /trusted-users | 
*DefaultApi* | [**trustsIdDelete**](docs/DefaultApi.md#trustsIdDelete) | **DELETE** /trusts/{id} | 


## Documentation for Models

 - [Address](docs/Address.md)
 - [AdverseActionRequest](docs/AdverseActionRequest.md)
 - [AdverseActionResponse](docs/AdverseActionResponse.md)
 - [Answer](docs/Answer.md)
 - [BillingCodesResponse](docs/BillingCodesResponse.md)
 - [CallbackCredentials](docs/CallbackCredentials.md)
 - [CallbackRequest](docs/CallbackRequest.md)
 - [CallbackResponse](docs/CallbackResponse.md)
 - [CandidateAlias](docs/CandidateAlias.md)
 - [CandidateDocumentResponse](docs/CandidateDocumentResponse.md)
 - [CandidateRequest](docs/CandidateRequest.md)
 - [CandidateResponse](docs/CandidateResponse.md)
 - [Dispute](docs/Dispute.md)
 - [DriversLicense](docs/DriversLicense.md)
 - [ErrorDetail](docs/ErrorDetail.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [HealthResponse](docs/HealthResponse.md)
 - [IdentityRequest](docs/IdentityRequest.md)
 - [IdentityResponse](docs/IdentityResponse.md)
 - [Interval](docs/Interval.md)
 - [Invite](docs/Invite.md)
 - [InviteResponse](docs/InviteResponse.md)
 - [KnowledgeBasedAnswer](docs/KnowledgeBasedAnswer.md)
 - [Metrics](docs/Metrics.md)
 - [OneTimeReportLinkResponse](docs/OneTimeReportLinkResponse.md)
 - [PackagePriceResponse](docs/PackagePriceResponse.md)
 - [PackageResponse](docs/PackageResponse.md)
 - [Question](docs/Question.md)
 - [ReferenceCode](docs/ReferenceCode.md)
 - [ReferenceCodesResponse](docs/ReferenceCodesResponse.md)
 - [Schedule](docs/Schedule.md)
 - [ScreeningReport](docs/ScreeningReport.md)
 - [ScreeningRequest](docs/ScreeningRequest.md)
 - [ScreeningResponse](docs/ScreeningResponse.md)
 - [ScreeningResponseLink](docs/ScreeningResponseLink.md)
 - [ScreeningResponseReportItem](docs/ScreeningResponseReportItem.md)
 - [SubscriptionEventsResponse](docs/SubscriptionEventsResponse.md)
 - [SubscriptionRequest](docs/SubscriptionRequest.md)
 - [SubscriptionResponse](docs/SubscriptionResponse.md)
 - [SubscriptionScreening](docs/SubscriptionScreening.md)
 - [TrustedUserRequest](docs/TrustedUserRequest.md)
 - [TrustedUserResponse](docs/TrustedUserResponse.md)
 - [VerificationRequest](docs/VerificationRequest.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### jwt-authorizer

- **Type**: OAuth
- **Flow**: password
- **Authorization URL**: 
- **Scopes**: 
  - user: User Scope


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

