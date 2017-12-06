package testing;

import models.Student;
import springBootApp.SchoolREST;

public class SchoolService {
	
//	@Before
//	public void runBefore(){
	Student stu = new Student();
//	stu.setId(1);
//	SchoolImpl imp = new SchoolImpl();
	SchoolREST SR = new SchoolREST();
//	}
	
	public void addStudent(){
		stu.setId(1);
		stu.setFirstName("a");
		stu.setLastName("b");
		stu.setSubject("JUnit");
		
//		String returnMessage = stu.getFirstName() + " "+ stu.getLastName()+ " has been added";
//		String actual = SR.AddStudent(stu);
		
		
		//assertSame(actual, returnMessage);
		
		
		
	}

}
