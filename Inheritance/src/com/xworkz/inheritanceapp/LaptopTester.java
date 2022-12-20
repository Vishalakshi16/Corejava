package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.inheritance.Laptop;
import com.xworkz.inheritanceapp.inheritance.inherite.Computer;

public class LaptopTester {

public static void main(String args[]) {
		
		Laptop lp=new Laptop();
		lp.toStoreData("hp");
		System.out.println("laptop name is "+ " "+ lp.brandName);
		
		Computer cp=new Computer();
		cp.toStoreData("lenovo");
		System.out.println("laptop name is "+ " "+ cp.brandName);
		
	}
}
