package com.tapacad.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.tapacad.spring")
@PropertySource("classpath:car.properties")
public class CarConfig1 {
	
	

}
