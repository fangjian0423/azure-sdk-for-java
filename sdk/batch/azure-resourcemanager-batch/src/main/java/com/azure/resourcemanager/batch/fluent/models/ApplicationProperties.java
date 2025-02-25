// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties associated with the Application. */
@Fluent
public final class ApplicationProperties {
    /*
     * The display name for the application.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * A value indicating whether packages within the application may be
     * overwritten using the same version string.
     */
    @JsonProperty(value = "allowUpdates")
    private Boolean allowUpdates;

    /*
     * The package to use if a client requests the application but does not
     * specify a version. This property can only be set to the name of an
     * existing package.
     */
    @JsonProperty(value = "defaultVersion")
    private String defaultVersion;

    /**
     * Get the displayName property: The display name for the application.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The display name for the application.
     *
     * @param displayName the displayName value to set.
     * @return the ApplicationProperties object itself.
     */
    public ApplicationProperties withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the allowUpdates property: A value indicating whether packages within the application may be overwritten
     * using the same version string.
     *
     * @return the allowUpdates value.
     */
    public Boolean allowUpdates() {
        return this.allowUpdates;
    }

    /**
     * Set the allowUpdates property: A value indicating whether packages within the application may be overwritten
     * using the same version string.
     *
     * @param allowUpdates the allowUpdates value to set.
     * @return the ApplicationProperties object itself.
     */
    public ApplicationProperties withAllowUpdates(Boolean allowUpdates) {
        this.allowUpdates = allowUpdates;
        return this;
    }

    /**
     * Get the defaultVersion property: The package to use if a client requests the application but does not specify a
     * version. This property can only be set to the name of an existing package.
     *
     * @return the defaultVersion value.
     */
    public String defaultVersion() {
        return this.defaultVersion;
    }

    /**
     * Set the defaultVersion property: The package to use if a client requests the application but does not specify a
     * version. This property can only be set to the name of an existing package.
     *
     * @param defaultVersion the defaultVersion value to set.
     * @return the ApplicationProperties object itself.
     */
    public ApplicationProperties withDefaultVersion(String defaultVersion) {
        this.defaultVersion = defaultVersion;
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
