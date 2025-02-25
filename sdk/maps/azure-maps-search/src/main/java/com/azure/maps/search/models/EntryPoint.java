// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.search.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.models.GeoPosition;
import com.azure.maps.search.implementation.models.LatLongPairAbbreviated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The entry point for the POI being returned. */
@Fluent
public final class EntryPoint {
    /*
     * The type of entry point. Value can be either _main_ or _minor_.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private EntryPointType type;

    /*
     * A location represented as a latitude and longitude using short names
     * 'lat' & 'lon'.
     */
    @JsonProperty(value = "position")
    private LatLongPairAbbreviated position;

    /**
     * Get the type property: The type of entry point. Value can be either _main_ or _minor_.
     *
     * @return the type value.
     */
    public EntryPointType getType() {
        return this.type;
    }

    /**
     * Get the position property: A location represented as a latitude and longitude using short names 'lat' &amp;
     * 'lon'.
     *
     * @return the position value.
     */
    public GeoPosition getPosition() {
        LatLongPairAbbreviated returnValue = this.position;
        return new GeoPosition(returnValue.getLon(), returnValue.getLat());
    }
}
