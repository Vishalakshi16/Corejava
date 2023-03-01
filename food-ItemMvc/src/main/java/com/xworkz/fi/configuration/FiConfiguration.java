package com.xworkz.fi.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.fi")
public class FiConfiguration {
	
	public FiConfiguration() {
		System.out.println("created"+getClass().getSimpleName());
	}

}
