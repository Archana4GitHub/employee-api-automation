package com.archana.api.tests;

import org.testng.annotations.Test;

import com.archana.api.base.BaseTest;

import static io.restassured.RestAssured.*;

public class EmployeeNegativeDeleteTest extends BaseTest {

    @Test
    public void deleteNonExistingEmployee() {

        given()
           

        .when()
            .delete("/api/employees/9999")

        .then()
            .statusCode(404);
    }
}