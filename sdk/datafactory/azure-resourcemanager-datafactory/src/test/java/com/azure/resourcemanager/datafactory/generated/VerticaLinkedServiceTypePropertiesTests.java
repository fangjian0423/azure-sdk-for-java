// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.VerticaLinkedServiceTypeProperties;
import com.azure.resourcemanager.datafactory.models.AzureKeyVaultSecretReference;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class VerticaLinkedServiceTypePropertiesTests {
    @Test
    public void testDeserialize() {
        VerticaLinkedServiceTypeProperties model =
            BinaryData
                .fromString(
                    "{\"pwd\":{\"type\":\"AzureKeyVaultSecret\",\"store\":{\"referenceName\":\"tdlpbn\",\"parameters\":{}}}}")
                .toObject(VerticaLinkedServiceTypeProperties.class);
        Assertions.assertEquals("tdlpbn", model.pwd().store().referenceName());
    }

    @Test
    public void testSerialize() {
        VerticaLinkedServiceTypeProperties model =
            new VerticaLinkedServiceTypeProperties()
                .withPwd(
                    new AzureKeyVaultSecretReference()
                        .withStore(new LinkedServiceReference().withReferenceName("tdlpbn").withParameters(mapOf())));
        model = BinaryData.fromObject(model).toObject(VerticaLinkedServiceTypeProperties.class);
        Assertions.assertEquals("tdlpbn", model.pwd().store().referenceName());
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
