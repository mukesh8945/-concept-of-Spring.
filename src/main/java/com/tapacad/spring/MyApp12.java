package com.tapacad.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp12 {
	public static void main(String[] args) {
//		Load Application Context
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("CarConfig1.class");

		
//		Get Bean
		Car car= (Car)context.getBean("audi",Car.class);
		
		
		
//		Call getCarDetails
		System.out.println(car);
		
		
//		close context object
		context.close();
		
		

	}





}
