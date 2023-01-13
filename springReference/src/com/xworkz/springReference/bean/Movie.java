package com.xworkz.springReference.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Movie {
	
	@Autowired
	private Movie movie;
	
	public Movie() {
		System.out.println("creating  Movie with no argument");
	}

}
