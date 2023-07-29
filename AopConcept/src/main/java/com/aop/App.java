package com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.service.PaymentService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
        
      ApplicationContext context=new ClassPathXmlApplicationContext(" com/aop/config");  
    PaymentService paymentobject=  context.getBean("payment",PaymentService.class);
    paymentobject.makePayment();
    }

}