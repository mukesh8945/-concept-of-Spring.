package com.tapacad.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myApp6 {

	public static void main(String[] args) {
//		Load Application Context
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
	
//		Get bean
		Car car = (Car)context.getBean("audi");
		
//		call getCarDetails
		System.out.println(car);
		
//		close context object
		context.close();
		

	}

}
