package com.xworkz.autoWiredd.bean;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Pencil {

	@Override
	public String toString() {
		return "Pencil [name=" + name + ", color=" + color + ", sharp=" + sharp + ", type=" + type + ", price=" + price
				+ ", stolen=" + stolen + "]";
	}

	@Autowired
	@Qualifier("pencilName")
	private String name;
	
	@Autowired
	@Qualifier("pencilColor")
	private String color;
	
	@Autowired
	@Qualifier("sharpePencil")
	private boolean sharp;
	
	@Autowired
	@Qualifier("pencilType")
	private String type;
	
	@Autowired
	@Qualifier("priceOfPencil")
	private int price;
	
	@Autowired
	@Qualifier("stolenPencil")
	private boolean stolen;
	
	
}
