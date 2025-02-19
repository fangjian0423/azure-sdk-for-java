// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.AppendVariableActivityTypeProperties;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AppendVariableActivityTypePropertiesTests {
    @Test
    public void testDeserialize() {
        AppendVariableActivityTypeProperties model =
            BinaryData
                .fromString("{\"variableName\":\"ctsfaeuhwwsknst\"}")
                .toObject(AppendVariableActivityTypeProperties.class);
        Assertions.assertEquals("ctsfaeuhwwsknst", model.variableName());
    }

    @Test
    public void testSerialize() {
        AppendVariableActivityTypeProperties model =
            new AppendVariableActivityTypeProperties().withVariableName("ctsfaeuhwwsknst");
        model = BinaryData.fromObject(model).toObject(AppendVariableActivityTypeProperties.class);
        Assertions.assertEquals("ctsfaeuhwwsknst", model.variableName());
    }
}
