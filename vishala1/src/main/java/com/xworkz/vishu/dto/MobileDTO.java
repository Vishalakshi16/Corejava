package com.xworkz.vishu.dto;

import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Component
public class MobileDTO {
	public String mobileName;
	public String color;
	public String shape;
	public int version;
	public int ram;
	
	public MobileDTO() {
		System.out.println("created"+getClass().getSimpleName());
	}

}
