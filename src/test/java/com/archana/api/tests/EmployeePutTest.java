package com.archana.api.tests;

import org.testng.annotations.Test;

import com.archana.api.base.BaseTest;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class EmployeePutTest extends BaseTest{

    @Test
    public void updateEmployee() {

        String requestBody = """
                {
                    "name": "Updated Automation User",
                    "email": "updated.user@test.com",
                    "department": "Engineering",
                    "role": "Senior Automation Engineer"
                }
                """;

        given()
            .contentType("application/json")
            .body(requestBody)

        .when()
            .put("/api/employees/18")

        .then()
            .statusCode(200)
            .body("id", equalTo(18))
            .body("name", equalTo("Updated Automation User"))
            .body("email", equalTo("updated.user@test.com"))
            .body("department", equalTo("Engineering"))
            .body("role", equalTo("Senior Automation Engineer"));

        // Verify updated employee using GET
        given()
            .baseUri("http://localhost:8080")

        .when()
            .get("/api/employees/18")

        .then()
            .statusCode(200)
            .body("id", equalTo(18))
            .body("name", equalTo("Updated Automation User"))
            .body("email", equalTo("updated.user@test.com"))
            .body("department", equalTo("Engineering"))
            .body("role", equalTo("Senior Automation Engineer"));
    }
}