package com.chandan.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
	AbstractApplicationContext	context=new ClassPathXmlApplicationContext("com/chandan/impl/confi2.xml");

	context.registerShutdownHook();
Student	s=context.getBean("st",Student.class);
System.out.println(s);
	
	}

}
