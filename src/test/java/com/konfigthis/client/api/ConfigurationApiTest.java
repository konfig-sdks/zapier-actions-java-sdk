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
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ConfigurationApi
 */
@Disabled
public class ConfigurationApiTest {

    private static ConfigurationApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new ConfigurationApi(apiClient);
    }

    /**
     * Get Configuration Link
     *
     * Provides a link to configure more actions. Alternatively, searching through apps and actions will provide more specific configuration links.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getConfigurationLinkTest() throws ApiException {
        api.getConfigurationLink()
                .execute();
        // TODO: test validations
    }

}