package com.xworkz.dependencyInjection.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FireBox implements Browser{
	@Autowired
	@Qualifier("jio")
	public Provider provider;
	

	public FireBox() {
		System.out.println("creating firebox constructor using no argument constructor");
	}
	
	@Override
	public void browser() {
		System.out.println("creating brower using Firebox");
		provider.connect();
		
	}

}
