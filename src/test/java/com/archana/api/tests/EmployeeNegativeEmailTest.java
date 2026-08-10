package com.archana.api.tests;

import org.testng.annotations.Test;

import com.archana.api.base.BaseTest;

import static io.restassured.RestAssured.*;

public class EmployeeNegativeEmailTest extends BaseTest {

    @Test
    public void createEmployeeWithInvalidEmail() {

        String requestBody = """
                {
                    "name": "Invalid Email User",
                    "email": "invalid-email",
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