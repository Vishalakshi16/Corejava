package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.inheritance.HumanBeing;
import com.xworkz.inheritanceapp.inheritance.inherite.Dev;

public class HumanBeingTester {

	public static void main(String args[]) {
		HumanBeing hb = new HumanBeing();
		hb.toHelpInstitute(29);
		System.out.println("minimum age.."+hb.age);
		
		Dev dv = new Dev();
		dv.toHelpInstitute(32);
		System.out.println("Dev sir age is.."+dv.age);
		}
}
