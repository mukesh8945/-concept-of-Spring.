package com.tapacad.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp3 {

	public static void main(String[] args) {
//		Load Application Context
         ClassPathXmlApplicationContext context=
        		   new ClassPathXmlApplicationContext("applicationContext.xml");
		 
//		Get bean
          Car car =(Car) context.getBean("bmw");
		
		
//		call getCarDetails
          System.out.println(car.getCarDetails());
          System.out.println(car.getEngineDetail());
          
//		close context object
          context.close();
          
          
		

	}

}
