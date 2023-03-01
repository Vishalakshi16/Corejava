package com.xworkz.goa.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CasinoDTO {
	
	private String name;
	private String cruise;
	private String entryFee;
	private boolean freeFood;

	public CasinoDTO() {
		System.out.println("created "+getClass().getSimpleName());
	}
	
	
	

}
