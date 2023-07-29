package com.bhatiya.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.bhatiya.entity.Student;

public class StudentDao {
	
	private HibernateTemplate hibernateTemplate;
@Transactional
	public int insert(Student student)
	{
		int i=(Integer) this.hibernateTemplate.save(student);
		return i;
	}

	//get the single data
	@Transactional
	public Student getStudent(int studentId)
	{
		Student student=this.hibernateTemplate.get(Student.class, studentId);
		return student;
	}
	
	//get All student(all rows)
	public List<Student> getAllStudent()
	{
		List<Student> student=this.hibernateTemplate.loadAll(Student.class);
		return student;
	}
	//delete data
	public void deleteStudent(int studentId)
	{
		Student student=this.hibernateTemplate.get(Student.class, studentId);
		this.hibernateTemplate.delete(student);
	}
	//updatting data
	public void updateStudent(Student student)
	{
		this.hibernateTemplate.update(student);
	}
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	

}
