// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A copy activity source for SAP HANA source. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("SapHanaSource")
@Fluent
public final class SapHanaSource extends TabularSource {
    /*
     * SAP HANA Sql query. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "query")
    private Object query;

    /*
     * The packet size of data read from SAP HANA. Type: integer(or Expression with resultType integer).
     */
    @JsonProperty(value = "packetSize")
    private Object packetSize;

    /*
     * The partition mechanism that will be used for SAP HANA read in parallel.
     */
    @JsonProperty(value = "partitionOption")
    private SapHanaPartitionOption partitionOption;

    /*
     * The settings that will be leveraged for SAP HANA source partitioning.
     */
    @JsonProperty(value = "partitionSettings")
    private SapHanaPartitionSettings partitionSettings;

    /**
     * Get the query property: SAP HANA Sql query. Type: string (or Expression with resultType string).
     *
     * @return the query value.
     */
    public Object getQuery() {
        return this.query;
    }

    /**
     * Set the query property: SAP HANA Sql query. Type: string (or Expression with resultType string).
     *
     * @param query the query value to set.
     * @return the SapHanaSource object itself.
     */
    public SapHanaSource setQuery(Object query) {
        this.query = query;
        return this;
    }

    /**
     * Get the packetSize property: The packet size of data read from SAP HANA. Type: integer(or Expression with
     * resultType integer).
     *
     * @return the packetSize value.
     */
    public Object getPacketSize() {
        return this.packetSize;
    }

    /**
     * Set the packetSize property: The packet size of data read from SAP HANA. Type: integer(or Expression with
     * resultType integer).
     *
     * @param packetSize the packetSize value to set.
     * @return the SapHanaSource object itself.
     */
    public SapHanaSource setPacketSize(Object packetSize) {
        this.packetSize = packetSize;
        return this;
    }

    /**
     * Get the partitionOption property: The partition mechanism that will be used for SAP HANA read in parallel.
     *
     * @return the partitionOption value.
     */
    public SapHanaPartitionOption getPartitionOption() {
        return this.partitionOption;
    }

    /**
     * Set the partitionOption property: The partition mechanism that will be used for SAP HANA read in parallel.
     *
     * @param partitionOption the partitionOption value to set.
     * @return the SapHanaSource object itself.
     */
    public SapHanaSource setPartitionOption(SapHanaPartitionOption partitionOption) {
        this.partitionOption = partitionOption;
        return this;
    }

    /**
     * Get the partitionSettings property: The settings that will be leveraged for SAP HANA source partitioning.
     *
     * @return the partitionSettings value.
     */
    public SapHanaPartitionSettings getPartitionSettings() {
        return this.partitionSettings;
    }

    /**
     * Set the partitionSettings property: The settings that will be leveraged for SAP HANA source partitioning.
     *
     * @param partitionSettings the partitionSettings value to set.
     * @return the SapHanaSource object itself.
     */
    public SapHanaSource setPartitionSettings(SapHanaPartitionSettings partitionSettings) {
        this.partitionSettings = partitionSettings;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SapHanaSource setQueryTimeout(Object queryTimeout) {
        super.setQueryTimeout(queryTimeout);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SapHanaSource setAdditionalColumns(Object additionalColumns) {
        super.setAdditionalColumns(additionalColumns);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SapHanaSource setSourceRetryCount(Object sourceRetryCount) {
        super.setSourceRetryCount(sourceRetryCount);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SapHanaSource setSourceRetryWait(Object sourceRetryWait) {
        super.setSourceRetryWait(sourceRetryWait);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SapHanaSource setMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.setMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }
}
