// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.
package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Base type for functions that can modify document scores during ranking. */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type",
        defaultImpl = ScoringFunction.class,
        visible = true)
@JsonTypeName("ScoringFunction")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "distance", value = DistanceScoringFunction.class),
    @JsonSubTypes.Type(name = "freshness", value = FreshnessScoringFunction.class),
    @JsonSubTypes.Type(name = "magnitude", value = MagnitudeScoringFunction.class),
    @JsonSubTypes.Type(name = "tag", value = TagScoringFunction.class)
})
@Fluent
public abstract class ScoringFunction {

    /*
     * The name of the field used as input to the scoring function.
     */
    @JsonProperty(value = "fieldName", required = true)
    private String fieldName;

    /*
     * A multiplier for the raw score. Must be a positive number not equal to 1.0.
     */
    @JsonProperty(value = "boost", required = true)
    private double boost;

    /*
     * A value indicating how boosting will be interpolated across document scores; defaults to "Linear".
     */
    @JsonProperty(value = "interpolation")
    private ScoringFunctionInterpolation interpolation;

    /**
     * Creates an instance of ScoringFunction class.
     *
     * @param fieldName the fieldName value to set.
     * @param boost the boost value to set.
     */
    @JsonCreator
    public ScoringFunction(
            @JsonProperty(value = "fieldName", required = true) String fieldName,
            @JsonProperty(value = "boost", required = true) double boost) {
        this.fieldName = fieldName;
        this.boost = boost;
    }

    /**
     * Get the fieldName property: The name of the field used as input to the scoring function.
     *
     * @return the fieldName value.
     */
    public String getFieldName() {
        return this.fieldName;
    }

    /**
     * Get the boost property: A multiplier for the raw score. Must be a positive number not equal to 1.0.
     *
     * @return the boost value.
     */
    public double getBoost() {
        return this.boost;
    }

    /**
     * Get the interpolation property: A value indicating how boosting will be interpolated across document scores;
     * defaults to "Linear".
     *
     * @return the interpolation value.
     */
    public ScoringFunctionInterpolation getInterpolation() {
        return this.interpolation;
    }

    /**
     * Set the interpolation property: A value indicating how boosting will be interpolated across document scores;
     * defaults to "Linear".
     *
     * @param interpolation the interpolation value to set.
     * @return the ScoringFunction object itself.
     */
    public ScoringFunction setInterpolation(ScoringFunctionInterpolation interpolation) {
        this.interpolation = interpolation;
        return this;
    }
}
