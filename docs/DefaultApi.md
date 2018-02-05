# DefaultApi

All URIs are relative to *https://api-int.kennect.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**billingCodesGet**](DefaultApi.md#billingCodesGet) | **GET** /billing-codes | Get a list of valid billing codes
[**candidatesGet**](DefaultApi.md#candidatesGet) | **GET** /candidates | Get a list of Candidates
[**candidatesIdDocumentsGet**](DefaultApi.md#candidatesIdDocumentsGet) | **GET** /candidates/{id}/documents | List documents attached to a candidate
[**candidatesIdDocumentsPost**](DefaultApi.md#candidatesIdDocumentsPost) | **POST** /candidates/{id}/documents | Attach a document to a candidate
[**candidatesIdGet**](DefaultApi.md#candidatesIdGet) | **GET** /candidates/{id} | Get a specific Candidate
[**candidatesIdLinksPost**](DefaultApi.md#candidatesIdLinksPost) | **POST** /candidates/{id}/links | Get links to the Candidate portal for use by the Candidate
[**candidatesIdPut**](DefaultApi.md#candidatesIdPut) | **PUT** /candidates/{id} | Update a candidate
[**candidatesIdTrustPost**](DefaultApi.md#candidatesIdTrustPost) | **POST** /candidates/{id}/trust | Trust a candidate
[**candidatesPost**](DefaultApi.md#candidatesPost) | **POST** /candidates | Create a candidate
[**healthGet**](DefaultApi.md#healthGet) | **GET** /health | Check the health of the API
[**identitiesIdGet**](DefaultApi.md#identitiesIdGet) | **GET** /identities/{id} | Get a verified identity
[**identitiesIdRetryPost**](DefaultApi.md#identitiesIdRetryPost) | **POST** /identities/{id}/retry | Retry creating an identity and get a new set of questions
[**identitiesIdVerificationPut**](DefaultApi.md#identitiesIdVerificationPut) | **PUT** /identities/{id}/verification | Verify an identity by providing correct answers
[**identitiesPost**](DefaultApi.md#identitiesPost) | **POST** /identities | Get a list of questions needing to be answered before an identity can be created
[**packagesGet**](DefaultApi.md#packagesGet) | **GET** /packages | Get a list of Packages
[**packagesIdPriceGet**](DefaultApi.md#packagesIdPriceGet) | **GET** /packages/{id}/price | Get the estimated price of a Package
[**referenceCodesGet**](DefaultApi.md#referenceCodesGet) | **GET** /reference-codes | Return a list of valid Reference Codes
[**screeningsIdAdverseActionsPost**](DefaultApi.md#screeningsIdAdverseActionsPost) | **POST** /screenings/{id}/adverse-actions | Create an adverse action on a Screening
[**screeningsIdDocumentsAttachmentIdGet**](DefaultApi.md#screeningsIdDocumentsAttachmentIdGet) | **GET** /screenings/{id}/documents/{attachmentId} | 
[**screeningsIdDocumentsGet**](DefaultApi.md#screeningsIdDocumentsGet) | **GET** /screenings/{id}/documents | 
[**screeningsIdDocumentsPost**](DefaultApi.md#screeningsIdDocumentsPost) | **POST** /screenings/{id}/documents | Attach a document to a Screening
[**screeningsIdGet**](DefaultApi.md#screeningsIdGet) | **GET** /screenings/{id} | Get a specific screening
[**screeningsIdInvitePost**](DefaultApi.md#screeningsIdInvitePost) | **POST** /screenings/{id}/invite | Create an invite
[**screeningsIdReportGet**](DefaultApi.md#screeningsIdReportGet) | **GET** /screenings/{id}/report | Get a Screening report in PDF form
[**screeningsIdReportLinksPost**](DefaultApi.md#screeningsIdReportLinksPost) | **POST** /screenings/{id}/report-links | Create  a one-time use report link
[**screeningsIdReportPdfGet**](DefaultApi.md#screeningsIdReportPdfGet) | **GET** /screenings/{id}/report.pdf | Get a Screening report in PDF form
[**screeningsPost**](DefaultApi.md#screeningsPost) | **POST** /screenings | Create a Screening
[**subscriptionsIdDelete**](DefaultApi.md#subscriptionsIdDelete) | **DELETE** /subscriptions/{id} | Delete a subscription
[**subscriptionsIdEventsGet**](DefaultApi.md#subscriptionsIdEventsGet) | **GET** /subscriptions/{id}/events | Get a list of events related to a given subscription
[**subscriptionsIdGet**](DefaultApi.md#subscriptionsIdGet) | **GET** /subscriptions/{id} | Get a subscription
[**subscriptionsPost**](DefaultApi.md#subscriptionsPost) | **POST** /subscriptions | Create a subscription
[**trustedUsersIdGet**](DefaultApi.md#trustedUsersIdGet) | **GET** /trusted-users/{id} | Get trust information about a verified user
[**trustedUsersPost**](DefaultApi.md#trustedUsersPost) | **POST** /trusted-users | Trust a verified user
[**trustsIdDelete**](DefaultApi.md#trustsIdDelete) | **DELETE** /trusts/{id} | Untrust a Trusted User


<a name="billingCodesGet"></a>
# **billingCodesGet**
> BillingCodesResponse billingCodesGet()

Get a list of valid billing codes

Get a list of valid billing codes

### Example
```java
// Import classes:
//import sts.oda.client.ApiException;
//import sts.oda.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    BillingCodesResponse result = apiInstance.billingCodesGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#billingCodesGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**BillingCodesResponse**](BillingCodesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="candidatesGet"></a>
# **candidatesGet**
> CandidateResponse candidatesGet(limit, offset, givenName, familyName, clientReferenceId, email)

Get a list of Candidates

Get a list of Candidates

### Example
```java
// Import classes:
//import sts.oda.client.ApiException;
//import sts.oda.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String limit = "limit_example"; // String | 
String offset = "offset_example"; // String | 
String givenName = "givenName_example"; // String | 
String familyName = "familyName_example"; // String | 
String clientReferenceId = "clientReferenceId_example"; // String | 
String email = "email_example"; // String | 
try {
    CandidateResponse result = apiInstance.candidatesGet(limit, offset, givenName, familyName, clientReferenceId, email);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#candidatesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **String**|  | [optional]
 **offset** | **String**|  | [optional]
 **givenName** | **String**|  | [optional]
 **familyName** | **String**|  | [optional]
 **clientReferenceId** | **String**|  | [optional]
 **email** | **String**|  | [optional]

### Return type

[**CandidateResponse**](CandidateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="candidatesIdDocumentsGet"></a>
# **candidatesIdDocumentsGet**
> List&lt;CandidateDocumentResponse&gt; candidatesIdDocumentsGet(id)

List documents attached to a candidate

List documents attached to a candidate

### Example
```java
// Import classes:
//import sts.oda.client.ApiException;
//import sts.oda.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | 
try {
    List<CandidateDocumentResponse> result = apiInstance.candidatesIdDocumentsGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#candidatesIdDocumentsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**List&lt;CandidateDocumentResponse&gt;**](CandidateDocumentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="candidatesIdDocumentsPost"></a>
# **candidatesIdDocumentsPost**
> candidatesIdDocumentsPost(id, accept, fileName)

Attach a document to a candidate

Attach a document to a candidate

### Example
```java
// Import classes:
//import sts.oda.client.ApiException;
//import sts.oda.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | 
String accept = "accept_example"; // String | 
String fileName = "fileName_example"; // String | 
try {
    apiInstance.candidatesIdDocumentsPost(id, accept, fileName);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#candidatesIdDocumentsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **accept** | **String**|  |
 **fileName** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json

<a name="candidatesIdGet"></a>
# **candidatesIdGet**
> CandidateResponse candidatesIdGet(id)

Get a specific Candidate

Get a specific Candidate

### Example
```java
// Import classes:
//import sts.oda.client.ApiException;
//import sts.oda.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | 
try {
    CandidateResponse result = apiInstance.candidatesIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#candidatesIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**CandidateResponse**](CandidateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="candidatesIdLinksPost"></a>
# **candidatesIdLinksPost**
> CandidatePortalLinkResponse candidatesIdLinksPost(id)

Get links to the Candidate portal for use by the Candidate

Get links to the Candidate portal for use by the Candidate

### Example
```java
// Import classes:
//import sts.oda.client.ApiException;
//import sts.oda.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | 
try {
    CandidatePortalLinkResponse result = apiInstance.candidatesIdLinksPost(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#candidatesIdLinksPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**CandidatePortalLinkResponse**](CandidatePortalLinkResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="candidatesIdPut"></a>
# **candidatesIdPut**
> CandidateResponse candidatesIdPut(id, candidateRequest)

Update a candidate

Update a candidate

### Example
```java
// Import classes:
//import sts.oda.client.ApiException;
//import sts.oda.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | 
CandidateRequest candidateRequest = new CandidateRequest(); // CandidateRequest | 
try {
    CandidateResponse result = apiInstance.candidatesIdPut(id, candidateRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#candidatesIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **candidateRequest** | [**CandidateRequest**](CandidateRequest.md)|  |

### Return type

[**CandidateResponse**](CandidateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="candidatesIdTrustPost"></a>
# **candidatesIdTrustPost**
> TrustedUserResponse candidatesIdTrustPost(id, trustedUserRequest)

Trust a candidate

Trust a candidate

### Example
```java
// Import classes:
//import sts.oda.client.ApiException;
//import sts.oda.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | 
TrustedUserRequest trustedUserRequest = new TrustedUserRequest(); // TrustedUserRequest | 
try {
    TrustedUserResponse result = apiInstance.candidatesIdTrustPost(id, trustedUserRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#candidatesIdTrustPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **trustedUserRequest** | [**TrustedUserRequest**](TrustedUserRequest.md)|  |

### Return type

[**TrustedUserResponse**](TrustedUserResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="candidatesPost"></a>
# **candidatesPost**
> CandidateResponse candidatesPost(candidateRequest)

Create a candidate

Create a candidate

### Example
```java
// Import classes:
//import sts.oda.client.ApiException;
//import sts.oda.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
CandidateRequest candidateRequest = new CandidateRequest(); // CandidateRequest | 
try {
    CandidateResponse result = apiInstance.candidatesPost(candidateRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#candidatesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **candidateRequest** | [**CandidateRequest**](CandidateRequest.md)|  |

### Return type

[**CandidateResponse**](CandidateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="healthGet"></a>
# **healthGet**
> HealthResponse healthGet(deep)

Check the health of the API

Check the health of the API

### Example
```java
// Import classes:
//import sts.oda.client.ApiException;
//import sts.oda.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String deep = "deep_example"; // String | 
try {
    HealthResponse result = apiInstance.healthGet(deep);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#healthGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deep** | **String**|  | [optional]

### Return type

[**HealthResponse**](HealthResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="identitiesIdGet"></a>
# **identitiesIdGet**
> IdentityResponse identitiesIdGet(id)

Get a verified identity

Get a verified identity

### Example
```java
// Import classes:
//import sts.oda.client.ApiException;
//import sts.oda.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | 
try {
    IdentityResponse result = apiInstance.identitiesIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#identitiesIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**IdentityResponse**](IdentityResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="identitiesIdRetryPost"></a>
# **identitiesIdRetryPost**
> IdentityResponse identitiesIdRetryPost(id)

Retry creating an identity and get a new set of questions

Retry creating an identity and get a new set of questions

### Example
```java
// Import classes:
//import sts.oda.client.ApiException;
//import sts.oda.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | 
try {
    IdentityResponse result = apiInstance.identitiesIdRetryPost(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#identitiesIdRetryPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**IdentityResponse**](IdentityResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="identitiesIdVerificationPut"></a>
# **identitiesIdVerificationPut**
> IdentityResponse identitiesIdVerificationPut(id, verificationRequest)

Verify an identity by providing correct answers

Verify an identity by providing correct answers

### Example
```java
// Import classes:
//import sts.oda.client.ApiException;
//import sts.oda.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | 
VerificationRequest verificationRequest = new VerificationRequest(); // VerificationRequest | 
try {
    IdentityResponse result = apiInstance.identitiesIdVerificationPut(id, verificationRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#identitiesIdVerificationPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **verificationRequest** | [**VerificationRequest**](VerificationRequest.md)|  |

### Return type

[**IdentityResponse**](IdentityResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="identitiesPost"></a>
# **identitiesPost**
> IdentityResponse identitiesPost(identityRequest)

Get a list of questions needing to be answered before an identity can be created

Get a list of questions needing to be answered before an identity can be created

### Example
```java
// Import classes:
//import sts.oda.client.ApiException;
//import sts.oda.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
IdentityRequest identityRequest = new IdentityRequest(); // IdentityRequest | 
try {
    IdentityResponse result = apiInstance.identitiesPost(identityRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#identitiesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identityRequest** | [**IdentityRequest**](IdentityRequest.md)|  |

### Return type

[**IdentityResponse**](IdentityResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="packagesGet"></a>
# **packagesGet**
> List&lt;PackageResponse&gt; packagesGet(all)

Get a list of Packages

Get a list of Packages

### Example
```java
// Import classes:
//import sts.oda.client.ApiException;
//import sts.oda.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String all = "all_example"; // String | 
try {
    List<PackageResponse> result = apiInstance.packagesGet(all);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#packagesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **all** | **String**|  | [optional]

### Return type

[**List&lt;PackageResponse&gt;**](PackageResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="packagesIdPriceGet"></a>
# **packagesIdPriceGet**
> PackagePriceResponse packagesIdPriceGet(id, candidateId)

Get the estimated price of a Package

Get the estimated price of a Package

### Example
```java
// Import classes:
//import sts.oda.client.ApiException;
//import sts.oda.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | 
String candidateId = "candidateId_example"; // String | 
try {
    PackagePriceResponse result = apiInstance.packagesIdPriceGet(id, candidateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#packagesIdPriceGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **candidateId** | **String**|  |

### Return type

[**PackagePriceResponse**](PackagePriceResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="referenceCodesGet"></a>
# **referenceCodesGet**
> ReferenceCodesResponse referenceCodesGet()

Return a list of valid Reference Codes

Return a list of valid Reference Codes

### Example
```java
// Import classes:
//import sts.oda.client.ApiException;
//import sts.oda.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    ReferenceCodesResponse result = apiInstance.referenceCodesGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#referenceCodesGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ReferenceCodesResponse**](ReferenceCodesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="screeningsIdAdverseActionsPost"></a>
# **screeningsIdAdverseActionsPost**
> screeningsIdAdverseActionsPost(id, adverseActionRequest)

Create an adverse action on a Screening

Create an adverse action on a Screening

### Example
```java
// Import classes:
//import sts.oda.client.ApiException;
//import sts.oda.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | 
AdverseActionRequest adverseActionRequest = new AdverseActionRequest(); // AdverseActionRequest | 
try {
    apiInstance.screeningsIdAdverseActionsPost(id, adverseActionRequest);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#screeningsIdAdverseActionsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **adverseActionRequest** | [**AdverseActionRequest**](AdverseActionRequest.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: Not defined

<a name="screeningsIdDocumentsAttachmentIdGet"></a>
# **screeningsIdDocumentsAttachmentIdGet**
> Map&lt;String, String&gt; screeningsIdDocumentsAttachmentIdGet(id, attachmentId)





### Example
```java
// Import classes:
//import sts.oda.client.ApiException;
//import sts.oda.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | 
String attachmentId = "attachmentId_example"; // String | 
try {
    Map<String, String> result = apiInstance.screeningsIdDocumentsAttachmentIdGet(id, attachmentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#screeningsIdDocumentsAttachmentIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **attachmentId** | **String**|  |

### Return type

[**Map&lt;String, String&gt;**](Map.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/pdf

<a name="screeningsIdDocumentsGet"></a>
# **screeningsIdDocumentsGet**
> List&lt;CandidateDocumentResponse&gt; screeningsIdDocumentsGet(id)





### Example
```java
// Import classes:
//import sts.oda.client.ApiException;
//import sts.oda.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | 
try {
    List<CandidateDocumentResponse> result = apiInstance.screeningsIdDocumentsGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#screeningsIdDocumentsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**List&lt;CandidateDocumentResponse&gt;**](CandidateDocumentResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="screeningsIdDocumentsPost"></a>
# **screeningsIdDocumentsPost**
> screeningsIdDocumentsPost(id, accept, documentType, party)

Attach a document to a Screening

Attach a document to a Screening

### Example
```java
// Import classes:
//import sts.oda.client.ApiException;
//import sts.oda.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | 
String accept = "accept_example"; // String | 
String documentType = "documentType_example"; // String | 
String party = "party_example"; // String | 
try {
    apiInstance.screeningsIdDocumentsPost(id, accept, documentType, party);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#screeningsIdDocumentsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **accept** | **String**|  |
 **documentType** | **String**|  |
 **party** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json

<a name="screeningsIdGet"></a>
# **screeningsIdGet**
> ScreeningResponse screeningsIdGet(id)

Get a specific screening

Get a specific screening

### Example
```java
// Import classes:
//import sts.oda.client.ApiException;
//import sts.oda.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | 
try {
    ScreeningResponse result = apiInstance.screeningsIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#screeningsIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**ScreeningResponse**](ScreeningResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="screeningsIdInvitePost"></a>
# **screeningsIdInvitePost**
> InviteResponse screeningsIdInvitePost(id)

Create an invite

Create an invite

### Example
```java
// Import classes:
//import sts.oda.client.ApiException;
//import sts.oda.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | 
try {
    InviteResponse result = apiInstance.screeningsIdInvitePost(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#screeningsIdInvitePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**InviteResponse**](InviteResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="screeningsIdReportGet"></a>
# **screeningsIdReportGet**
> Map&lt;String, String&gt; screeningsIdReportGet(id, accept)

Get a Screening report in PDF form

Get a Screening report in PDF form

### Example
```java
// Import classes:
//import sts.oda.client.ApiException;
//import sts.oda.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | 
String accept = "accept_example"; // String | 
try {
    Map<String, String> result = apiInstance.screeningsIdReportGet(id, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#screeningsIdReportGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **accept** | **String**|  |

### Return type

[**Map&lt;String, String&gt;**](Map.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/pdf

<a name="screeningsIdReportLinksPost"></a>
# **screeningsIdReportLinksPost**
> OneTimeReportLinkResponse screeningsIdReportLinksPost(id)

Create  a one-time use report link

Create  a one-time use report link

### Example
```java
// Import classes:
//import sts.oda.client.ApiException;
//import sts.oda.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | 
try {
    OneTimeReportLinkResponse result = apiInstance.screeningsIdReportLinksPost(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#screeningsIdReportLinksPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**OneTimeReportLinkResponse**](OneTimeReportLinkResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="screeningsIdReportPdfGet"></a>
# **screeningsIdReportPdfGet**
> Map&lt;String, String&gt; screeningsIdReportPdfGet(id, token)

Get a Screening report in PDF form

Get a Screening report in PDF form

### Example
```java
// Import classes:
//import sts.oda.client.ApiException;
//import sts.oda.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | 
String token = "token_example"; // String | 
try {
    Map<String, String> result = apiInstance.screeningsIdReportPdfGet(id, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#screeningsIdReportPdfGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **token** | **String**|  | [optional]

### Return type

[**Map&lt;String, String&gt;**](Map.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/pdf

<a name="screeningsPost"></a>
# **screeningsPost**
> ScreeningResponse screeningsPost(screeningRequest, idempotencyKey)

Create a Screening

Create a Screening

### Example
```java
// Import classes:
//import sts.oda.client.ApiException;
//import sts.oda.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
ScreeningRequest screeningRequest = new ScreeningRequest(); // ScreeningRequest | 
String idempotencyKey = "idempotencyKey_example"; // String | 
try {
    ScreeningResponse result = apiInstance.screeningsPost(screeningRequest, idempotencyKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#screeningsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **screeningRequest** | [**ScreeningRequest**](ScreeningRequest.md)|  |
 **idempotencyKey** | **String**|  | [optional]

### Return type

[**ScreeningResponse**](ScreeningResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="subscriptionsIdDelete"></a>
# **subscriptionsIdDelete**
> SubscriptionResponse subscriptionsIdDelete(id)

Delete a subscription

Delete a subscription

### Example
```java
// Import classes:
//import sts.oda.client.ApiException;
//import sts.oda.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | 
try {
    SubscriptionResponse result = apiInstance.subscriptionsIdDelete(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#subscriptionsIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**SubscriptionResponse**](SubscriptionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="subscriptionsIdEventsGet"></a>
# **subscriptionsIdEventsGet**
> SubscriptionEventsResponse subscriptionsIdEventsGet(id)

Get a list of events related to a given subscription

Get a list of events related to a given subscription

### Example
```java
// Import classes:
//import sts.oda.client.ApiException;
//import sts.oda.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | 
try {
    SubscriptionEventsResponse result = apiInstance.subscriptionsIdEventsGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#subscriptionsIdEventsGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**SubscriptionEventsResponse**](SubscriptionEventsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="subscriptionsIdGet"></a>
# **subscriptionsIdGet**
> SubscriptionResponse subscriptionsIdGet(id)

Get a subscription

Get a subscription

### Example
```java
// Import classes:
//import sts.oda.client.ApiException;
//import sts.oda.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | 
try {
    SubscriptionResponse result = apiInstance.subscriptionsIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#subscriptionsIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**SubscriptionResponse**](SubscriptionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="subscriptionsPost"></a>
# **subscriptionsPost**
> SubscriptionResponse subscriptionsPost(subscriptionRequest)

Create a subscription

Create a subscription

### Example
```java
// Import classes:
//import sts.oda.client.ApiException;
//import sts.oda.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
SubscriptionRequest subscriptionRequest = new SubscriptionRequest(); // SubscriptionRequest | 
try {
    SubscriptionResponse result = apiInstance.subscriptionsPost(subscriptionRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#subscriptionsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionRequest** | [**SubscriptionRequest**](SubscriptionRequest.md)|  |

### Return type

[**SubscriptionResponse**](SubscriptionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="trustedUsersIdGet"></a>
# **trustedUsersIdGet**
> TrustedUserResponse trustedUsersIdGet(id)

Get trust information about a verified user

Get trust information about a verified user

### Example
```java
// Import classes:
//import sts.oda.client.ApiException;
//import sts.oda.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | 
try {
    TrustedUserResponse result = apiInstance.trustedUsersIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#trustedUsersIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**TrustedUserResponse**](TrustedUserResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="trustedUsersPost"></a>
# **trustedUsersPost**
> TrustedUserResponse trustedUsersPost(trustedUserRequest)

Trust a verified user

Trust a verified user

### Example
```java
// Import classes:
//import sts.oda.client.ApiException;
//import sts.oda.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
TrustedUserRequest trustedUserRequest = new TrustedUserRequest(); // TrustedUserRequest | 
try {
    TrustedUserResponse result = apiInstance.trustedUsersPost(trustedUserRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#trustedUsersPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **trustedUserRequest** | [**TrustedUserRequest**](TrustedUserRequest.md)|  |

### Return type

[**TrustedUserResponse**](TrustedUserResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="trustsIdDelete"></a>
# **trustsIdDelete**
> trustsIdDelete(id)

Untrust a Trusted User

Untrust a Trusted User

### Example
```java
// Import classes:
//import sts.oda.client.ApiException;
//import sts.oda.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String id = "id_example"; // String | 
try {
    apiInstance.trustsIdDelete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#trustsIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

