package com.archana.api.tests;

import org.testng.annotations.Test;

import com.archana.api.base.BaseTest;

import static io.restassured.RestAssured.*;

public class EmployeeNegativePutTest extends BaseTest {

    @Test
    public void updateNonExistingEmployee() {

        String requestBody = """
                {
                    "name": "Non Existing User",
                    "email": "nonexisting@test.com",
                    "department": "Engineering",
                    "role": "Tester"
                }
                """;

        given()
            .contentType("application/json")
            .body(requestBody)

        .when()
            .put("/api/employees/9999")

        .then()
            .statusCode(404);
    }
}