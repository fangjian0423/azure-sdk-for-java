// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The Defender for Databases AWS offering. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "offeringType")
@JsonTypeName("DefenderForDatabasesAws")
@Fluent
public final class DefenderFoDatabasesAwsOffering extends CloudOffering {
    /*
     * The ARC autoprovisioning configuration
     */
    @JsonProperty(value = "arcAutoProvisioning")
    private DefenderFoDatabasesAwsOfferingArcAutoProvisioning arcAutoProvisioning;

    /*
     * The RDS configuration
     */
    @JsonProperty(value = "rds")
    private DefenderFoDatabasesAwsOfferingRds rds;

    /**
     * Get the arcAutoProvisioning property: The ARC autoprovisioning configuration.
     *
     * @return the arcAutoProvisioning value.
     */
    public DefenderFoDatabasesAwsOfferingArcAutoProvisioning arcAutoProvisioning() {
        return this.arcAutoProvisioning;
    }

    /**
     * Set the arcAutoProvisioning property: The ARC autoprovisioning configuration.
     *
     * @param arcAutoProvisioning the arcAutoProvisioning value to set.
     * @return the DefenderFoDatabasesAwsOffering object itself.
     */
    public DefenderFoDatabasesAwsOffering withArcAutoProvisioning(
        DefenderFoDatabasesAwsOfferingArcAutoProvisioning arcAutoProvisioning) {
        this.arcAutoProvisioning = arcAutoProvisioning;
        return this;
    }

    /**
     * Get the rds property: The RDS configuration.
     *
     * @return the rds value.
     */
    public DefenderFoDatabasesAwsOfferingRds rds() {
        return this.rds;
    }

    /**
     * Set the rds property: The RDS configuration.
     *
     * @param rds the rds value to set.
     * @return the DefenderFoDatabasesAwsOffering object itself.
     */
    public DefenderFoDatabasesAwsOffering withRds(DefenderFoDatabasesAwsOfferingRds rds) {
        this.rds = rds;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (arcAutoProvisioning() != null) {
            arcAutoProvisioning().validate();
        }
        if (rds() != null) {
            rds().validate();
        }
    }
}
