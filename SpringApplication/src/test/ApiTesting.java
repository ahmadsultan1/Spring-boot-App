package test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import io.restassured.builder.*;
import io.restassured.specification.RequestSpecification;
import models.Student;

public class ApiTesting {

	private static RequestSpecification requestSpec;
	
	private String metadata = "{"
			+ "\"firstName\"" +":" + "\"firstName\"" + "," 
			+ "\"lastName\"" +":" + "\"lastName\"" + ","
			+ "\"subject\"" +":" + "\"subject\"" 
			+ "}";
	
	@BeforeClass
	public static void setUp()
	{
		requestSpec = new RequestSpecBuilder()
				.setBaseUri("http://localhost:8080/rest/students/")
				.build();
	}
	
	@Test
	public void get_200_after_succesfully_adding_a_student()
	{
		given()
			.spec(requestSpec)
			.contentType("application/json")
			.body(metadata)
		.when()
			.post("add/")
		.then()
			.statusCode(200);
	}
	
	@Test
	public void get_200_after_adding_a_student_with_no_body()
	{
		given()
			.spec(requestSpec)
			.contentType("application/json")
		.when()
			.post("add/")
		.then()
			.statusCode(400);
	}
	
	@Test
	public void proper_response_body_after_succesfully_adding_a_student()
	{
		String response = given()
			.spec(requestSpec)
			.contentType("application/json")
			.body(metadata)
		.when()
			.post("add/")
		.then()
			.extract()
			.response()
			.body()
			.asString();
		
		assertEquals(response, "firstName  lastName has been added");
	}
	
	@Test
	public void get_200_after_successfully_deleting_a_student(){
		given()
			.spec(requestSpec)
			.contentType("application/json")
		.when()
			.delete("delete/1395056")
		.then()
			.statusCode(200);
	}
	
	
	@Test
	public void get_response_after_successfully_deleting_a_student(){
		String response = 
				given()
					.spec(requestSpec)
					.contentType("application/json")
				.when()
					.delete("delete/1395056")
				.then()
					.extract()
					.response()
					.body()
					.asString();
		assertEquals(response, "firstName lastName he gone now");
	}
	
	
	@Test
	public void get_200_after_succesfully_updating_a_student()
	{
		given()
			.spec(requestSpec)
			.contentType("application/json")
			.body(metadata)
		.when()
			.put("update/?id=3974237")
		.then()
			.statusCode(200);
	}
	
	@Test
	public void proper_response_body_after_succesfully_updating_a_student()
	{
		String response = given()
			.spec(requestSpec)
			.contentType("application/json")
			.body(metadata)
		.when()
			.put("update/?id=3974237")
		.then()
			.extract()
			.response()
			.body()
			.asString();
		
		assertEquals(response, "firstName  lastName has been updated");
	}
	
	
	@Test
	public void get_200_after_succesfully_finding_a_student()
	{
		given()
			.spec(requestSpec)
			.contentType("application/json")
		.when()
			.put("find/72")
		.then()
			.statusCode(200);
	}
	
	
	@Test
	public void finding_student_using_id()
	{
		String response =
				given()
					.spec(requestSpec)
					.contentType("application/json")
				.when()
					.get("find/72")
				.then()
					.extract()
					.response()
					.body()
					.toString();
		assertEquals(response, "72, Ahmad, Sultan, jaaaava");
}
}
