// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** configuration for the servers offering subPlan. */
@Fluent
public final class DefenderForServersGcpOfferingSubPlan {
    /*
     * The available sub plans
     */
    @JsonProperty(value = "type")
    private SubPlan type;

    /**
     * Get the type property: The available sub plans.
     *
     * @return the type value.
     */
    public SubPlan type() {
        return this.type;
    }

    /**
     * Set the type property: The available sub plans.
     *
     * @param type the type value to set.
     * @return the DefenderForServersGcpOfferingSubPlan object itself.
     */
    public DefenderForServersGcpOfferingSubPlan withType(SubPlan type) {
        this.type = type;
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
