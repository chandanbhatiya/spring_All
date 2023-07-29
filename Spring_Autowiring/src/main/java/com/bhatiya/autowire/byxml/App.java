package com.bhatiya.autowire.byxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/bhatiya/autowire/byxml/configure.xml");

		Student s=context.getBean("st",Student.class);
		System.out.println(s);
	}

}
