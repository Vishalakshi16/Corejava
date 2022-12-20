package com.xworkz.inheritanceapp.inheritance;

public class Fruit {
	public int price;
	public String content;
	
	public void toGetHealthier(int price) {
		System.out.println("Fruits keeps health good");
		this.price = price;
		
	}
	
	public void provideVitamins(String content) {
		System.out.println("Fruits gives vitamins to our body");
		this.content = content;
		
	}
}
