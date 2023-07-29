package com.bhatiya;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class StudentEntity {
	
	private String name;
	
	private String email;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dob;
	
	private List<String> courses;
	
	private String gender;
	
	private String type;
	
	private Address address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "StudentEntity [name=" + name + ", email=" + email + ", dob=" + dob + ", courses=" + courses
				+ ", gender=" + gender + ", type=" + type + ", address=" + address + "]";
	}

	
	
	
	

}
