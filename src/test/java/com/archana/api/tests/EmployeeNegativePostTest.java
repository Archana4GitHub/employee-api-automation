package com.archana.api.tests;

import org.testng.annotations.Test;

import com.archana.api.base.BaseTest;

import static io.restassured.RestAssured.*;

public class EmployeeNegativePostTest extends BaseTest {

    @Test
    public void createEmployeeWithoutName() {

        String requestBody = """
                {
                    "email": "negative@test.com",
                    "department": "Engineering",
                    "role": "Tester"
                }
                """;

        given()
        
            .contentType("application/json")
            .body(requestBody)

        .when()
            .post("/api/employees")

        .then()
            .statusCode(400);
    }
}