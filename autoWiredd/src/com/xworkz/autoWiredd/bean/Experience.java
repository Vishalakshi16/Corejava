package com.xworkz.autoWiredd.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Experience {
	@Autowired
	@Qualifier("softwareEngineerr")
	private String role;
	@Autowired
	@Qualifier("noOfYearss")
	private int noOfYears;
	
	@Override
	public String toString() {
		return "Experience [role=" + role + ", noOfYears=" + noOfYears + "]";
	}
	
	

}
