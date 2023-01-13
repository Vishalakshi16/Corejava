package com.xworkz.springReference.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Battery {
	
	@Autowired
	public Capacity capacity;
	public Battery() {
		System.out.println("creating Battery with no argument ");
	}

}
