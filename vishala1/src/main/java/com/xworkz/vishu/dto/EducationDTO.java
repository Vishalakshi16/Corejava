package com.xworkz.vishu.dto;

import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Component
public class EducationDTO {
	
	public String firstName;
	public String lastName;
	public String qualification;
	public String stream;
	public long phNo;
	public String schoolName;
	public String colleageName;
	public String address;
	public double cgp ;
	public int rank ;
	
	public EducationDTO() {
		System.out.println("created"+getClass().getSimpleName());
	}

}
