package com.framework.regressionframework.tests;

import com.framework.regressionframework.utils.JsonReader;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import com.fasterxml.jackson.databind.JsonNode;
import io.restassured.response.ValidatableResponse;
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


            Response rawResponse = RestAssured
                    .given()
                    .log().all()
                    .when()
                    .get(endpoint);

            int actualStatus = rawResponse.getStatusCode();

            System.out.println("=================================");
            System.out.println("Running Test Case: " + name);
            System.out.println("Endpoint: " + endpoint);
            System.out.println("Expected Status: " + expectedStatus);
            System.out.println("Actual Status: " + actualStatus);
            System.out.println("=================================");


            rawResponse.then()
                    .log().all()
                    .statusCode(expectedStatus);

            Assertions.assertEquals(expectedStatus, actualStatus,
                    "Test failed for: " + name + " | Endpoint: " + endpoint);
        }
    }
}
