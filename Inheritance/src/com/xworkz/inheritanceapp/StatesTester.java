package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.inheritance.States;
import com.xworkz.inheritanceapp.inheritance.inherite.Karnataka;

public class StatesTester {
public static void main(String args[]) {
		
		States st = new States();
		st.stateOfIndia(29);
		System.out.println("Number of states in india" + st.noOfDistricts);
		
		Karnataka st1 = new Karnataka();
		st1.stateOfIndia(32);
		System.out.println("Number of districts in karnatak" +st1.noOfDistricts);
	}


}
