package com.xworkz.spring.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.spring")
public class SpringConfiguration {
	
	public SpringConfiguration() {
		System.out.println("created"+this.getClass().getSimpleName());
	}
}
