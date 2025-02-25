// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.recoveryservices.fluent.models.OperationResourceInner;
import com.azure.resourcemanager.recoveryservices.fluent.models.VaultInner;

/** An instance of this class provides access to all the operations defined in ResourceProvidersClient. */
public interface ResourceProvidersClient {
    /**
     * Gets the operation status for a resource.
     *
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param vaultName The name of the recovery services vault.
     * @param operationId The operationId parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the operation status for a resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    OperationResourceInner getOperationStatus(String resourceGroupName, String vaultName, String operationId);

    /**
     * Gets the operation status for a resource.
     *
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param vaultName The name of the recovery services vault.
     * @param operationId The operationId parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the operation status for a resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<OperationResourceInner> getOperationStatusWithResponse(
        String resourceGroupName, String vaultName, String operationId, Context context);

    /**
     * Gets the operation result for a resource.
     *
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param vaultName The name of the recovery services vault.
     * @param operationId The operationId parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the operation result for a resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VaultInner getOperationResult(String resourceGroupName, String vaultName, String operationId);

    /**
     * Gets the operation result for a resource.
     *
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param vaultName The name of the recovery services vault.
     * @param operationId The operationId parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the operation result for a resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<VaultInner> getOperationResultWithResponse(
        String resourceGroupName, String vaultName, String operationId, Context context);
}
