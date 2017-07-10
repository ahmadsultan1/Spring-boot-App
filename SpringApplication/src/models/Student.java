package models;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

public class Student {
	
	
	private long id = (new Date()).getTime();
	private String firstName;
	private String lastName;
	private String subject;
	
	
	public Student(String firstName, String lastName, String subject) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.subject = subject;
	}
	
	public Student(long id, String firstName, String lastName, String subject) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.subject = subject;
	}
	
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
	
	@Override
	public String toString(){
		return "Student{" +
				"id="+ id +
				", name='" +firstName+ '\''+
				", subject= '" + subject +'\'' +
				'}';
	}
}
