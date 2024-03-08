# CheckApi

All URIs are relative to *https://actions.zapier.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**authTestGet**](CheckApi.md#authTestGet) | **GET** /api/v1/check | Check |


<a name="authTestGet"></a>
# **authTestGet**
> authTestGet().execute();

Check

Test that the API and auth are working.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ZapierActions;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CheckApi;
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
      client
              .check
              .authTestGet()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckApi#authTestGet");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .check
              .authTestGet()
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling CheckApi#authTestGet");
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

null (empty response body)

### Authorization

[AccessPointApiKeyHeader](../README.md#AccessPointApiKeyHeader), [AccessPointApiKeyQuery](../README.md#AccessPointApiKeyQuery), [AccessPointOAuth](../README.md#AccessPointOAuth), [SessionAuth](../README.md#SessionAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

