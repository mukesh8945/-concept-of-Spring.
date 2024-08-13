package com.tapacad.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp9 {

	public static void main(String[] args) {
//		Load application context
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationApplicationContext.xml");

//		Get bean
		Audi car  =context.getBean("audi",Audi.class);
		

//		Call getCarDetails
		System.out.println(car.getEngineDetail());
		System.out.println(car.getColor());
		System.out.println(car.getPrice());
		
		
//		close context object
		context.close();
		

	}

	
	}


