package com.chandan;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.chandan.dao.StudentDao;

public class App 
{
    public static void main( String[] args )
    {
        
    	
   ApplicationContext context=new ClassPathXmlApplicationContext("com/chandan/configure.xml");
   
  /* HibernateTemplate temp=context.getBean("template",HibernateTemplate.class);
   
   System.out.println("sucessfully run :" +temp); */
   
   
  StudentDao dao= context.getBean("stDao" , StudentDao.class);
  /*
  Student st=new Student();
  st.setId(5);
  st.setName("chhh");
  st.setAddress("maha");*/
 
  /*
 int i= dao.saveStudent(st);
  
   
    System.out.println("data insert sucessfully" +i);*/
    
   /* 
    Student st=dao.getStudent(3);
    System.out.println(st);
    */
  
  /*
  List<Student> list=dao.getAllStudent();
  for( Student st:list)
  {
	  System.out.println(st);
  }
    */
  
  /*
  Student st=new Student();
  st.setId(5);
  st.setName("chhhbb");
  st.setAddress("mahadeo");
  dao.updateStudent(st);
  System.out.println("update sucessfully");}*/
  
  dao.deleteStudent(2);
  List<Student> list=dao.getAllStudent();
  for( Student st:list)
  {
	  System.out.println(st);
    }
  
  
    }
    }
