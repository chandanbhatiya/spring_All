package com.chandan.xml;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.chandan.deo.StudentDao;
import com.chandan.model.Student;


public class App 
{
    

	public static void main( String[] args ) throws SQLException
    {
   ApplicationContext context = new  ClassPathXmlApplicationContext("com/chandan/xml/confi2.xml");
   
   /*
   JdbcTemplate jd= context.getBean("jdbcTemplate",JdbcTemplate.class);
   
   System.out.println(jd.getDataSource().getConnection());*/
   
  /* 
   String sql="insert into student(id,name,address) values(?,?,?)";
   int i=jd.update(sql,1,"chandan","Patna");
   System.out.println("sucessfully insert" +i);
   */
   /*insert*/
   /*String sql="insert into student(id,name,address) values(?,?,?)";
   int i=jd.update(sql,2,"bhatiya","aurangabad");
   System.out.println("sucessfully insert :"+i);*/
   
   /*update data*/
  /* String sql="update student set name=?,address=? where id=?";
 int i=  jd.update(sql,"chandan1","patna2",2);
 System.out.println("update sucessfully" +i); */
  
   
   /*delete data*/
  /* String sql="delete from student where id=?";
   int i=jd.update(sql, 3);
   System.out.println("delete sucessfully:" +i);
 */
   
   
 /* fatch data by id */
   /*String sql="select*from student where id=?";
   RowMapper rowMapper=new RowMapper() {

	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
	String name=rs.getString(2);
	
		return name;
	}
	   
	   
   };
  String name= jd.queryForObject(sql, rowMapper,1);
  System.out.println(name);*/
   
   
   
   
   /*
   String sql="select*from student ";
   RowMapper rowMapper=new RowMapper() {

	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
	String name=rs.getString(2);
	
		return name;
	}   
   };
  List<String> list =jd.query(sql,rowMapper);
  for(String name : list);
  {
	  
	System.out.println(name);
  }
   */
   
   /* peform dao standard*/
  StudentDao  dao= context.getBean("stdao",StudentDao.class);
  /*insert*/
  /*
  Student st=new Student();
  st.setId(3);
  st.setName("chandan");
  st.setAddress("gaya");
   
  int i= dao.insert(st);
  System.out.println("insert sucessfully"+i);*/
  
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

