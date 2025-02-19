// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DataFlowSourceSetting;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DataFlowSourceSettingTests {
    @Test
    public void testDeserialize() {
        DataFlowSourceSetting model =
            BinaryData
                .fromString("{\"sourceName\":\"qaatjinrv\",\"rowLimit\":162856777,\"\":{}}")
                .toObject(DataFlowSourceSetting.class);
        Assertions.assertEquals("qaatjinrv", model.sourceName());
        Assertions.assertEquals(162856777, model.rowLimit());
    }

    @Test
    public void testSerialize() {
        DataFlowSourceSetting model =
            new DataFlowSourceSetting()
                .withSourceName("qaatjinrv")
                .withRowLimit(162856777)
                .withAdditionalProperties(mapOf());
        model = BinaryData.fromObject(model).toObject(DataFlowSourceSetting.class);
        Assertions.assertEquals("qaatjinrv", model.sourceName());
        Assertions.assertEquals(162856777, model.rowLimit());
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
