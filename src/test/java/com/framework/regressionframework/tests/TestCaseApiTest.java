package com.framework.regressionframework.tests;

import com.framework.regressionframework.utils.JsonReader;
import com.fasterxml.jackson.databind.JsonNode;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCaseApiTest {

    @Test
    public void runApiTests() throws Exception {

        JsonNode root = JsonReader.readJson("testdata.json");

        // access the array inside "testcases"
        JsonNode testCases = root.get("testcases");

        for (JsonNode testCase : testCases) {

            String name = testCase.get("name").asText();
            String endpoint = testCase.get("endpoint").asText();
            int expectedStatus = testCase.get("expectedStatus").asInt();

            System.out.println("Running Test: " + name);

            Response response = RestAssured
                    .given()
                    .when()
                    .get(endpoint);

            int actualStatus = response.getStatusCode();

            System.out.println("Expected: " + expectedStatus);
            System.out.println("Actual: " + actualStatus);

            Assert.assertEquals(actualStatus, expectedStatus);
        }
    }
}