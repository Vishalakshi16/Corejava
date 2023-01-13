package com.xworkz.springReference.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Director {
	
	@Autowired
	private Director director;
	
	public Director() {
		System.out.println("creating Director with no argument");
	}

}
