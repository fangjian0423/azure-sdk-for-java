// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.EnvironmentVariableSetup;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class EnvironmentVariableSetupTests {
    @Test
    public void testDeserialize() {
        EnvironmentVariableSetup model =
            BinaryData
                .fromString(
                    "{\"type\":\"EnvironmentVariableSetup\",\"typeProperties\":{\"variableName\":\"hgav\",\"variableValue\":\"czuejdtxptl\"}}")
                .toObject(EnvironmentVariableSetup.class);
        Assertions.assertEquals("hgav", model.variableName());
        Assertions.assertEquals("czuejdtxptl", model.variableValue());
    }

    @Test
    public void testSerialize() {
        EnvironmentVariableSetup model =
            new EnvironmentVariableSetup().withVariableName("hgav").withVariableValue("czuejdtxptl");
        model = BinaryData.fromObject(model).toObject(EnvironmentVariableSetup.class);
        Assertions.assertEquals("hgav", model.variableName());
        Assertions.assertEquals("czuejdtxptl", model.variableValue());
    }
}
