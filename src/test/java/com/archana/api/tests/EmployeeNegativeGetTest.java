package com.archana.api.tests;

import org.testng.annotations.Test;

import com.archana.api.base.BaseTest;

import static io.restassured.RestAssured.*;

public class EmployeeNegativeGetTest extends BaseTest {

    @Test
    public void getNonExistingEmployee() {

        given()
           

        .when()
            .get("/api/employees/9999")

        .then()
            .statusCode(404);
    }
}