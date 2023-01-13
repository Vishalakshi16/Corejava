package com.xworkz.springReference.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company {
	
	@Autowired 
	public Location location;
	public Company() {
		System.out.println("creating Company with non argument constructor");
	}

}
