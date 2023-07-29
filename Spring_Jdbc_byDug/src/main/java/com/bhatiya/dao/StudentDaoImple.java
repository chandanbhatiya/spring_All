package com.bhatiya.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.bhatiya.entity.Student;

@Component("studentDao")
@ComponentScan(basePackages = {"com.bhatiya.dao"})
public class StudentDaoImple implements StudentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int insert(Student student) {
		String sql="insert into student(id,name,address) value(?,?,?)";
	int r=	this.jdbcTemplate.update(sql,student.getId(),student.getName(),student.getAddress());
		return r;
		
	
	}
	public int change(Student student) {
		//updating data
		String sql="update student set name=?,address=? where id=?";
	int r=	this.jdbcTemplate.update(sql,student.getName(),student.getAddress(),student.getId());
		
		return r;
	}
	public int delete(int studentId) {
		//delete date
		String sql="delete from student where id=?";
		int r=this.jdbcTemplate.update(sql,studentId);
		return r;
	}
	public Student getStudent(int StudentaId) {
		// selecting single data 
		String sql="select * from student where id=?";
		RowMapper<Student> rowMapper=new RowMapperImpl();
		
		Student student=this.jdbcTemplate.queryForObject(sql,rowMapper, StudentaId);
		return student;
	}
	public List<Student> getAllStudent() {
		// selecting multiple data
		String sql="select * from student";
	List<Student> student=	this.jdbcTemplate.query(sql,new  RowMapperImpl());
		return student;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	

}
