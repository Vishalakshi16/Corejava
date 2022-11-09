package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.inheritance.PetrolBunk;
import com.xworkz.inheritanceapp.inheritance.inherite.Hp;

public class PetrolBunkTester {

public static void main(String args[]) {
		
		PetrolBunk petr = new PetrolBunk();
		petr.toGetFuels(89.4);
		System.out.println("Petrol price is" + petr.price);
		
		Hp petr1 = new Hp();
		petr1.toGetFuels(95.2);
		System.out.println("Hp petrol bunk orice is" + petr1.price);
	}

}
