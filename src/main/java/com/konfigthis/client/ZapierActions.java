package com.konfigthis.client;

import com.konfigthis.client.api.ActionApi;
import com.konfigthis.client.api.CheckApi;
import com.konfigthis.client.api.ConfigurationApi;
import com.konfigthis.client.api.LogApi;

public class ZapierActions {
    private ApiClient apiClient;
    public final ActionApi action;
    public final CheckApi check;
    public final ConfigurationApi configuration;
    public final LogApi log;

    public ZapierActions() {
        this(null);
    }

    public ZapierActions(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.action = new ActionApi(this.apiClient);
        this.check = new CheckApi(this.apiClient);
        this.configuration = new ConfigurationApi(this.apiClient);
        this.log = new LogApi(this.apiClient);
    }

}
