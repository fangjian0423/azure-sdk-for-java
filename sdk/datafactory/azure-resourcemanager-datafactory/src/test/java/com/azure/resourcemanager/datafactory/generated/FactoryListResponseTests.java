// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.FactoryInner;
import com.azure.resourcemanager.datafactory.models.FactoryIdentity;
import com.azure.resourcemanager.datafactory.models.FactoryIdentityType;
import com.azure.resourcemanager.datafactory.models.FactoryListResponse;
import com.azure.resourcemanager.datafactory.models.PublicNetworkAccess;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class FactoryListResponseTests {
    @Test
    public void testDeserialize() {
        FactoryListResponse model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"identity\":{\"type\":\"SystemAssigned,UserAssigned\",\"userAssignedIdentities\":{}},\"properties\":{\"provisioningState\":\"thwxmnteiwaopvkm\",\"createTime\":\"2021-06-21T07:18:55Z\",\"version\":\"mxdcufufsrp\",\"globalParameters\":{},\"publicNetworkAccess\":\"Enabled\"},\"eTag\":\"zcxtbzsgfyccsn\",\"\":{},\"location\":\"dwzjeiach\",\"tags\":{\"eeh\":\"sflnrosfqp\",\"swjdkirso\":\"zvypyqrimzinp\"},\"id\":\"dqxhcrmnohjtckwh\",\"name\":\"soifiyipjxsqw\",\"type\":\"gr\"},{\"identity\":{\"type\":\"UserAssigned\",\"userAssignedIdentities\":{}},\"properties\":{\"provisioningState\":\"xv\",\"createTime\":\"2021-11-14T01:20:47Z\",\"version\":\"xqabnmocpcysh\",\"globalParameters\":{},\"publicNetworkAccess\":\"Disabled\"},\"eTag\":\"j\",\"\":{},\"location\":\"toqcjmklja\",\"tags\":{\"pku\":\"idtqajzyu\",\"gqexzlocxs\":\"jkrlkhbzhfepg\",\"bcsglumma\":\"paierh\"},\"id\":\"tjaodxobnb\",\"name\":\"xkqpxo\",\"type\":\"ajionpimexgstxg\"},{\"identity\":{\"type\":\"SystemAssigned,UserAssigned\",\"userAssignedIdentities\":{}},\"properties\":{\"provisioningState\":\"jrmvdjwzrlo\",\"createTime\":\"2021-10-08T11:49:50Z\",\"version\":\"whijcoejctbza\",\"globalParameters\":{},\"publicNetworkAccess\":\"Disabled\"},\"eTag\":\"bfkgukdkex\",\"\":{},\"location\":\"ofmx\",\"tags\":{\"o\":\"fjpgddtocjjxhvp\"},\"id\":\"exhd\",\"name\":\"xibqeojnx\",\"type\":\"bzv\"}],\"nextLink\":\"ntwndeicbtwnpzao\"}")
                .toObject(FactoryListResponse.class);
        Assertions.assertEquals("dwzjeiach", model.value().get(0).location());
        Assertions.assertEquals("sflnrosfqp", model.value().get(0).tags().get("eeh"));
        Assertions
            .assertEquals(FactoryIdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED, model.value().get(0).identity().type());
        Assertions.assertEquals(PublicNetworkAccess.ENABLED, model.value().get(0).publicNetworkAccess());
        Assertions.assertEquals("ntwndeicbtwnpzao", model.nextLink());
    }

    @Test
    public void testSerialize() {
        FactoryListResponse model =
            new FactoryListResponse()
                .withValue(
                    Arrays
                        .asList(
                            new FactoryInner()
                                .withLocation("dwzjeiach")
                                .withTags(mapOf("eeh", "sflnrosfqp", "swjdkirso", "zvypyqrimzinp"))
                                .withIdentity(
                                    new FactoryIdentity()
                                        .withType(FactoryIdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED)
                                        .withUserAssignedIdentities(mapOf()))
                                .withGlobalParameters(mapOf())
                                .withPublicNetworkAccess(PublicNetworkAccess.ENABLED)
                                .withAdditionalProperties(
                                    mapOf(
                                        "name",
                                        "soifiyipjxsqw",
                                        "eTag",
                                        "zcxtbzsgfyccsn",
                                        "id",
                                        "dqxhcrmnohjtckwh",
                                        "type",
                                        "gr")),
                            new FactoryInner()
                                .withLocation("toqcjmklja")
                                .withTags(
                                    mapOf("pku", "idtqajzyu", "gqexzlocxs", "jkrlkhbzhfepg", "bcsglumma", "paierh"))
                                .withIdentity(
                                    new FactoryIdentity()
                                        .withType(FactoryIdentityType.USER_ASSIGNED)
                                        .withUserAssignedIdentities(mapOf()))
                                .withGlobalParameters(mapOf())
                                .withPublicNetworkAccess(PublicNetworkAccess.DISABLED)
                                .withAdditionalProperties(
                                    mapOf(
                                        "name", "xkqpxo", "eTag", "j", "id", "tjaodxobnb", "type", "ajionpimexgstxg")),
                            new FactoryInner()
                                .withLocation("ofmx")
                                .withTags(mapOf("o", "fjpgddtocjjxhvp"))
                                .withIdentity(
                                    new FactoryIdentity()
                                        .withType(FactoryIdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED)
                                        .withUserAssignedIdentities(mapOf()))
                                .withGlobalParameters(mapOf())
                                .withPublicNetworkAccess(PublicNetworkAccess.DISABLED)
                                .withAdditionalProperties(
                                    mapOf("name", "xibqeojnx", "eTag", "bfkgukdkex", "id", "exhd", "type", "bzv"))))
                .withNextLink("ntwndeicbtwnpzao");
        model = BinaryData.fromObject(model).toObject(FactoryListResponse.class);
        Assertions.assertEquals("dwzjeiach", model.value().get(0).location());
        Assertions.assertEquals("sflnrosfqp", model.value().get(0).tags().get("eeh"));
        Assertions
            .assertEquals(FactoryIdentityType.SYSTEM_ASSIGNED_USER_ASSIGNED, model.value().get(0).identity().type());
        Assertions.assertEquals(PublicNetworkAccess.ENABLED, model.value().get(0).publicNetworkAccess());
        Assertions.assertEquals("ntwndeicbtwnpzao", model.nextLink());
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
