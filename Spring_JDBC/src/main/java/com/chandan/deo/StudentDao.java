package com.chandan.deo;

import java.util.List;

import com.chandan.model.Student;

public interface StudentDao {
	public int insert(Student student);
	public int updateDetails(Student student);
	
	
	public int delete(int id);
	
	public Student getStudentById(int id);
	
	public List<Student> getAllStudent();

}
