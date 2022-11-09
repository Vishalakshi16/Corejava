package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.inheritance.Company;
import com.xworkz.inheritanceapp.inheritance.inherite.Organization;

public class CompanyTester {

	public static void main(String args[] ){
		
		Company cm = new Company();
		cm.toGetJob("TCS");
		System.out.println("company name is "+ " "+ cm.name);
		
		
		Organization or = new Organization();
		or.toGetJob("WIPRO");
		System.out.println("company name is "+ " "+ or.name);
		
		
	}
}
