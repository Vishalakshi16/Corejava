package com.xworkz.encapsulationapp;

public class TouristPlaceTester {
public static void main(String[] args) {
	TouristPlaceDTO tp= new TouristPlaceDTO();
	tp.setPlaceName("Hampi");
	tp.setLocation("bagalkot");
	System.out.println("Tourist Place Name "+ tp.getPlaceName());
	System.out.println("Tourist Place Name "+ tp.getLocation());
	
	
}
}
