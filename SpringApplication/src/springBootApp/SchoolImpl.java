package springBootApp;

import java.io.OutputStream;
import java.util.HashMap;

import org.apache.log4j.Logger;
import org.springframework.web.multipart.MultipartFile;

import models.FileMetadata;
import models.Student;

public class SchoolImpl{
	
	
	final static Logger log = Logger.getLogger(SchoolImpl.class);
	static Student student;


	public static void addStudent(Student student) {
		App.hmStudent.put(new Long(student.getId()), student);
		DataStore.JsonConverter();
	}

	public static Student findStudent(Long id) {
		return App.hmStudent.get(new Long(id));
	}

	public static HashMap<Long, Student> getAllStudents() {
		return App.hmStudent;
	}


	public static String deleteStudent(Long id) {
		if (App.hmStudent.containsKey(new Long(id))) {
			
			student = App.hmStudent.get(new Long(id));
			App.hmStudent.remove(new Long(id));
		} else {
			try {
				throw new Exception("Student " + id + " does not exists");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		DataStore.JsonConverter();
		return student.getFirstName() + " "+ student.getLastName() + "has been deleted";
	}
	
	public static void updateStudent(String id, Student student){
		student.setId(Long.parseLong(id));
		if (App.hmStudent.containsKey(student.getId())) {
			App.hmStudent.put(new Long(student.getId()), student);
		} else {
			try {
				throw new Exception("Student " + student.getId() + " does not exist");
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		DataStore.JsonConverter();
	}
	
//	public static void addingFiles(MultipartFile file, String fileName){
//		DataStore.saveFile(file, fileName);
//	}
	
	

}
