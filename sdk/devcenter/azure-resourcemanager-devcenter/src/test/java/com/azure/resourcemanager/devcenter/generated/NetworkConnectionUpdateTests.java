// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.models.NetworkConnectionUpdate;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class NetworkConnectionUpdateTests {
    @Test
    public void testDeserialize() {
        NetworkConnectionUpdate model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"subnetId\":\"o\",\"domainName\":\"ttpkiwkkbnujrywv\",\"organizationUnit\":\"lbfpncurd\",\"domainUsername\":\"wiithtywub\",\"domainPassword\":\"bihwqknfdnt\"},\"tags\":{\"dzjlu\":\"hrdgoihxumwcto\",\"wtovvtgsein\":\"dfdlwggyts\",\"knpirgnepttwq\":\"fiufx\",\"mqnrojlpijnkr\":\"sniffc\"},\"location\":\"rddh\"}")
                .toObject(NetworkConnectionUpdate.class);
        Assertions.assertEquals("hrdgoihxumwcto", model.tags().get("dzjlu"));
        Assertions.assertEquals("rddh", model.location());
        Assertions.assertEquals("o", model.subnetId());
        Assertions.assertEquals("ttpkiwkkbnujrywv", model.domainName());
        Assertions.assertEquals("lbfpncurd", model.organizationUnit());
        Assertions.assertEquals("wiithtywub", model.domainUsername());
        Assertions.assertEquals("bihwqknfdnt", model.domainPassword());
    }

    @Test
    public void testSerialize() {
        NetworkConnectionUpdate model =
            new NetworkConnectionUpdate()
                .withTags(
                    mapOf(
                        "dzjlu",
                        "hrdgoihxumwcto",
                        "wtovvtgsein",
                        "dfdlwggyts",
                        "knpirgnepttwq",
                        "fiufx",
                        "mqnrojlpijnkr",
                        "sniffc"))
                .withLocation("rddh")
                .withSubnetId("o")
                .withDomainName("ttpkiwkkbnujrywv")
                .withOrganizationUnit("lbfpncurd")
                .withDomainUsername("wiithtywub")
                .withDomainPassword("bihwqknfdnt");
        model = BinaryData.fromObject(model).toObject(NetworkConnectionUpdate.class);
        Assertions.assertEquals("hrdgoihxumwcto", model.tags().get("dzjlu"));
        Assertions.assertEquals("rddh", model.location());
        Assertions.assertEquals("o", model.subnetId());
        Assertions.assertEquals("ttpkiwkkbnujrywv", model.domainName());
        Assertions.assertEquals("lbfpncurd", model.organizationUnit());
        Assertions.assertEquals("wiithtywub", model.domainUsername());
        Assertions.assertEquals("bihwqknfdnt", model.domainPassword());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
