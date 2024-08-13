package com.tapacad.spring;

import org.springframework.stereotype.Component;

@Component("jetEngine")
public class JetEngine implements Engine {

	@Override
	public String getEngineDetails() {
		
		return "Jet Engine is Amazing";
	}

	@Override
	public String getEngineDetail() {
		
		return "Jet Engine is a Amazing";
	}

	

}
