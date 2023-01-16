package com.xworkz.dependencyInjection.bean;

import org.springframework.stereotype.Component;

@Component
public class Jio implements Provider {
	
	
	public Jio() {
		System.out.println("creating Jio constructor using no argument constructor");
		

	}

	@Override
	public void connect() {

		System.out.println("creating connect using Jio");

	}

}
