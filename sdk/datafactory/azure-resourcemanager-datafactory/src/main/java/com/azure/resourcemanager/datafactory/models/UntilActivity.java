// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.UntilActivityTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * This activity executes inner activities until the specified boolean expression results to true or timeout is reached,
 * whichever is earlier.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Until")
@Fluent
public final class UntilActivity extends ControlActivity {
    /*
     * Until activity properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private UntilActivityTypeProperties innerTypeProperties = new UntilActivityTypeProperties();

    /** Creates an instance of UntilActivity class. */
    public UntilActivity() {
    }

    /**
     * Get the innerTypeProperties property: Until activity properties.
     *
     * @return the innerTypeProperties value.
     */
    private UntilActivityTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /** {@inheritDoc} */
    @Override
    public UntilActivity withName(String name) {
        super.withName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public UntilActivity withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public UntilActivity withDependsOn(List<ActivityDependency> dependsOn) {
        super.withDependsOn(dependsOn);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public UntilActivity withUserProperties(List<UserProperty> userProperties) {
        super.withUserProperties(userProperties);
        return this;
    }

    /**
     * Get the expression property: An expression that would evaluate to Boolean. The loop will continue until this
     * expression evaluates to true.
     *
     * @return the expression value.
     */
    public Expression expression() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().expression();
    }

    /**
     * Set the expression property: An expression that would evaluate to Boolean. The loop will continue until this
     * expression evaluates to true.
     *
     * @param expression the expression value to set.
     * @return the UntilActivity object itself.
     */
    public UntilActivity withExpression(Expression expression) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new UntilActivityTypeProperties();
        }
        this.innerTypeProperties().withExpression(expression);
        return this;
    }

    /**
     * Get the timeout property: Specifies the timeout for the activity to run. If there is no value specified, it takes
     * the value of TimeSpan.FromDays(7) which is 1 week as default. Type: string (or Expression with resultType
     * string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])). Type: string (or Expression with
     * resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     *
     * @return the timeout value.
     */
    public Object timeout() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().timeout();
    }

    /**
     * Set the timeout property: Specifies the timeout for the activity to run. If there is no value specified, it takes
     * the value of TimeSpan.FromDays(7) which is 1 week as default. Type: string (or Expression with resultType
     * string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])). Type: string (or Expression with
     * resultType string), pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     *
     * @param timeout the timeout value to set.
     * @return the UntilActivity object itself.
     */
    public UntilActivity withTimeout(Object timeout) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new UntilActivityTypeProperties();
        }
        this.innerTypeProperties().withTimeout(timeout);
        return this;
    }

    /**
     * Get the activities property: List of activities to execute.
     *
     * @return the activities value.
     */
    public List<Activity> activities() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().activities();
    }

    /**
     * Set the activities property: List of activities to execute.
     *
     * @param activities the activities value to set.
     * @return the UntilActivity object itself.
     */
    public UntilActivity withActivities(List<Activity> activities) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new UntilActivityTypeProperties();
        }
        this.innerTypeProperties().withActivities(activities);
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
        if (innerTypeProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerTypeProperties in model UntilActivity"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(UntilActivity.class);
}
