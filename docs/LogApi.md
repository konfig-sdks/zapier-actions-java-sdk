# LogApi

All URIs are relative to *https://actions.zapier.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getExecutionLog**](LogApi.md#getExecutionLog) | **GET** /api/v1/execution-log/{execution_log_id} | Get Execution Log Endpoint |


<a name="getExecutionLog"></a>
# **getExecutionLog**
> ExecuteResponse getExecutionLog(executionLogId).execute();

Get Execution Log Endpoint

Get the execution log for a given execution log id.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZapierActions;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LogApi;
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
    String executionLogId = "01ARZ3NDEKTSV4RRFFQ69G5FAV";
    try {
      ExecuteResponse result = client
              .log
              .getExecutionLog(executionLogId)
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
      System.err.println("Exception when calling LogApi#getExecutionLog");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ExecuteResponse> response = client
              .log
              .getExecutionLog(executionLogId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LogApi#getExecutionLog");
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
| **executionLogId** | **String**|  | |

### Return type

[**ExecuteResponse**](ExecuteResponse.md)

### Authorization

[AccessPointApiKeyHeader](../README.md#AccessPointApiKeyHeader), [AccessPointApiKeyQuery](../README.md#AccessPointApiKeyQuery), [AccessPointOAuth](../README.md#AccessPointOAuth), [SessionAuth](../README.md#SessionAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

