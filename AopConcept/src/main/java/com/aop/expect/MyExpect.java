package com.aop.expect;

import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@Aspect
public class MyExpect {
	
	@Before("excution(com.aop.service.PaymentServiceImpl.makePayment())")
public void printBefore() {	
	
	System.out.println("payment started....");
}

}
