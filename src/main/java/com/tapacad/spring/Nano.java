package com.tapacad.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("nano")
public class Nano implements Car {

	private Engine engine;

	@Autowired
	public Nano(@Qualifier("rocketEngine") Engine engine) {
		super();
		this.engine = engine;
	}

	@Override
	public String getCarDetails() {

		return "Nano";
	}

	@Override
	public String getEngineDetail() {

		return engine.getEngineDetail();
	}

}
