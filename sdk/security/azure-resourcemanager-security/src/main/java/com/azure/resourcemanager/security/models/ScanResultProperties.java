// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A vulnerability assessment scan result properties for a single rule. */
@Fluent
public final class ScanResultProperties {
    /*
     * The rule Id.
     */
    @JsonProperty(value = "ruleId")
    private String ruleId;

    /*
     * The rule result status.
     */
    @JsonProperty(value = "status")
    private RuleStatus status;

    /*
     * Indicated whether the results specified here are trimmed.
     */
    @JsonProperty(value = "isTrimmed")
    private Boolean isTrimmed;

    /*
     * The results of the query that was run.
     */
    @JsonProperty(value = "queryResults")
    private List<List<String>> queryResults;

    /*
     * Remediation details.
     */
    @JsonProperty(value = "remediation")
    private Remediation remediation;

    /*
     * The rule result adjusted with baseline.
     */
    @JsonProperty(value = "baselineAdjustedResult")
    private BaselineAdjustedResult baselineAdjustedResult;

    /*
     * vulnerability assessment rule metadata details.
     */
    @JsonProperty(value = "ruleMetadata")
    private VaRule ruleMetadata;

    /**
     * Get the ruleId property: The rule Id.
     *
     * @return the ruleId value.
     */
    public String ruleId() {
        return this.ruleId;
    }

    /**
     * Set the ruleId property: The rule Id.
     *
     * @param ruleId the ruleId value to set.
     * @return the ScanResultProperties object itself.
     */
    public ScanResultProperties withRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /**
     * Get the status property: The rule result status.
     *
     * @return the status value.
     */
    public RuleStatus status() {
        return this.status;
    }

    /**
     * Set the status property: The rule result status.
     *
     * @param status the status value to set.
     * @return the ScanResultProperties object itself.
     */
    public ScanResultProperties withStatus(RuleStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the isTrimmed property: Indicated whether the results specified here are trimmed.
     *
     * @return the isTrimmed value.
     */
    public Boolean isTrimmed() {
        return this.isTrimmed;
    }

    /**
     * Set the isTrimmed property: Indicated whether the results specified here are trimmed.
     *
     * @param isTrimmed the isTrimmed value to set.
     * @return the ScanResultProperties object itself.
     */
    public ScanResultProperties withIsTrimmed(Boolean isTrimmed) {
        this.isTrimmed = isTrimmed;
        return this;
    }

    /**
     * Get the queryResults property: The results of the query that was run.
     *
     * @return the queryResults value.
     */
    public List<List<String>> queryResults() {
        return this.queryResults;
    }

    /**
     * Set the queryResults property: The results of the query that was run.
     *
     * @param queryResults the queryResults value to set.
     * @return the ScanResultProperties object itself.
     */
    public ScanResultProperties withQueryResults(List<List<String>> queryResults) {
        this.queryResults = queryResults;
        return this;
    }

    /**
     * Get the remediation property: Remediation details.
     *
     * @return the remediation value.
     */
    public Remediation remediation() {
        return this.remediation;
    }

    /**
     * Set the remediation property: Remediation details.
     *
     * @param remediation the remediation value to set.
     * @return the ScanResultProperties object itself.
     */
    public ScanResultProperties withRemediation(Remediation remediation) {
        this.remediation = remediation;
        return this;
    }

    /**
     * Get the baselineAdjustedResult property: The rule result adjusted with baseline.
     *
     * @return the baselineAdjustedResult value.
     */
    public BaselineAdjustedResult baselineAdjustedResult() {
        return this.baselineAdjustedResult;
    }

    /**
     * Set the baselineAdjustedResult property: The rule result adjusted with baseline.
     *
     * @param baselineAdjustedResult the baselineAdjustedResult value to set.
     * @return the ScanResultProperties object itself.
     */
    public ScanResultProperties withBaselineAdjustedResult(BaselineAdjustedResult baselineAdjustedResult) {
        this.baselineAdjustedResult = baselineAdjustedResult;
        return this;
    }

    /**
     * Get the ruleMetadata property: vulnerability assessment rule metadata details.
     *
     * @return the ruleMetadata value.
     */
    public VaRule ruleMetadata() {
        return this.ruleMetadata;
    }

    /**
     * Set the ruleMetadata property: vulnerability assessment rule metadata details.
     *
     * @param ruleMetadata the ruleMetadata value to set.
     * @return the ScanResultProperties object itself.
     */
    public ScanResultProperties withRuleMetadata(VaRule ruleMetadata) {
        this.ruleMetadata = ruleMetadata;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (remediation() != null) {
            remediation().validate();
        }
        if (baselineAdjustedResult() != null) {
            baselineAdjustedResult().validate();
        }
        if (ruleMetadata() != null) {
            ruleMetadata().validate();
        }
    }
}
