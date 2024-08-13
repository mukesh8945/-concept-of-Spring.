package com.tapacad.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp10 {
	public static void main(String[] args) {
//		Load application context
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationApplicationContext.xml");

//		Get bean
//		Audi car  =context.getBean("audi",Audi.class);
		
		Car car1 = context.getBean("bmw",Car.class);
		Car car2 = context.getBean("bmw",Car.class);
		

//		Call getCarDetails
//		System.out.println(car.getEngineDetail());
//		System.out.println(car.getColor());
//		System.out.println(car.getPrice());
		
		System.out.println(car1);
		System.out.println(car2);
		
		
//		close context object
		context.close();
		

	}

	
	}
	


