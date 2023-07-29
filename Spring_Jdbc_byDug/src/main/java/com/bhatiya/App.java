package com.bhatiya;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.bhatiya.dao.StudentDao;
import com.bhatiya.dao.StudentDaoImple;
import com.bhatiya.entity.Student;

public class App 
{
    public static void main( String[] args )
    {
      
    	System.out.println("my program start");
    	//configerbased
    	//ApplicationContext context=new ClassPathXmlApplicationContext("com/bhatiya/configure.xml");
    	
    	ApplicationContext context=new AnnotationConfigApplicationContext(JdbcConfig.class);
    	
 StudentDao studentd=   context.getBean("studentdao", StudentDao.class);
/* 
 Student student=new Student();
 student.setId(4);
 student.setName("bhatiya");
 student.setAddress("guraru");
 
int result= studentd.insert(student);
 
System.out.println("student addedmys"+result); */
   
 /*
   Student student=new Student();
   student.setId(3);
   student.setName("aryan");
   student.setAddress("patna");
   
  int result= studentd.change(student);
  System.out.println("change data susessfully"+result); */
 
/* int result=studentd.delete(22);
   
 System.out.println("deleted sucessfully"+result);*/
		 
/*		 
Student student= studentd.getStudent(2)	;
System.out.println(student);*/
List<Student> students=studentd.getAllStudent();
for(Student s:students)
{
	System.out.println(s);
}
    	
    }
}
