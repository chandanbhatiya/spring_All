package com.bhatiya;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bhatiya.dao.StudentDao;
import com.bhatiya.entity.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "orm start" );
        
        ApplicationContext context=new ClassPathXmlApplicationContext("configure.xml");
       StudentDao studentd= context.getBean("studentDao",StudentDao.class);
      // Student student=new Student(12,"chandan bhatiya","gaya");
       
       
   // int r=   studentd.insert(student);
    //System.out.println("orm done"+r);
       boolean go=true;
       while(go) {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("press 1 for add new student");
       System.out.println("press 2 for dispay all students");
       System.out.println("press 3 for get details of students");
       System.out.println("press 4 for delete students");
       System.out.println("press 5 for update data for student");
       System.out.println("press 6 for exit");
       try {
    	 int input=  Integer.parseInt(br.readLine());
    	 
    	 switch (input) {
		case 1:
			//add a student
			//tacking user to input
			System.out.println("Enter user id");
			int uid=Integer.parseInt(br.readLine());
			
			System.out.println("enter user name");
		String uName=	br.readLine();
		
		System.out.println("enter user city");
		String uCity=br.readLine();
		
		//creating student object and setting value
		Student s=new Student();
		s.setStudentId(uid);
		s.setStudentName(uName);
		s.setStudentCity(uCity);
		//saving student object to database by calling insert of student dao
		int r=studentd.insert(s);
		System.out.println(r+"student added");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println();
			
			break;
		case 2:
			System.out.println("*************************************************************************************");
			//display all student
			List<Student> allStudents=studentd.getAllStudent();
			for(Student st:allStudents)
			{
				System.out.println("id :"+st.getStudentId());
				System.out.println("name :"+st.getStudentName());
				
				System.out.println("city :"+st.getStudentCity());
			}
			System.out.println("**********************************************************************************");
			break;
		case 3:
			//get single student data
			System.out.println("Enter user id");
			int userId=Integer.parseInt(br.readLine());
			Student student=studentd.getStudent(userId);

			System.out.println("id :"+student.getStudentId());
			System.out.println("name :"+student.getStudentName());
			
			System.out.println("city :"+student.getStudentCity());
		
			break;
		case 4:
			//delete student data
			System.out.println("Enter user id");
			int id=Integer.parseInt(br.readLine());
			studentd.deleteStudent(id);
			System.out.println("delete sucessfully");
			break;
			
		case 5:
			//update student data
			
			break;
		case 6:
			//exit
			go=false;
			break;
	
		}
    	 
    	 
       }catch(Exception e) {
    	   System.out.println("invalid input try with anthor one!!");
    	   System.out.println(e.getMessage());
       }
       
       }
       }
    }

