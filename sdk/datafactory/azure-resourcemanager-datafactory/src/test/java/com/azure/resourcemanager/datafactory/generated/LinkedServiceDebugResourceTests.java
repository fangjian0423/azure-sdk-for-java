// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeReference;
import com.azure.resourcemanager.datafactory.models.LinkedService;
import com.azure.resourcemanager.datafactory.models.LinkedServiceDebugResource;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class LinkedServiceDebugResourceTests {
    @Test
    public void testDeserialize() {
        LinkedServiceDebugResource model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"type\":\"LinkedService\",\"connectVia\":{\"referenceName\":\"psvuoymgc\",\"parameters\":{}},\"description\":\"ezrypql\",\"parameters\":{\"erqwkyhkobopg\":{\"type\":\"Array\"},\"k\":{\"type\":\"Object\"},\"pbqpcrfkbwccsn\":{\"type\":\"String\"},\"dw\":{\"type\":\"SecureString\"}},\"annotations\":[],\"\":{}},\"name\":\"ftnkhtj\"}")
                .toObject(LinkedServiceDebugResource.class);
        Assertions.assertEquals("ftnkhtj", model.name());
        Assertions.assertEquals("psvuoymgc", model.properties().connectVia().referenceName());
        Assertions.assertEquals("ezrypql", model.properties().description());
        Assertions.assertEquals(ParameterType.ARRAY, model.properties().parameters().get("erqwkyhkobopg").type());
    }

    @Test
    public void testSerialize() {
        LinkedServiceDebugResource model =
            new LinkedServiceDebugResource()
                .withName("ftnkhtj")
                .withProperties(
                    new LinkedService()
                        .withConnectVia(
                            new IntegrationRuntimeReference().withReferenceName("psvuoymgc").withParameters(mapOf()))
                        .withDescription("ezrypql")
                        .withParameters(
                            mapOf(
                                "erqwkyhkobopg",
                                new ParameterSpecification().withType(ParameterType.ARRAY),
                                "k",
                                new ParameterSpecification().withType(ParameterType.OBJECT),
                                "pbqpcrfkbwccsn",
                                new ParameterSpecification().withType(ParameterType.STRING),
                                "dw",
                                new ParameterSpecification().withType(ParameterType.SECURE_STRING)))
                        .withAnnotations(Arrays.asList())
                        .withAdditionalProperties(mapOf("type", "LinkedService")));
        model = BinaryData.fromObject(model).toObject(LinkedServiceDebugResource.class);
        Assertions.assertEquals("ftnkhtj", model.name());
        Assertions.assertEquals("psvuoymgc", model.properties().connectVia().referenceName());
        Assertions.assertEquals("ezrypql", model.properties().description());
        Assertions.assertEquals(ParameterType.ARRAY, model.properties().parameters().get("erqwkyhkobopg").type());
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
