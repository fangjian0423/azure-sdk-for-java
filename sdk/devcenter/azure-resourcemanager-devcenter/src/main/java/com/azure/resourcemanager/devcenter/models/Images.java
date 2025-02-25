// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Images. */
public interface Images {
    /**
     * Lists images for a devcenter.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription.
     * @param devCenterName The name of the devcenter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return results of the image list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Image> listByDevCenter(String resourceGroupName, String devCenterName);

    /**
     * Lists images for a devcenter.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription.
     * @param devCenterName The name of the devcenter.
     * @param top The maximum number of resources to return from the operation. Example: '$top=10'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return results of the image list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Image> listByDevCenter(String resourceGroupName, String devCenterName, Integer top, Context context);

    /**
     * Lists images for a gallery.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription.
     * @param devCenterName The name of the devcenter.
     * @param galleryName The name of the gallery.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return results of the image list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Image> listByGallery(String resourceGroupName, String devCenterName, String galleryName);

    /**
     * Lists images for a gallery.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription.
     * @param devCenterName The name of the devcenter.
     * @param galleryName The name of the gallery.
     * @param top The maximum number of resources to return from the operation. Example: '$top=10'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return results of the image list operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Image> listByGallery(
        String resourceGroupName, String devCenterName, String galleryName, Integer top, Context context);

    /**
     * Gets a gallery image.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription.
     * @param devCenterName The name of the devcenter.
     * @param galleryName The name of the gallery.
     * @param imageName The name of the image.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a gallery image along with {@link Response}.
     */
    Response<Image> getWithResponse(
        String resourceGroupName, String devCenterName, String galleryName, String imageName, Context context);

    /**
     * Gets a gallery image.
     *
     * @param resourceGroupName Name of the resource group within the Azure subscription.
     * @param devCenterName The name of the devcenter.
     * @param galleryName The name of the gallery.
     * @param imageName The name of the image.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a gallery image.
     */
    Image get(String resourceGroupName, String devCenterName, String galleryName, String imageName);
}
