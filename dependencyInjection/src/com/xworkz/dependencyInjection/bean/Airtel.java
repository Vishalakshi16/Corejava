package com.xworkz.dependencyInjection.bean;

import org.springframework.stereotype.Component;

@Component
public class Airtel implements Provider{
	
	
   public Airtel() {
	   System.out.println("creating Airtel with no argument constructor");
   }
	
	
	@Override
	public void connect() {
		   System.out.println("creating connect using Airtel");

		
	}

}
