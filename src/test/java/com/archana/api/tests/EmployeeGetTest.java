package com.archana.api.tests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import com.archana.api.base.BaseTest;

public class EmployeeGetTest extends BaseTest {

	@Test
	public void getAllEmployees() {

		given()

				.when().get("/api/employees")

				.then().statusCode(200).body("$", not(empty()));

	}

	@Test
	public void getEmployeeById() {

		given()

				.when().get("/api/employees/18")

				.then().statusCode(200);
	}
}