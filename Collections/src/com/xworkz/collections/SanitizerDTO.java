package com.xworkz.collections;

public class SanitizerDTO  {
	
	

	private String color;
	private String brand;
		private int id;
		private Double price;

	
	public SanitizerDTO(String color, String brand, int id, Double price) {
		super();
		this.color = color;
		this.brand = brand;
		this.price = price;
		this.id = id;
	}

	public SanitizerDTO() {
		super();
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "SanitizerDTO [color=" + color + ", brand=" + brand + ", price=" + price + ", id=" + id + "]";
	}

}
