package com.xwork.app;

import com.xworkz.encapsulationapp.TouristPlaceDTO;

public class TouristPlaceTester {
public static void main(String[] args) {
	TouristPlaceSetGetDTO tp= new TouristPlaceSetGetDTO();
	tp.setPlaceName("Hampi");
	tp.setLocation("bagalkot");
	System.out.println("Tourist Place Name "+ tp.getPlaceName());
	System.out.println("Tourist Place Name "+ tp.getLocation());

}
}
