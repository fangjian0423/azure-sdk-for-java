// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.hybridnetwork.fluent.models.NetworkFunctionInner;
import com.azure.resourcemanager.hybridnetwork.models.TagsObject;

/** An instance of this class provides access to all the operations defined in NetworkFunctionsClient. */
public interface NetworkFunctionsClient {
    /**
     * Deletes the specified network function resource. This operation can take up to 1 hour to complete. This is
     * expected service behavior.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkFunctionName The name of the network function.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String networkFunctionName);

    /**
     * Deletes the specified network function resource. This operation can take up to 1 hour to complete. This is
     * expected service behavior.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkFunctionName The name of the network function.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String networkFunctionName, Context context);

    /**
     * Deletes the specified network function resource. This operation can take up to 1 hour to complete. This is
     * expected service behavior.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkFunctionName The name of the network function.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String networkFunctionName);

    /**
     * Deletes the specified network function resource. This operation can take up to 1 hour to complete. This is
     * expected service behavior.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkFunctionName The name of the network function.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String networkFunctionName, Context context);

    /**
     * Gets information about the specified network function resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkFunctionName The name of the network function resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified network function resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<NetworkFunctionInner> getByResourceGroupWithResponse(
        String resourceGroupName, String networkFunctionName, Context context);

    /**
     * Gets information about the specified network function resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkFunctionName The name of the network function resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified network function resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NetworkFunctionInner getByResourceGroup(String resourceGroupName, String networkFunctionName);

    /**
     * Creates or updates a network function resource. This operation can take up to 6 hours to complete. This is
     * expected service behavior.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkFunctionName Resource name for the network function resource.
     * @param parameters Parameters supplied in the body to the create or update network function operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of network function resource response.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<NetworkFunctionInner>, NetworkFunctionInner> beginCreateOrUpdate(
        String resourceGroupName, String networkFunctionName, NetworkFunctionInner parameters);

    /**
     * Creates or updates a network function resource. This operation can take up to 6 hours to complete. This is
     * expected service behavior.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkFunctionName Resource name for the network function resource.
     * @param parameters Parameters supplied in the body to the create or update network function operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of network function resource response.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<NetworkFunctionInner>, NetworkFunctionInner> beginCreateOrUpdate(
        String resourceGroupName, String networkFunctionName, NetworkFunctionInner parameters, Context context);

    /**
     * Creates or updates a network function resource. This operation can take up to 6 hours to complete. This is
     * expected service behavior.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkFunctionName Resource name for the network function resource.
     * @param parameters Parameters supplied in the body to the create or update network function operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return network function resource response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NetworkFunctionInner createOrUpdate(
        String resourceGroupName, String networkFunctionName, NetworkFunctionInner parameters);

    /**
     * Creates or updates a network function resource. This operation can take up to 6 hours to complete. This is
     * expected service behavior.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkFunctionName Resource name for the network function resource.
     * @param parameters Parameters supplied in the body to the create or update network function operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return network function resource response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NetworkFunctionInner createOrUpdate(
        String resourceGroupName, String networkFunctionName, NetworkFunctionInner parameters, Context context);

    /**
     * Updates the tags for the network function resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkFunctionName Resource name for the network function resource.
     * @param parameters Parameters supplied to the update network function tags operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return network function resource response along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<NetworkFunctionInner> updateTagsWithResponse(
        String resourceGroupName, String networkFunctionName, TagsObject parameters, Context context);

    /**
     * Updates the tags for the network function resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param networkFunctionName Resource name for the network function resource.
     * @param parameters Parameters supplied to the update network function tags operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return network function resource response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    NetworkFunctionInner updateTags(String resourceGroupName, String networkFunctionName, TagsObject parameters);

    /**
     * Lists all the network functions in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for network function API service call as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NetworkFunctionInner> list();

    /**
     * Lists all the network functions in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for network function API service call as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NetworkFunctionInner> list(Context context);

    /**
     * Lists all the network function resources in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for network function API service call as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NetworkFunctionInner> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all the network function resources in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for network function API service call as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<NetworkFunctionInner> listByResourceGroup(String resourceGroupName, Context context);
}
