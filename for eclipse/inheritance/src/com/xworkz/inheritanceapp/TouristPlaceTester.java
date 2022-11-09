package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.inheritance.TouristPlace;
import com.xworkz.inheritanceapp.inheritance.inherite.Hampi;

public class TouristPlaceTester {


	public static void main(String args[]) {
		
		TouristPlace plc = new TouristPlace();
		plc.toSeePlaces("Anjanadri bett");
		System.out.println("Tourist place is" + plc.famousPlace);
		
		Hampi plc1 = new Hampi();
		plc1.toSeePlaces("Virupaksh temple");
		System.out.println("In hampi the famous place is" + plc1.famousPlace);
		
	}
}
