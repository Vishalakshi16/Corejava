package com.xworkz.autoWiredd.bean;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class SoftwareEngineer {
	
	@Autowired
	@Qualifier("sftName")
	private String sftName;
	
	@Autowired
	@Qualifier("sftSalary")
	private long sftSalary;
	
	
	@Autowired
	@Qualifier("sftCompanyName")
	private String sftCompanyName;
	
	@Autowired
	@Qualifier("sftExperience")
	private int sftExperience;

	@Override
	public String toString() {
		return "SoftwareEngineer [sftName=" + sftName + ", sftSalary=" + sftSalary + 
				 ", sftCompanyName=" + sftCompanyName + ", sftExperience=" + sftExperience + "]";
	}

	
	
	
	
	

}
