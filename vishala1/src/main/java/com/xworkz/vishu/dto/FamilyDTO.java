package com.xworkz.vishu.dto;

import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Component
public class FamilyDTO {
	
	public String homeName;
	public String sisteName;
	public String brotherName;
	public String fatherName;
	public String motherName;
	public String addressName;
	public long fatherPh;
	public String grandMother;
	public int nuberOfSister ;
	public String nativePlace ;

	
	public FamilyDTO() {
		System.out.println("created"+getClass().getSimpleName());
	}
}
