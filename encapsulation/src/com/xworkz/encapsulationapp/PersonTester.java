package com.xworkz.encapsulationapp;

public class PersonTester {
	public static void main(String[] args) {
		PersonDTO pr=new PersonDTO();
		pr.setPersonName("hanamant");
		pr.setPersonJob("software developer");
		pr.setLocation("whitefield");
		System.out.println("person name  is " +pr.getPersonName());
		System.out.println("person name  is " +pr.getPersonJob());
		System.out.println("person name  is " +pr.getLocation());
	
		
	}

}
