package com.xworkz.examapp;

import com.xworkz.examapp.exam.Coffee;
import com.xworkz.examapp.exam.CoffeeShop;

public class CoffeeShopTester {

	public static void main(String args[]) {
		
		String brandNames[] = {"Nescafe", "Bru", "Country bean", "Rage", "Davidoff"};
		
		Coffee coffee = new Coffee("Cappuccino", brandNames, true);
		CoffeeShop cf1 = new CoffeeShop();
		cf1.price = 60;
		cf1.sugarStatus = true;
		boolean isConnected = cf1.filter(coffee);
		System.out.println(isConnected);
		
		Coffee cof1 = new Coffee("Latte", brandNames, false);
		CoffeeShop cf2 = new CoffeeShop();
		cf2.price = 40;
		cf2.sugarStatus = false;
		boolean isConnect = cf2.filter(cof1);
		System.out.println(isConnect);
		
	}
}
