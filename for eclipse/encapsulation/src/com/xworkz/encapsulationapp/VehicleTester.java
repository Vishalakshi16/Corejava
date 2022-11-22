package com.xworkz.encapsulationapp;

public class VehicleTester {

	public static void main(String[] args) {
		VehicleDTO vh=new VehicleDTO();
		vh.setName("cycle");
		vh.setId(2);
		vh.setPrice(900);
		System.out.println("vehicle name "+vh.getName());
		System.out.println("vehicle name "+vh.getId());
		System.out.println("vehicle name "+vh.getPrice());
		
	}
	
}
