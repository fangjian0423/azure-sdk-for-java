// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzureBlobFSReadSettings;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AzureBlobFSReadSettingsTests {
    @Test
    public void testDeserialize() {
        AzureBlobFSReadSettings model =
            BinaryData
                .fromString("{\"type\":\"AzureBlobFSReadSettings\",\"enablePartitionDiscovery\":true,\"\":{}}")
                .toObject(AzureBlobFSReadSettings.class);
        Assertions.assertEquals(true, model.enablePartitionDiscovery());
    }

    @Test
    public void testSerialize() {
        AzureBlobFSReadSettings model = new AzureBlobFSReadSettings().withEnablePartitionDiscovery(true);
        model = BinaryData.fromObject(model).toObject(AzureBlobFSReadSettings.class);
        Assertions.assertEquals(true, model.enablePartitionDiscovery());
    }
}
