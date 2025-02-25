// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.VaultStorageConfigOperationResultResponseInner;
import org.junit.jupiter.api.Test;

public final class VaultStorageConfigOperationResultResponseInnerTests {
    @Test
    public void testDeserialize() {
        VaultStorageConfigOperationResultResponseInner model =
            BinaryData
                .fromString("{\"objectType\":\"VaultStorageConfigOperationResultResponse\"}")
                .toObject(VaultStorageConfigOperationResultResponseInner.class);
    }

    @Test
    public void testSerialize() {
        VaultStorageConfigOperationResultResponseInner model = new VaultStorageConfigOperationResultResponseInner();
        model = BinaryData.fromObject(model).toObject(VaultStorageConfigOperationResultResponseInner.class);
    }
}
