package com.archana.api.tests;

import org.testng.annotations.Test;

import com.archana.api.base.BaseTest;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class EmployeePostTest extends BaseTest {

	@Test
	public void createEmployee() {

		String requestBody = """
				{
				    "name": "Automation User",
				    "email": "automation.user@test.com",
				    "department": "QA",
				    "role": "Automation Engineer"
				}
				""";

		Response response = given().contentType("application/json").body(requestBody)

				.when().post("/api/employees")

				.then().statusCode(200).body("id", notNullValue()).body("name", equalTo("Automation User"))
				.body("email", equalTo("automation.user@test.com")).body("department", equalTo("QA"))
				.body("role", equalTo("Automation Engineer")).extract().response();

		Long employeeId = response.jsonPath().getLong("id");

		given().baseUri("http://localhost:8080")

				.when().get("/api/employees/" + employeeId)

				.then().statusCode(200).body("id", equalTo(employeeId.intValue()))
				.body("name", equalTo("Automation User")).body("email", equalTo("automation.user@test.com"));
	}
}