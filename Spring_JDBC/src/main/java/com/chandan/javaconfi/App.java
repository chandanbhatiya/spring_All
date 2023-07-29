package com.chandan.javaconfi;

import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.chandan.deo.StudentDao;
import com.chandan.model.Student;

public class App {

	public static void main(String[] args) throws SQLException {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(config.class);

		JdbcTemplate jd=context.getBean("jdbc",JdbcTemplate.class);
		System.out.println(jd.getDataSource().getConnection());
		
		
		/* Sting sql="insert into student(id,name,addess) value(?,?,?)";
		 * int i=jd.update(sql,2,"chandan","gaya");
		 * System.out.println("sucessfully insert :+i);
		 */
		
		 /* peform dao standard*/
		  StudentDao  dao= context.getBean("stdao",StudentDao.class);
		  /*insert*/
		  
		  Student st=new Student();
		  st.setId(4);
		  st.setName("chandu");
		  st.setAddress("guraru gaya");
		   
		  int i= dao.insert(st);
		  System.out.println("insert sucessfully"+i);
		  
		  /*update details*/
		  /*
		  Student st=new Student();
		  st.setId(3);
		  st.setName("bhatiya");
		  st.setAddress("gaya bihar");
		  int i= dao.updateDetails(st);
		  System.out.println("update sucessfully"+i);*/
		  /*delete data*/
		  /*
		  int i=dao.delete(3);
		  System.out.println("delete sucessfully"+i);*/
		  
		  /*fatching data one student*/
		/*  Student st= dao.getStudentById(2);
		  System.out.println(st);*/
		  
		  List<Student> list=dao.getAllStudent();
		  for(Student sts:list) {
			  System.out.println(sts);
		  }
	}

}
