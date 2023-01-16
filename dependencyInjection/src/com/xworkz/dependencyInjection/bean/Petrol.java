package com.xworkz.dependencyInjection.bean;

import org.springframework.stereotype.Component;

@Component
public class Petrol implements Fuel {

	public Petrol() {
		System.out.println("create petrol ising no argument constructor");
		
	}
	
	@Override
	public void consume() {
		System.out.println("implement consume method");
		
	}
	

}
