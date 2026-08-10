package com.archana.api.tests;

import org.testng.annotations.Test;

import com.archana.api.base.BaseTest;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class EmployeeGetByIdTest extends BaseTest {

    @Test
    public void getEmployeeById() {

        given()
           

        .when()
            .get("/api/employees/18")

        .then()
            .statusCode(200)
            .body("id", equalTo(18));
    }
}