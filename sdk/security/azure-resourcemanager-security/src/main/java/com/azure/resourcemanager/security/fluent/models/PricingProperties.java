// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.models.PricingTier;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;
import java.util.List;

/** Pricing properties for the relevant scope. */
@Fluent
public final class PricingProperties {
    /*
     * The pricing tier value. Microsoft Defender for Cloud is provided in two pricing tiers: free and standard, with
     * the standard tier available with a trial period. The standard tier offers advanced security capabilities, while
     * the free tier offers basic security features.
     */
    @JsonProperty(value = "pricingTier", required = true)
    private PricingTier pricingTier;

    /*
     * The sub-plan selected for a Standard pricing configuration, when more than one sub-plan is available. Each
     * sub-plan enables a set of security features. When not specified, full plan is applied.
     */
    @JsonProperty(value = "subPlan")
    private String subPlan;

    /*
     * The duration left for the subscriptions free trial period - in ISO 8601 format (e.g. P3Y6M4DT12H30M5S).
     */
    @JsonProperty(value = "freeTrialRemainingTime", access = JsonProperty.Access.WRITE_ONLY)
    private Duration freeTrialRemainingTime;

    /*
     * Optional. True if the plan is deprecated. If there are replacing plans they will appear in `replacedBy` property
     */
    @JsonProperty(value = "deprecated", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean deprecated;

    /*
     * Optional. List of plans that replace this plan. This property exists only if this plan is deprecated.
     */
    @JsonProperty(value = "replacedBy", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> replacedBy;

    /**
     * Get the pricingTier property: The pricing tier value. Microsoft Defender for Cloud is provided in two pricing
     * tiers: free and standard, with the standard tier available with a trial period. The standard tier offers advanced
     * security capabilities, while the free tier offers basic security features.
     *
     * @return the pricingTier value.
     */
    public PricingTier pricingTier() {
        return this.pricingTier;
    }

    /**
     * Set the pricingTier property: The pricing tier value. Microsoft Defender for Cloud is provided in two pricing
     * tiers: free and standard, with the standard tier available with a trial period. The standard tier offers advanced
     * security capabilities, while the free tier offers basic security features.
     *
     * @param pricingTier the pricingTier value to set.
     * @return the PricingProperties object itself.
     */
    public PricingProperties withPricingTier(PricingTier pricingTier) {
        this.pricingTier = pricingTier;
        return this;
    }

    /**
     * Get the subPlan property: The sub-plan selected for a Standard pricing configuration, when more than one sub-plan
     * is available. Each sub-plan enables a set of security features. When not specified, full plan is applied.
     *
     * @return the subPlan value.
     */
    public String subPlan() {
        return this.subPlan;
    }

    /**
     * Set the subPlan property: The sub-plan selected for a Standard pricing configuration, when more than one sub-plan
     * is available. Each sub-plan enables a set of security features. When not specified, full plan is applied.
     *
     * @param subPlan the subPlan value to set.
     * @return the PricingProperties object itself.
     */
    public PricingProperties withSubPlan(String subPlan) {
        this.subPlan = subPlan;
        return this;
    }

    /**
     * Get the freeTrialRemainingTime property: The duration left for the subscriptions free trial period - in ISO 8601
     * format (e.g. P3Y6M4DT12H30M5S).
     *
     * @return the freeTrialRemainingTime value.
     */
    public Duration freeTrialRemainingTime() {
        return this.freeTrialRemainingTime;
    }

    /**
     * Get the deprecated property: Optional. True if the plan is deprecated. If there are replacing plans they will
     * appear in `replacedBy` property.
     *
     * @return the deprecated value.
     */
    public Boolean deprecated() {
        return this.deprecated;
    }

    /**
     * Get the replacedBy property: Optional. List of plans that replace this plan. This property exists only if this
     * plan is deprecated.
     *
     * @return the replacedBy value.
     */
    public List<String> replacedBy() {
        return this.replacedBy;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (pricingTier() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property pricingTier in model PricingProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PricingProperties.class);
}
