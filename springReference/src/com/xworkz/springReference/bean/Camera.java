package com.xworkz.springReference.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Camera {
	@Autowired
	private Lens lens;
	
	public Camera() {
		System.out.println("creating Camera with no argument ");
	}

}
