package com.workz.examapp;

import com.workz.examapp.exam.Coffee1;
import com.workz.examapp.hallticket.CoffeeShop1;

public class CoffeeShop1Tester {
	
public static void main(String args[]) {
		
		String brandNames[] = {"Nescafe", "Bru", "Country bean", "Rage", "Davidoff"};
		
		Coffee1 coffee1 = new Coffee1("Cappuccino", brandNames, true);
		CoffeeShop1 cf1 = new CoffeeShop1();
		cf1.price = 60;
		cf1.sugarStatus = true;
		boolean isConnected = cf1.filter(coffee1);
		System.out.println(isConnected);
		
		Coffee1 cof1 = new Coffee1("Latte", brandNames, false);
		CoffeeShop1 cf2 = new CoffeeShop1();
		cf2.price = 40;
		cf2.sugarStatus = false;
		boolean isConnect = cf2.filter(cof1);
		System.out.println(isConnect);
		
	}
}



