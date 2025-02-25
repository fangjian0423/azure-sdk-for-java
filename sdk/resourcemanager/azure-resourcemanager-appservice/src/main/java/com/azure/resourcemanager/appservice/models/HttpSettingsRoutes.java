// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The configuration settings of the paths HTTP requests. */
@Fluent
public final class HttpSettingsRoutes {
    /*
     * The prefix that should precede all the authentication/authorization
     * paths.
     */
    @JsonProperty(value = "apiPrefix")
    private String apiPrefix;

    /**
     * Get the apiPrefix property: The prefix that should precede all the authentication/authorization paths.
     *
     * @return the apiPrefix value.
     */
    public String apiPrefix() {
        return this.apiPrefix;
    }

    /**
     * Set the apiPrefix property: The prefix that should precede all the authentication/authorization paths.
     *
     * @param apiPrefix the apiPrefix value to set.
     * @return the HttpSettingsRoutes object itself.
     */
    public HttpSettingsRoutes withApiPrefix(String apiPrefix) {
        this.apiPrefix = apiPrefix;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
