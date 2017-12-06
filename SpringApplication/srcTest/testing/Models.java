package testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import models.Student;

public class Models {
	
	Student stu;
	
	@Before
	public void initStudent(){
		stu = new Student();
	}
	
	@Test
	public void getsetLastName(){
		stu.setLastName("lastName");
		assertEquals("lastName", stu.getLastName());
		
	}
	
	@Test
	public void getsetFirstName(){
		stu.setFirstName("firstName");
		assertEquals("firstName", stu.getFirstName());
	}
	
	@Test
	public void getsetcourse(){
		stu.setSubject("JUnit");
		assertEquals("JUnit", stu.getSubject());
		
	}
	
	@Test
	public void getSetId(){
		stu.setId(1);
		assertEquals(1, stu.getId());
		
		
	}

}
