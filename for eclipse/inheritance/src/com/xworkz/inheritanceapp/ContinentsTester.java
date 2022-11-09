package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.inheritance.Continents;
import com.xworkz.inheritanceapp.inheritance.inherite.Asia;

public class ContinentsTester {

public static void main(String args[]) {
		
		Continents cont = new Continents();
		cont.toLeave(100);
		System.out.println("Total number of countries" +cont.noOfCountries);
		
		Asia cont1 = new Asia();
		cont1.toLeave(45);
		System.out.println("number of countries in Asia" + cont1.noOfCountries);
	}
}
