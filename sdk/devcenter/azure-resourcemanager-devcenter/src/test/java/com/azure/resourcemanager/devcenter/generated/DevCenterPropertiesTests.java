// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.fluent.models.DevCenterProperties;
import org.junit.jupiter.api.Test;

public final class DevCenterPropertiesTests {
    @Test
    public void testDeserialize() {
        DevCenterProperties model =
            BinaryData.fromString("{\"provisioningState\":\"ilzyd\"}").toObject(DevCenterProperties.class);
    }

    @Test
    public void testSerialize() {
        DevCenterProperties model = new DevCenterProperties();
        model = BinaryData.fromObject(model).toObject(DevCenterProperties.class);
    }
}
