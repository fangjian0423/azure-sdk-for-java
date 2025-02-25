// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.core.util.Context;

/** Samples for InstancePools List. */
public final class InstancePoolsListSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2018-06-01-preview/examples/ListInstancePoolsBySubscriptionId.json
     */
    /**
     * Sample code: List instance pools in the subscription.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listInstancePoolsInTheSubscription(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers().manager().serviceClient().getInstancePools().list(Context.NONE);
    }
}
