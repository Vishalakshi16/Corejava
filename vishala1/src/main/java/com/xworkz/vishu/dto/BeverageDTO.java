package com.xworkz.vishu.dto;

import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Component
public class BeverageDTO {
	
	public String name;
	public boolean tasty;
	public String flavour;
	public String color;
	public boolean cold;
	public String buyer;
	public int price;
	public String madeby;
	
	public BeverageDTO() {
		System.out.println("created"+getClass().getSimpleName());
	}

	@Override
	public String toString() {
		return "BeverageDTO [name=" + name + ", tasty=" + tasty + ", flavour=" + flavour + ", color=" + color
				+ ", cold=" + cold + ", buyer=" + buyer + ", price=" + price + ", madeby=" + madeby + "]";
	}
	
	

}
