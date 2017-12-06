package restAssured;

import static com.jayway.restassured.RestAssured.given;

import org.junit.Test;

import com.jayway.restassured.http.ContentType;
import models.Student;

public class ApiRestAssured extends Testinit {
//	Student student = new Student(1234567, "will", "little", "wc");
	
	
	@Test
	public void addStudent(){
		Student student = new Student();
		student.setFirstName("Ahmad");
		student.setLastName("sultan");
		student.setSubject("cucumber");
		
		
		given()
		.contentType(ContentType.JSON)
		.when()
		.body(student)
		.post("/add")
		.then()
		.statusCode(200);
		
		
	}
	
	
	@Test
	public void updateStudent(){
		String Id = "1234567";
		
		Student student = new Student();
		student.setFirstName("ahmad");
		student.setLastName("sultan");
		student.setSubject("cucumber");
		
		given()
		.contentType(ContentType.JSON)
		.when()
		.body(student)
		.put("/update/?id="+Id)
		.then()
		.statusCode(200);
		
	}
	
	@Test
	public void deleteStudent(){
		String Id= "12";
		
		given()
		.when()
		.delete("/delete/"+Id)
		.then()
		.statusCode(200);
	}
	
	@Test
	public void findStudent(){
		String Id = "342334";
		
		given()
		.when()
		.get("/find/"+Id)
		.then()
		.statusCode(200);
		}	
	
	@Test
	public void getAllStudents(){
		given()
		.when()
		.get("/")
		.then()
		.statusCode(200);
	}
	
	

}
