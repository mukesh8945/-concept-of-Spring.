package com.tapacad.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp7 {

	public static void main(String[] args) {
		
//		Load application context
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("annotationApplicationContext.xml");
		 
		
//		Get bean
		Car car =  context.getBean("audi",Car.class);
		
//		Call getCarDetails
		System.out.println(car);
		
//		close context object
		context.close();
		

	}

}
