package com.xworkz.autoWiredd.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Government {
	@Autowired
	@Qualifier("nameOfGovt")
	private String name;
	@Autowired
	@Qualifier("presidentnamee")
	private  String presidentname;
	@Autowired
	@Qualifier("tenuree")
	private  double tenure;
	@Autowired
	@Qualifier("memberss")
	private  int totalmember;
	@Autowired
	@Qualifier("majorityy")
	private  boolean majority;
	
	
	@Override
	public String toString() {
		return "Government [name=" + name + ", presidentname=" + presidentname + ", tenure=" + tenure + ", totalmember="
				+ totalmember + ", majority=" + majority + "]";
	}
	
	

}
