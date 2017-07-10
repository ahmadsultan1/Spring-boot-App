package springBootApp;

import java.util.HashMap;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import models.Student;

@SpringBootApplication
public class App {
	
	public static HashMap<Long, Student> hmStudent;
	public static void main(String [] args){
		SpringApplication.run(App.class, args);
		hmStudent = new HashMap<Long, Student>();
		
	}

	
}
