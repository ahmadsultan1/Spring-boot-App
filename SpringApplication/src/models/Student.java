package models;

import java.util.Date;

public class Student {
	
	
	private long id = (new Date()).getTime();
	private String firstName;
	private String lastName;
	private String subject;
	//private ArrayList lunch;
	
	
//	private static Long fileId = (new Date()).getTime();
//	private static String fileName;
//	private static Long timeStamp;
//	private static MultipartFile file;
	
//	public Student(String firstName, String lastName, String subject, ArrayList lunch) {
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.subject = subject;
//		this.lunch = lunch;
//	}
	
	public Student(long id, String firstName, String lastName, String subject) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.subject = subject;
	}
	
//	public Student(MultipartFile file, Long fileId, String fileName){
//		this.file = file;
//		this.fileId = fileId;
//		this.fileName = fileName;
//	}
	
	public Student(){
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
//	public String theString(){
//		return "Student{" +
//				"id="+ id +
//				", name='" +firstName+ '\''+
//				", subject= '" + subject +'\'' +
//				'}';
//	}
}
