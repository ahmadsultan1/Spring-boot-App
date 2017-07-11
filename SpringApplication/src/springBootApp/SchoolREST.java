package springBootApp;


import java.io.OutputStream;
import java.util.HashMap;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import models.Student;

@RestController
@RequestMapping(value = "/rest/students")
public class SchoolREST {
	
	static Logger log = Logger.getLogger(SchoolREST.class);
	static Student student;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public HashMap<Long, Student> getAllStudent(){
		return SchoolImpl.getAllStudents();
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String AddStudent(@RequestBody Student student) {
		SchoolImpl.addStudent(student);
		return student.getFirstName() + "  "+student.getLastName() + " has been added";
		
	}

	 @RequestMapping(value = "/find/{id}", method = RequestMethod.GET)
	 public Student GetByStudent(@PathVariable Long id){
	 return SchoolImpl.findStudent(id);
	 }


	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public String DeleteStudent(@PathVariable Long id) throws Exception {
		return SchoolImpl.deleteStudent(id);
	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public String updateStudent(@RequestParam String id, @RequestBody Student student) throws Exception {
		SchoolImpl.updateStudent(id, student);
		return student.getFirstName() +"  "+ student.getLastName() + " has been updated";
		
	}
	
//	@RequestMapping(value = "/addfile", method = RequestMethod.POST)
//	public String addFile(@RequestParam("file") MultipartFile file, @RequestParam String fileName){
//		
//		SchoolImpl.addingFiles(file, fileName);
//		return fileName;
//	}

}
