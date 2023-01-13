package com.xworkz.autoWiredd.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Rubber {
	@Autowired
	@Qualifier("rubberName")
	private String name;
	
	@Autowired
	@Qualifier("rubberColor")
	private String color;
	
	@Autowired
	@Qualifier("sharpeRubber")
	private boolean sharp;
	
	@Autowired
	@Qualifier("rubberType")
	private String type;
	
	@Autowired
	@Qualifier("priceOfRubber")
	private int price;
	
	@Autowired
	@Qualifier("stolenRubber")
	private boolean stolen;
	
	
	@Override
	public String toString() {
		return "Pencil [name=" + name + ", color=" + color + ", sharp=" + sharp + ", type=" + type + ", price=" + price
				+ ", stolen=" + stolen + "]";
	}

}
