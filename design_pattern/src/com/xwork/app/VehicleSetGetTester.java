package com.xwork.app;

import com.xworkz.encapsulationapp.VehicleDTO;

public class VehicleSetGetTester {
public static void main(String[] args) {
	VehicleSetGetDTO vh=new VehicleSetGetDTO();
	vh.setName("cycle");
	vh.setId(2);
	vh.setPrice(900);
	System.out.println("vehicle name "+vh.getName());
	System.out.println("vehicle name "+vh.getId());
	System.out.println("vehicle name "+vh.getPrice());

}
}
