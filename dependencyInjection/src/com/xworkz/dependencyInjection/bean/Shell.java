package com.xworkz.dependencyInjection.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Shell implements PetrolBunk{

	@Autowired
	@Qualifier("petrol")
	private Fuel fuel;
	
	public Shell() {
		System.out.println("create shell using no argument constructor...");
	}
	
	@Override
	public void purchase() {
		System.out.println("creating a purchase method......");
		fuel.consume();
	}
	

}
