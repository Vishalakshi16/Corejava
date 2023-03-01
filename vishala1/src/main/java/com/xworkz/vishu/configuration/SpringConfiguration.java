package com.xworkz.vishu.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.vishu")

public class SpringConfiguration {
	
	public SpringConfiguration() {
		System.out.println("created"+getClass().getSimpleName());
	}

}
