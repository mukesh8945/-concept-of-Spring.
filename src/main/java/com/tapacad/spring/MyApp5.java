package com.tapacad.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp5 {

	public static void main(String[] args) {
//		 Load Application Context
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		
//		getBean
		 Car c = (Car) context.getBean("audi");
		 Car c1 = (Car) context.getBean("audi");
		
		
//		Get CarDetails
		System.out.println(c);
		System.out.println(c1);
		
		
//		close context Object
		context.close();
		

	}

}
