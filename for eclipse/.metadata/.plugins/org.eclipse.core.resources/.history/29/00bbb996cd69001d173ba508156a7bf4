package com.xworkz.examapp.exam;

public class CoffeeShop {
	
	public Coffee coffee;
	public int price;
	public boolean isConnected;
	public boolean sugarStatus;
	
	public boolean filter(Coffee coffee) {
		System.out.println("inside filter method");
		boolean isConnected =  false;
		if(price >= 50) {
			System.out.println("Price is debited " +this.price);
			if(coffee != null) {
				this.coffee = coffee;
				System.out.println("Prepare a coffee");
				this.coffee.information();
				isConnected = true;
				System.out.println("Coffee is ready please have it");
			}
		else {
			System.out.println("No coffee...");
		}
	}		
			else {
				System.out.println("Please pay the money");
			}
			return isConnected;
		
	}
		
}


