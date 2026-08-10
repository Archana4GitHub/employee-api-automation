
package com.archana.api.tests;

import org.testng.annotations.Test;

import com.archana.api.base.BaseTest;

import static io.restassured.RestAssured.*;

public class EmployeeDeleteTest extends BaseTest {

    @Test
    public void deleteEmployee() {

        // Create a new employee
        int employeeId =
            given()
                .header("Content-Type", "application/json")
                .body("{"
                    + "\"name\":\"Delete Test User\","
                    + "\"email\":\"delete.test@example.com\","
                    + "\"department\":\"QA\","
                    + "\"role\":\"Automation Tester\""
                    + "}")
            .when()
                .post("/api/employees")
            .then()
                .statusCode(200)
                .extract()
                .path("id");

        // Delete the newly created employee
        given()
            .when()
                .delete("/api/employees/" + employeeId)
            .then()
                .statusCode(200);

        // Verify employee is deleted
        given()
            .when()
                .get("/api/employees/" + employeeId)
            .then()
                 .statusCode(404);
    }
}

