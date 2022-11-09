package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.inheritance.Chocolate;
import com.xworkz.inheritanceapp.inheritance.inherite.Bubbly;
import com.xworkz.inheritanceapp.inheritance.inherite.Kitkat;

public class ChocolateTester {
	public static void main(String args[]) {
		
		Chocolate choc = new Chocolate();
		choc.toGetEnjoy("chocos flavour");
		System.out.println("Chocolate falvour is" + choc.flavour);
		
		Bubbly choc1 = new Bubbly();
		choc1.toGetEnjoy("Milk flavour");
		System.out.println("Dairymilk flavour is " + choc1.flavour);
		
		Kitkat choc2 = new Kitkat();
		choc2.toGetEnjoy("Orange flavour");
		System.out.println("Kitkat flavour is" +choc2.flavour);

	   }
}
