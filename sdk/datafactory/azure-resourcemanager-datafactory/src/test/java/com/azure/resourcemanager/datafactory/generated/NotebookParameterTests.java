// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.NotebookParameter;
import com.azure.resourcemanager.datafactory.models.NotebookParameterType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class NotebookParameterTests {
    @Test
    public void testDeserialize() {
        NotebookParameter model = BinaryData.fromString("{\"type\":\"float\"}").toObject(NotebookParameter.class);
        Assertions.assertEquals(NotebookParameterType.FLOAT, model.type());
    }

    @Test
    public void testSerialize() {
        NotebookParameter model = new NotebookParameter().withType(NotebookParameterType.FLOAT);
        model = BinaryData.fromObject(model).toObject(NotebookParameter.class);
        Assertions.assertEquals(NotebookParameterType.FLOAT, model.type());
    }
}
