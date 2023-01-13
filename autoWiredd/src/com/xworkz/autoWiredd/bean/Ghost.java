package com.xworkz.autowiredBean.Bean;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;

public class Ghost {
	
	private String name;
	private String gender;
	private double nailLength;
	private LocalDate dateOfDeath;
	
	public Ghost(String name, String gender, double nailLength, LocalDate dateOfDeath) {
		super();
		this.name = name;
		this.gender = gender;
		this.nailLength = nailLength;
		this.dateOfDeath = dateOfDeath;
	}

	@Override
	public String toString() {
		return "Ghost [name=" + name + ", gender=" + gender + ", nailLength=" + nailLength + ", dateOfDeath="
				+ dateOfDeath + "]";
	}
	
	
	

}
