// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.spring.cloud.config.implementation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import com.azure.data.appconfiguration.models.ConfigurationSetting;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonConfigurationParserTest {

    private static final String JSON_CONTENT_TYPE_DATA = "src/test/resources/jsonContentTypeData.json";

    ObjectMapper jsonMapper = new ObjectMapper();

    @Test
    public void isJsonContentType() {
        assertTrue(JsonConfigurationParser.isJsonContentType("application/json"));
        assertTrue(JsonConfigurationParser.isJsonContentType("application/api+json"));
        assertTrue(JsonConfigurationParser.isJsonContentType("application/json+activity"));
        assertTrue(JsonConfigurationParser.isJsonContentType("application/vnd.xxxx+json"));
        assertTrue(JsonConfigurationParser.isJsonContentType("application/vnd.microsoft.appconfig.document+json"));
        assertFalse(JsonConfigurationParser.isJsonContentType("application"));
        assertFalse(JsonConfigurationParser.isJsonContentType("app/json"));
        assertFalse(JsonConfigurationParser.isJsonContentType("app/config"));
        assertFalse(JsonConfigurationParser.isJsonContentType("application/config"));
        assertFalse(JsonConfigurationParser.isJsonContentType(""));
        assertFalse(JsonConfigurationParser.isJsonContentType(null));
    }

    @Test
    public void parseJsonSettingTest() throws IOException {
        String key = "config.object";

        JsonNode json = jsonMapper.readValue(new File(JSON_CONTENT_TYPE_DATA), JsonNode.class);
        String jsonText = json.toPrettyString();

        ConfigurationSetting setting = new ConfigurationSetting().setKey(key).setValue(jsonText);

        Map<String, Object> settings = JsonConfigurationParser.parseJsonSetting(setting);
        assertEquals(13, settings.size());
    }

    @Test
    public void parseSettingTest() throws IOException {
        String currentKey = "config.object";
        JsonNode json = jsonMapper.readValue(new File(JSON_CONTENT_TYPE_DATA), JsonNode.class);
        HashMap<String, Object> settings = new HashMap<>();

        JsonConfigurationParser.parseSetting(currentKey, json, settings);

        assertEquals(13, settings.size());
    }

}
