package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.inheritance.NonVeg;
import com.xworkz.inheritanceapp.inheritance.inherite.Chicken;

public class NonVegTester {
	NonVeg nv = new NonVeg();
	nv.toGetProtien("kabab");
	System.out.println("reciepe of non veg is" + nv.reciepe);
	
	Chicken ck = new Chicken();
	ck.toGetProtien("chiken kabab");
    System.out.println("reciepe of non veg is"+ ck.reciepe);

}

