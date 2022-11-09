package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.inheritance.Sweet;
import com.xworkz.inheritanceapp.inheritance.inherite.Barfi;

public class SweetTester {

	public static void main(String args[]) {
		
		
		Sweet st = new Sweet();
		st.toGetProtien("peda");
		System.out.println("name of the sweeet is" + st.name);
		
		Barfi bf= new Barfi();
	    bf.toGetProtien("coconutbarfi");
	    System.out.println("name of the sweet is"+ bf.name);

	}
}
