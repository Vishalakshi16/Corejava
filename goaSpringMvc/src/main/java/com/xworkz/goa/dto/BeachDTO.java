package com.xworkz.goa.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BeachDTO {
	
	private String name;
	private String location;
	private boolean clean;
	private String game;
	
	public BeachDTO() {
		System.out.println("created"+getClass().getSimpleName());
	}

}
