package com.xworkz.encapsulationapp;

public class VehicleDTO {
	private String  name;
	private int id;
	private int price;
	
	public void setName(String name) {
		this.name=name;
		
		}
	public String getName() {
		return name;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setPrice(int price) {
		this.price=price;
		
	}
	
	public int getPrice() {
		return price;
	}
	

}
