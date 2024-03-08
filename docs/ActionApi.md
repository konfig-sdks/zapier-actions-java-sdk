# ActionApi

All URIs are relative to *https://actions.zapier.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**executeAppAction**](ActionApi.md#executeAppAction) | **POST** /api/v1/exposed/{exposed_app_action_id}/execute | Execute App Action Endpoint |
| [**listExposedActions**](ActionApi.md#listExposedActions) | **GET** /api/v1/exposed | List Exposed Actions |


<a name="executeAppAction"></a>
# **executeAppAction**
> ExecuteResponse executeAppAction(exposedAppActionId, executeRequest).execute();

Execute App Action Endpoint

Give us a plain english description of exact action you want to do. There should be dynamically generated documentation for this endpoint for each action that is exposed.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZapierActions;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ActionApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://actions.zapier.com";
    
    configuration.accessPointApiKeyHeader  = "YOUR API KEY";
    
    configuration.accessPointApiKeyQuery  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: AccessPointOAuth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    configuration.sessionAuth  = "YOUR API KEY";
    ZapierActions client = new ZapierActions(configuration);
    String instructions = "instructions_example"; // Plain english instructions. Provide as much detail as possible, even if other fields are present.
    String exposedAppActionId = "01ARZ3NDEKTSV4RRFFQ69G5FAV";
    Boolean previewOnly = false; // If true, we will not execute the action, but will return the params of the preview.
    try {
      ExecuteResponse result = client
              .action
              .executeAppAction(instructions, exposedAppActionId)
              .previewOnly(previewOnly)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getActionUsed());
      System.out.println(result.getInputParams());
      System.out.println(result.getReviewUrl());
      System.out.println(result.getResult());
      System.out.println(result.getAdditionalResults());
      System.out.println(result.getResultFieldLabels());
      System.out.println(result.getStatus());
      System.out.println(result.getError());
      System.out.println(result.getAssistantHint());
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionApi#executeAppAction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ExecuteResponse> response = client
              .action
              .executeAppAction(instructions, exposedAppActionId)
              .previewOnly(previewOnly)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionApi#executeAppAction");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **exposedAppActionId** | **String**|  | |
| **executeRequest** | [**ExecuteRequest**](ExecuteRequest.md)|  | |

### Return type

[**ExecuteResponse**](ExecuteResponse.md)

### Authorization

[AccessPointApiKeyHeader](../README.md#AccessPointApiKeyHeader), [AccessPointApiKeyQuery](../README.md#AccessPointApiKeyQuery), [AccessPointOAuth](../README.md#AccessPointOAuth), [SessionAuth](../README.md#SessionAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="listExposedActions"></a>
# **listExposedActions**
> ExposedActionResponseSchema listExposedActions().execute();

List Exposed Actions

List all the currently exposed actions for the given account.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZapierActions;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ActionApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://actions.zapier.com";
    
    configuration.accessPointApiKeyHeader  = "YOUR API KEY";
    
    configuration.accessPointApiKeyQuery  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: AccessPointOAuth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    configuration.sessionAuth  = "YOUR API KEY";
    ZapierActions client = new ZapierActions(configuration);
    try {
      ExposedActionResponseSchema result = client
              .action
              .listExposedActions()
              .execute();
      System.out.println(result);
      System.out.println(result.getResults());
      System.out.println(result.getConfigurationLink());
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionApi#listExposedActions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ExposedActionResponseSchema> response = client
              .action
              .listExposedActions()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionApi#listExposedActions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ExposedActionResponseSchema**](ExposedActionResponseSchema.md)

### Authorization

[AccessPointApiKeyHeader](../README.md#AccessPointApiKeyHeader), [AccessPointApiKeyQuery](../README.md#AccessPointApiKeyQuery), [AccessPointOAuth](../README.md#AccessPointOAuth), [SessionAuth](../README.md#SessionAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

