package com.framework.regressionframework.tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
        import static org.hamcrest.Matchers.*;

public class UserAPITest {

    @Test
    public void getUserTest() {

        Response response =
                RestAssured
                        .given()
                        .when()
                        .get("https://jsonplaceholder.typicode.com/users");

        response.then().statusCode(200);
    }
}