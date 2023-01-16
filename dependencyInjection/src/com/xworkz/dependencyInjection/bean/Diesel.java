package com.xworkz.dependencyInjection.bean;

import org.springframework.stereotype.Component;

@Component
public class Diesel implements Fuel {
	
	public Diesel() {
		
	}

	@Override
	public void consume() {
	System.out.println("running consumer from diesel...");
		
	}

}
