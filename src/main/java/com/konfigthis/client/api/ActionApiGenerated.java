/*
 * Zapier AI Actions API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.ExecuteRequest;
import com.konfigthis.client.model.ExecuteResponse;
import com.konfigthis.client.model.ExposedActionResponseSchema;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ActionApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ActionApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public ActionApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call executeAppActionCall(String exposedAppActionId, ExecuteRequest executeRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = executeRequest;

        // create path and map variables
        String localVarPath = "/api/v1/exposed/{exposed_app_action_id}/execute"
            .replace("{" + "exposed_app_action_id" + "}", localVarApiClient.escapeString(exposedAppActionId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "AccessPointApiKeyHeader", "AccessPointApiKeyQuery", "AccessPointOAuth", "SessionAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call executeAppActionValidateBeforeCall(String exposedAppActionId, ExecuteRequest executeRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'exposedAppActionId' is set
        if (exposedAppActionId == null) {
            throw new ApiException("Missing the required parameter 'exposedAppActionId' when calling executeAppAction(Async)");
        }

        // verify the required parameter 'executeRequest' is set
        if (executeRequest == null) {
            throw new ApiException("Missing the required parameter 'executeRequest' when calling executeAppAction(Async)");
        }

        return executeAppActionCall(exposedAppActionId, executeRequest, _callback);

    }


    private ApiResponse<ExecuteResponse> executeAppActionWithHttpInfo(String exposedAppActionId, ExecuteRequest executeRequest) throws ApiException {
        okhttp3.Call localVarCall = executeAppActionValidateBeforeCall(exposedAppActionId, executeRequest, null);
        Type localVarReturnType = new TypeToken<ExecuteResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call executeAppActionAsync(String exposedAppActionId, ExecuteRequest executeRequest, final ApiCallback<ExecuteResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = executeAppActionValidateBeforeCall(exposedAppActionId, executeRequest, _callback);
        Type localVarReturnType = new TypeToken<ExecuteResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ExecuteAppActionRequestBuilder {
        private final String instructions;
        private final String exposedAppActionId;
        private Boolean previewOnly;

        private ExecuteAppActionRequestBuilder(String instructions, String exposedAppActionId) {
            this.instructions = instructions;
            this.exposedAppActionId = exposedAppActionId;
        }

        /**
         * Set previewOnly
         * @param previewOnly If true, we will not execute the action, but will return the params of the preview. (optional, default to false)
         * @return ExecuteAppActionRequestBuilder
         */
        public ExecuteAppActionRequestBuilder previewOnly(Boolean previewOnly) {
            this.previewOnly = previewOnly;
            return this;
        }
        
        /**
         * Build call for executeAppAction
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            ExecuteRequest executeRequest = buildBodyParams();
            return executeAppActionCall(exposedAppActionId, executeRequest, _callback);
        }

        private ExecuteRequest buildBodyParams() {
            ExecuteRequest executeRequest = new ExecuteRequest();
            executeRequest.instructions(this.instructions);
            executeRequest.previewOnly(this.previewOnly);
            return executeRequest;
        }

        /**
         * Execute executeAppAction request
         * @return ExecuteResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ExecuteResponse execute() throws ApiException {
            ExecuteRequest executeRequest = buildBodyParams();
            ApiResponse<ExecuteResponse> localVarResp = executeAppActionWithHttpInfo(exposedAppActionId, executeRequest);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute executeAppAction request with HTTP info returned
         * @return ApiResponse&lt;ExecuteResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<ExecuteResponse> executeWithHttpInfo() throws ApiException {
            ExecuteRequest executeRequest = buildBodyParams();
            return executeAppActionWithHttpInfo(exposedAppActionId, executeRequest);
        }

        /**
         * Execute executeAppAction request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<ExecuteResponse> _callback) throws ApiException {
            ExecuteRequest executeRequest = buildBodyParams();
            return executeAppActionAsync(exposedAppActionId, executeRequest, _callback);
        }
    }

    /**
     * Execute App Action Endpoint
     * Give us a plain english description of exact action you want to do. There should be dynamically generated documentation for this endpoint for each action that is exposed.
     * @param exposedAppActionId  (required)
     * @param executeRequest  (required)
     * @return ExecuteAppActionRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ExecuteAppActionRequestBuilder executeAppAction(String instructions, String exposedAppActionId) throws IllegalArgumentException {
        if (instructions == null) throw new IllegalArgumentException("\"instructions\" is required but got null");
            

        if (exposedAppActionId == null) throw new IllegalArgumentException("\"exposedAppActionId\" is required but got null");
            

        return new ExecuteAppActionRequestBuilder(instructions, exposedAppActionId);
    }
    private okhttp3.Call listExposedActionsCall(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/exposed";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "AccessPointApiKeyHeader", "AccessPointApiKeyQuery", "AccessPointOAuth", "SessionAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listExposedActionsValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return listExposedActionsCall(_callback);

    }


    private ApiResponse<ExposedActionResponseSchema> listExposedActionsWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = listExposedActionsValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<ExposedActionResponseSchema>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listExposedActionsAsync(final ApiCallback<ExposedActionResponseSchema> _callback) throws ApiException {

        okhttp3.Call localVarCall = listExposedActionsValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<ExposedActionResponseSchema>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ListExposedActionsRequestBuilder {

        private ListExposedActionsRequestBuilder() {
        }

        /**
         * Build call for listExposedActions
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listExposedActionsCall(_callback);
        }


        /**
         * Execute listExposedActions request
         * @return ExposedActionResponseSchema
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ExposedActionResponseSchema execute() throws ApiException {
            ApiResponse<ExposedActionResponseSchema> localVarResp = listExposedActionsWithHttpInfo();
            return localVarResp.getResponseBody();
        }

        /**
         * Execute listExposedActions request with HTTP info returned
         * @return ApiResponse&lt;ExposedActionResponseSchema&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<ExposedActionResponseSchema> executeWithHttpInfo() throws ApiException {
            return listExposedActionsWithHttpInfo();
        }

        /**
         * Execute listExposedActions request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<ExposedActionResponseSchema> _callback) throws ApiException {
            return listExposedActionsAsync(_callback);
        }
    }

    /**
     * List Exposed Actions
     * List all the currently exposed actions for the given account.
     * @return ListExposedActionsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ListExposedActionsRequestBuilder listExposedActions() throws IllegalArgumentException {
        return new ListExposedActionsRequestBuilder();
    }
}
