package com.tapacad.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("audi")
public class Audi implements Car {
	@Autowired
	@Qualifier("rocketEngine")

	private Engine engine;
	private String color;
	private float price;

	@Override
	public String getCarDetails() {

		return "Audi";
	}

	@Override
	public String getEngineDetail() {

		return engine.getEngineDetail();
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public String getColor() {
		return color;
	}

	@Value("${color}")
	public void setColor(String color) {
		this.color = color;
	}

	public float getPrice() {
		return price;
	}

	@Value("${price}")
	public void setPrice(Float price) {
		this.price = price;
	}
	
	@PostConstruct
	void myStartup() {
		System.out.println("Bean Created");
	}

	@PreDestroy
	void myClosing() {
		System.out.println("Bean Destroyed");
	}

	void fun1() {
		System.out.println("Default init() called");
	}

	void fun2() {
		System.out.println("Default destroy() called");
	}

}
