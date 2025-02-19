// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A copy activity tabular translator. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("TabularTranslator")
@Fluent
public final class TabularTranslator extends CopyTranslator {
    /*
     * Column mappings. Example: "UserId: MyUserId, Group: MyGroup, Name: MyName" Type: string (or Expression with
     * resultType string). This property will be retired. Please use mappings property.
     */
    @JsonProperty(value = "columnMappings")
    private Object columnMappings;

    /*
     * The schema mapping to map between tabular data and hierarchical data. Example: {"Column1": "$.Column1",
     * "Column2": "$.Column2.Property1", "Column3": "$.Column2.Property2"}. Type: object (or Expression with resultType
     * object). This property will be retired. Please use mappings property.
     */
    @JsonProperty(value = "schemaMapping")
    private Object schemaMapping;

    /*
     * The JSON Path of the Nested Array that is going to do cross-apply. Type: object (or Expression with resultType
     * object).
     */
    @JsonProperty(value = "collectionReference")
    private Object collectionReference;

    /*
     * Whether to map complex (array and object) values to simple strings in json format. Type: boolean (or Expression
     * with resultType boolean).
     */
    @JsonProperty(value = "mapComplexValuesToString")
    private Object mapComplexValuesToString;

    /*
     * Column mappings with logical types. Tabular->tabular example:
     * [{"source":{"name":"CustomerName","type":"String"},"sink":{"name":"ClientName","type":"String"}}"
         + ",{"source":{"name":"CustomerAddress","type":"String"},"sink":{"name":"ClientAddress","type":"String"}}].
     * Hierarchical->tabular example:
     * [{"source":{"path":"$"
         + ".CustomerName","type":"String"},"sink":{"name":"ClientName","type":"String"}},{"source":{"path":"$"
         + ".CustomerAddress","type":"String"},"sink":{"name":"ClientAddress","type":"String"}}].
     * Type: object (or Expression with resultType object).
     */
    @JsonProperty(value = "mappings")
    private Object mappings;

    /*
     * Whether to enable the advanced type conversion feature in the Copy activity. Type: boolean (or Expression with
     * resultType boolean).
     */
    @JsonProperty(value = "typeConversion")
    private Object typeConversion;

    /*
     * Type conversion settings
     */
    @JsonProperty(value = "typeConversionSettings")
    private TypeConversionSettings typeConversionSettings;

    /** Creates an instance of TabularTranslator class. */
    public TabularTranslator() {
    }

    /**
     * Get the columnMappings property: Column mappings. Example: "UserId: MyUserId, Group: MyGroup, Name: MyName" Type:
     * string (or Expression with resultType string). This property will be retired. Please use mappings property.
     *
     * @return the columnMappings value.
     */
    public Object columnMappings() {
        return this.columnMappings;
    }

    /**
     * Set the columnMappings property: Column mappings. Example: "UserId: MyUserId, Group: MyGroup, Name: MyName" Type:
     * string (or Expression with resultType string). This property will be retired. Please use mappings property.
     *
     * @param columnMappings the columnMappings value to set.
     * @return the TabularTranslator object itself.
     */
    public TabularTranslator withColumnMappings(Object columnMappings) {
        this.columnMappings = columnMappings;
        return this;
    }

    /**
     * Get the schemaMapping property: The schema mapping to map between tabular data and hierarchical data. Example:
     * {"Column1": "$.Column1", "Column2": "$.Column2.Property1", "Column3": "$.Column2.Property2"}. Type: object (or
     * Expression with resultType object). This property will be retired. Please use mappings property.
     *
     * @return the schemaMapping value.
     */
    public Object schemaMapping() {
        return this.schemaMapping;
    }

    /**
     * Set the schemaMapping property: The schema mapping to map between tabular data and hierarchical data. Example:
     * {"Column1": "$.Column1", "Column2": "$.Column2.Property1", "Column3": "$.Column2.Property2"}. Type: object (or
     * Expression with resultType object). This property will be retired. Please use mappings property.
     *
     * @param schemaMapping the schemaMapping value to set.
     * @return the TabularTranslator object itself.
     */
    public TabularTranslator withSchemaMapping(Object schemaMapping) {
        this.schemaMapping = schemaMapping;
        return this;
    }

    /**
     * Get the collectionReference property: The JSON Path of the Nested Array that is going to do cross-apply. Type:
     * object (or Expression with resultType object).
     *
     * @return the collectionReference value.
     */
    public Object collectionReference() {
        return this.collectionReference;
    }

    /**
     * Set the collectionReference property: The JSON Path of the Nested Array that is going to do cross-apply. Type:
     * object (or Expression with resultType object).
     *
     * @param collectionReference the collectionReference value to set.
     * @return the TabularTranslator object itself.
     */
    public TabularTranslator withCollectionReference(Object collectionReference) {
        this.collectionReference = collectionReference;
        return this;
    }

    /**
     * Get the mapComplexValuesToString property: Whether to map complex (array and object) values to simple strings in
     * json format. Type: boolean (or Expression with resultType boolean).
     *
     * @return the mapComplexValuesToString value.
     */
    public Object mapComplexValuesToString() {
        return this.mapComplexValuesToString;
    }

    /**
     * Set the mapComplexValuesToString property: Whether to map complex (array and object) values to simple strings in
     * json format. Type: boolean (or Expression with resultType boolean).
     *
     * @param mapComplexValuesToString the mapComplexValuesToString value to set.
     * @return the TabularTranslator object itself.
     */
    public TabularTranslator withMapComplexValuesToString(Object mapComplexValuesToString) {
        this.mapComplexValuesToString = mapComplexValuesToString;
        return this;
    }

    /**
     * Get the mappings property: Column mappings with logical types. Tabular-&gt;tabular example:
     * [{"source":{"name":"CustomerName","type":"String"},"sink":{"name":"ClientName","type":"String"}}"
         + ",{"source":{"name":"CustomerAddress","type":"String"},"sink":{"name":"ClientAddress","type":"String"}}].
     * Hierarchical-&gt;tabular example:
     * [{"source":{"path":"$"
         + ".CustomerName","type":"String"},"sink":{"name":"ClientName","type":"String"}},{"source":{"path":"$"
         + ".CustomerAddress","type":"String"},"sink":{"name":"ClientAddress","type":"String"}}].
     * Type: object (or Expression with resultType object).
     *
     * @return the mappings value.
     */
    public Object mappings() {
        return this.mappings;
    }

    /**
     * Set the mappings property: Column mappings with logical types. Tabular-&gt;tabular example:
     * [{"source":{"name":"CustomerName","type":"String"},"sink":{"name":"ClientName","type":"String"}}"
         + ",{"source":{"name":"CustomerAddress","type":"String"},"sink":{"name":"ClientAddress","type":"String"}}].
     * Hierarchical-&gt;tabular example:
     * [{"source":{"path":"$"
         + ".CustomerName","type":"String"},"sink":{"name":"ClientName","type":"String"}},{"source":{"path":"$"
         + ".CustomerAddress","type":"String"},"sink":{"name":"ClientAddress","type":"String"}}].
     * Type: object (or Expression with resultType object).
     *
     * @param mappings the mappings value to set.
     * @return the TabularTranslator object itself.
     */
    public TabularTranslator withMappings(Object mappings) {
        this.mappings = mappings;
        return this;
    }

    /**
     * Get the typeConversion property: Whether to enable the advanced type conversion feature in the Copy activity.
     * Type: boolean (or Expression with resultType boolean).
     *
     * @return the typeConversion value.
     */
    public Object typeConversion() {
        return this.typeConversion;
    }

    /**
     * Set the typeConversion property: Whether to enable the advanced type conversion feature in the Copy activity.
     * Type: boolean (or Expression with resultType boolean).
     *
     * @param typeConversion the typeConversion value to set.
     * @return the TabularTranslator object itself.
     */
    public TabularTranslator withTypeConversion(Object typeConversion) {
        this.typeConversion = typeConversion;
        return this;
    }

    /**
     * Get the typeConversionSettings property: Type conversion settings.
     *
     * @return the typeConversionSettings value.
     */
    public TypeConversionSettings typeConversionSettings() {
        return this.typeConversionSettings;
    }

    /**
     * Set the typeConversionSettings property: Type conversion settings.
     *
     * @param typeConversionSettings the typeConversionSettings value to set.
     * @return the TabularTranslator object itself.
     */
    public TabularTranslator withTypeConversionSettings(TypeConversionSettings typeConversionSettings) {
        this.typeConversionSettings = typeConversionSettings;
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
        if (typeConversionSettings() != null) {
            typeConversionSettings().validate();
        }
    }
}
