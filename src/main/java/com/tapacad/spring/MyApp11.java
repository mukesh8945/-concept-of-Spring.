package com.tapacad.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp11 {

	public static void main(String[] args) {
//		Load Application Context
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("annotationApplicationContext.xml");

		
//		Get Bean
		Car car= (Car)context.getBean("audi",Car.class);
		
		
//		Call getCarDetails
		System.out.println(car);
		
		
//		close context object
		context.close();
		
		

	}



}


