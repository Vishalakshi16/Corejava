package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.inheritance.Biscuit;
import com.xworkz.inheritanceapp.inheritance.inherite.ParleG;

public class BiscuitTester {
public static void main(String args[]) {
		
		Biscuit bis = new Biscuit();
		bis.toEat(10);
		System.out.println("Biscuit price is.."+bis.price);
		
		ParleG or = new ParleG();
		or.toEat(25);
		System.out.println("Oreo biscuit price is.."+or.price);
	}
}
