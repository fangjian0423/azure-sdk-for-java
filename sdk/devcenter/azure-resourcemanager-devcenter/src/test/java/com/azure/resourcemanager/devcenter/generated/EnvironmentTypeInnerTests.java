// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.fluent.models.EnvironmentTypeInner;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class EnvironmentTypeInnerTests {
    @Test
    public void testDeserialize() {
        EnvironmentTypeInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"provisioningState\":\"wsvlxotogtwrupqs\"},\"tags\":{\"notyfjfcnjbkcn\":\"micykvceoveilo\"},\"id\":\"hbttkphyw\",\"name\":\"nv\",\"type\":\"t\"}")
                .toObject(EnvironmentTypeInner.class);
        Assertions.assertEquals("micykvceoveilo", model.tags().get("notyfjfcnjbkcn"));
    }

    @Test
    public void testSerialize() {
        EnvironmentTypeInner model = new EnvironmentTypeInner().withTags(mapOf("notyfjfcnjbkcn", "micykvceoveilo"));
        model = BinaryData.fromObject(model).toObject(EnvironmentTypeInner.class);
        Assertions.assertEquals("micykvceoveilo", model.tags().get("notyfjfcnjbkcn"));
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
