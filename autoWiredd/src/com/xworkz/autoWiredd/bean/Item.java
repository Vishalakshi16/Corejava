package com.xworkz.autoWiredd.bean;
import org.springframework.stereotype.Component;
//import java.lang.reflect.Constructor;

public class Item {
	private String name;
	
	public Item() {
		System.out.println("creating itemn using no argument constructor");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
