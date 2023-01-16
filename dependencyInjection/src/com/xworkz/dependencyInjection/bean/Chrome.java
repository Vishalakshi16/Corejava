package com.xworkz.dependencyInjection.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Chrome implements Browser {
	@Autowired
	@Qualifier("airtel")
	public Provider provider;
	
	public Chrome() {
		System.out.println("creating Chrome using no argument constructor");
	}

	@Override
	public void browser() {
		
		System.out.println("creating browser using Chrome ");
		provider.connect();

	}

}
