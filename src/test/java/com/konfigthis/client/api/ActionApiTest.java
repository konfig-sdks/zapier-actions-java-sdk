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

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.ExecuteRequest;
import com.konfigthis.client.model.ExecuteResponse;
import com.konfigthis.client.model.ExposedActionResponseSchema;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ActionApi
 */
@Disabled
public class ActionApiTest {

    private static ActionApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new ActionApi(apiClient);
    }

    /**
     * Execute App Action Endpoint
     *
     * Give us a plain english description of exact action you want to do. There should be dynamically generated documentation for this endpoint for each action that is exposed.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void executeAppActionTest() throws ApiException {
        String instructions = null;
        String exposedAppActionId = null;
        Boolean previewOnly = null;
        ExecuteResponse response = api.executeAppAction(instructions, exposedAppActionId)
                .previewOnly(previewOnly)
                .execute();
        // TODO: test validations
    }

    /**
     * List Exposed Actions
     *
     * List all the currently exposed actions for the given account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listExposedActionsTest() throws ApiException {
        ExposedActionResponseSchema response = api.listExposedActions()
                .execute();
        // TODO: test validations
    }

}
