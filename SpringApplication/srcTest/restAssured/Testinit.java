package restAssured;

import org.junit.BeforeClass;

import com.jayway.restassured.RestAssured;

public class Testinit {

	@BeforeClass
	public static void setupURL(){
		RestAssured.baseURI = "http://localhost:8080";
		RestAssured.port=8080;
		RestAssured.basePath = "/rest/students";
	}
}
