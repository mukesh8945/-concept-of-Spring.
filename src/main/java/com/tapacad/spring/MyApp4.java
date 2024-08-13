package com.tapacad.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp4 {

	public static void main(String[] args) {
//		Load application context
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
//		Get bean
		
		Audi car = (Audi) context.getBean("audi");
		
//		call getCarDetails
		System.out.println(car.getCarDetails());
		System.out.println(car.getEngineDetail());
		System.out.println(car.getColor());
		System.out.println(car.getPrice());
		
		
//		close context object
		context.close();
		

	}

}
