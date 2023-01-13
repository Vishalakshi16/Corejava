package com.xworkz.springReference.bean;

import org.springframework.stereotype.Component;

@Component
public class Colonel {
	
	public Colonel() {
		System.out.println("creating Colonel using non argument constructor");
	}
	
	@Override
	public int hashCode() {
	
		return 10;
	}

}
