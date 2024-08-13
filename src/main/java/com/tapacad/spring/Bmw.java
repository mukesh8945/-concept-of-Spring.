package com.tapacad.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("bmw")
@Scope("prototype")
public class Bmw implements Car {

	private Engine engine;

	@Autowired
	public Bmw(@Qualifier("jetEngine") Engine engine) {
		super();
		this.engine = engine;
	}

	@Override
	public String getCarDetails() {

		return "BMW";
	}

	@Override
	public String getEngineDetail() {

		return engine.getEngineDetail();
	}

}
