package com.framework.regressionframework.tests;

import com.framework.regressionframework.utils.JsonReader;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import com.fasterxml.jackson.databind.JsonNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCaseApiTest {

    @Test
    public void runTestFromJson() throws Exception {

        JsonNode testData = JsonReader.readJson("testdata.json");

        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        for (JsonNode testCase : testData.get("testcases")) {

            String name = testCase.get("name").asText();
            String endpoint = testCase.get("endpoint").asText();
            int expectedStatus = testCase.get("expectedStatus").asInt();

            Response response =
                    RestAssured
                            .given()
                            .when()
                            .get(endpoint);

            System.out.println("=================================");
            System.out.println("Running Test Case: " + name);
            System.out.println("Endpoint: " + endpoint);
            System.out.println("Expected Status: " + expectedStatus);
            System.out.println("Actual Status: " + response.getStatusCode());
            System.out.println("=================================");

            Assertions.assertEquals(expectedStatus, response.getStatusCode());
        }
    }
}