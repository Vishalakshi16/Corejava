package com.xworkz.autoWiredd.bean;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Software {
	
	@Autowired
	@Qualifier("werName")
	private String weName;
	
	@Autowired
	@Qualifier("werVersion")
	private double werVersion;
	
	@Autowired
	@Qualifier("werDeveloper")
	private String werDeveloper;
	
	@Autowired
	@Qualifier("werDate")
	private LocalDate date;
	
	@Autowired
	@Qualifier("werFree")
	private boolean werFree;

	@Override
	public String toString() {
		return "Software [weName=" + weName + ", werVersion=" + werVersion + ", werDeveloper=" + werDeveloper
				+ ", werDate=" + date + ", werFree=" + werFree + "]";
	}
	
	
	
	

}
