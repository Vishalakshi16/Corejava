package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.inheritance.Vegetables;
import com.xworkz.inheritanceapp.inheritance.inherite.Cauliflower;
import com.xworkz.inheritanceapp.inheritance.inherite.Patoto;

public class VegetablesTester {
	public static void main(String args[]) {
		
		Vegetables veg = new Vegetables();
		veg.toMakeRecipees("Phalav");
		System.out.println("Vegetables are used to make" + veg.recipee);
		
		Patoto veg1 = new Patoto ();
		veg1.toMakeRecipees("French fries");
		System.out.println("Potato is used to make" + veg1.recipee);
		
		Cauliflower veg2 = new Cauliflower();
		veg2.toMakeRecipees("Gobi Manchuri");
		System.out.println("Cauliflower is used to make" +veg2.recipee);
		
		
		
	}
}
