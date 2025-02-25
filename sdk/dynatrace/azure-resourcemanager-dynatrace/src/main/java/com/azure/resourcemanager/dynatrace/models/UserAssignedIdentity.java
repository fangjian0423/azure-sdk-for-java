// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dynatrace.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A managed identity assigned by the user. */
@Fluent
public class UserAssignedIdentity {
    /*
     * The active directory client identifier for this principal.
     */
    @JsonProperty(value = "clientId", required = true)
    private String clientId;

    /*
     * The active directory identifier for this principal.
     */
    @JsonProperty(value = "principalId", required = true)
    private String principalId;

    /**
     * Get the clientId property: The active directory client identifier for this principal.
     *
     * @return the clientId value.
     */
    public String clientId() {
        return this.clientId;
    }

    /**
     * Set the clientId property: The active directory client identifier for this principal.
     *
     * @param clientId the clientId value to set.
     * @return the UserAssignedIdentity object itself.
     */
    public UserAssignedIdentity withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get the principalId property: The active directory identifier for this principal.
     *
     * @return the principalId value.
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Set the principalId property: The active directory identifier for this principal.
     *
     * @param principalId the principalId value to set.
     * @return the UserAssignedIdentity object itself.
     */
    public UserAssignedIdentity withPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (clientId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property clientId in model UserAssignedIdentity"));
        }
        if (principalId() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property principalId in model UserAssignedIdentity"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(UserAssignedIdentity.class);
}
