// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.loganalytics.models.WorkspacePurgeBody;
import com.azure.resourcemanager.loganalytics.models.WorkspacePurgeBodyFilters;
import java.util.Arrays;

/** Samples for WorkspacePurge Purge. */
public final class WorkspacePurgePurgeSamples {
    /*
     * x-ms-original-file: specification/operationalinsights/resource-manager/Microsoft.OperationalInsights/stable/2020-08-01/examples/WorkspacesPurgeResourceId.json
     */
    /**
     * Sample code: WorkspacePurgeResourceId.
     *
     * @param manager Entry point to LogAnalyticsManager.
     */
    public static void workspacePurgeResourceId(com.azure.resourcemanager.loganalytics.LogAnalyticsManager manager) {
        manager
            .workspacePurges()
            .purgeWithResponse(
                "OIAutoRest5123",
                "aztest5048",
                new WorkspacePurgeBody()
                    .withTable("Heartbeat")
                    .withFilters(
                        Arrays
                            .asList(
                                new WorkspacePurgeBodyFilters()
                                    .withColumn("_ResourceId")
                                    .withOperator("==")
                                    .withValue(
                                        "/subscriptions/12341234-1234-1234-1234-123412341234/resourceGroups/SomeResourceGroup/providers/microsoft.insights/components/AppInsightResource"))),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/operationalinsights/resource-manager/Microsoft.OperationalInsights/stable/2020-08-01/examples/WorkspacesPurge.json
     */
    /**
     * Sample code: WorkspacePurge.
     *
     * @param manager Entry point to LogAnalyticsManager.
     */
    public static void workspacePurge(com.azure.resourcemanager.loganalytics.LogAnalyticsManager manager) {
        manager
            .workspacePurges()
            .purgeWithResponse(
                "OIAutoRest5123",
                "aztest5048",
                new WorkspacePurgeBody()
                    .withTable("Heartbeat")
                    .withFilters(
                        Arrays
                            .asList(
                                new WorkspacePurgeBodyFilters()
                                    .withColumn("TimeGenerated")
                                    .withOperator(">")
                                    .withValue("2017-09-01T00:00:00"))),
                Context.NONE);
    }
}
