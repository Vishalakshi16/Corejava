package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.inheritance.Bag;
import com.xworkz.inheritanceapp.inheritance.inherite.HandBag;

public class BagTester {
	public static void main(String args[]) {
		Bag bg=new Bag();
		bg.toCarry(46);
		System.out.println("bag price is "+ " "+ bg.price);
		
		HandBag bg1=new HandBag();
		bg1.toCarry(46);
		System.out.println("bag price is "+ " "+ bg1.price);
		
	}

}
