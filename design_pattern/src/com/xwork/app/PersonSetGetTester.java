package com.xwork.app;

import com.xworkz.encapsulationapp.PersonDTO;

public class PersonSetGetTester {
public static void main(String[] args) {
	PersonSetGetDTO pr=new PersonSetGetDTO();
	pr.setPersonName("hanamant");
	pr.setPersonJob("software developer");
	pr.setLocation("whitefield");
	System.out.println("person name  is " +pr.getPersonName());
	System.out.println("person name  is " +pr.getPersonJob());
	System.out.println("person name  is " +pr.getLocation());

}
}
