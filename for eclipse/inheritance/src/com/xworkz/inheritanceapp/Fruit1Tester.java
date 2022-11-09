package com.xworkz.inheritanceapp;


import com.xworkz.inheritanceapp.inheritance.Fruit1;
import com.xworkz.inheritanceapp.inheritance.inherite.Watermelon;

public class Fruit1Tester {

public static void main(String args[]) {
		
		Fruit1 fru = new Fruit1();
		fru.toGetHealthier(30);
		System.out.println("Price of fruit is" + fru.price);
		
		Watermelon org = new Watermelon();
		org.toGetHealthier(35);
		System.out.println("Price of orange is" + org.price);
		
		
		}

}
