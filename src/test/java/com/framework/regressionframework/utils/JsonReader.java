package com.framework.regressionframework.utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;

public class JsonReader {

    public static JsonNode readJson(String fileName) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        InputStream input = JsonReader.class
                .getClassLoader()
                .getResourceAsStream(fileName);

        if (input == null) {
            throw new RuntimeException("JSON file not found: " + fileName);
        }

        return mapper.readTree(input);
    }
}