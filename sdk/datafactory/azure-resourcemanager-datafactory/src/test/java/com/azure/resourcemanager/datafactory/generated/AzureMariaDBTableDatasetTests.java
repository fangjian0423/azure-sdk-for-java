// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzureMariaDBTableDataset;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AzureMariaDBTableDatasetTests {
    @Test
    public void testDeserialize() {
        AzureMariaDBTableDataset model =
            BinaryData
                .fromString(
                    "{\"type\":\"AzureMariaDBTable\",\"typeProperties\":{},\"description\":\"fsxzecp\",\"linkedServiceName\":{\"referenceName\":\"kufykhvu\",\"parameters\":{}},\"parameters\":{\"tznabao\":{\"type\":\"Float\"},\"lujdjltymkmv\":{\"type\":\"Float\"},\"hywartspph\":{\"type\":\"Object\"},\"ky\":{\"type\":\"Bool\"}},\"annotations\":[],\"folder\":{\"name\":\"j\"},\"\":{}}")
                .toObject(AzureMariaDBTableDataset.class);
        Assertions.assertEquals("fsxzecp", model.description());
        Assertions.assertEquals("kufykhvu", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.FLOAT, model.parameters().get("tznabao").type());
        Assertions.assertEquals("j", model.folder().name());
    }

    @Test
    public void testSerialize() {
        AzureMariaDBTableDataset model =
            new AzureMariaDBTableDataset()
                .withDescription("fsxzecp")
                .withLinkedServiceName(
                    new LinkedServiceReference().withReferenceName("kufykhvu").withParameters(mapOf()))
                .withParameters(
                    mapOf(
                        "tznabao",
                        new ParameterSpecification().withType(ParameterType.FLOAT),
                        "lujdjltymkmv",
                        new ParameterSpecification().withType(ParameterType.FLOAT),
                        "hywartspph",
                        new ParameterSpecification().withType(ParameterType.OBJECT),
                        "ky",
                        new ParameterSpecification().withType(ParameterType.BOOL)))
                .withAnnotations(Arrays.asList())
                .withFolder(new DatasetFolder().withName("j"));
        model = BinaryData.fromObject(model).toObject(AzureMariaDBTableDataset.class);
        Assertions.assertEquals("fsxzecp", model.description());
        Assertions.assertEquals("kufykhvu", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.FLOAT, model.parameters().get("tznabao").type());
        Assertions.assertEquals("j", model.folder().name());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
