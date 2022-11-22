package com.xworkz.encapsulationapp;

public class HospitalTester {
public static void main(String[] args) {
	HospitalsDTO hs=new HospitalsDTO();
	hs.setHospitalName("Apolla");
	hs.setNoOfPatients(40);
	hs.setAddress("bengaloor");
	System.out.println("Hospital name"+ hs.getHospitalName());
	System.out.println("Hospital name"+ hs.getNoOfPatients());
	System.out.println("Hospital name"+ hs.getAddress());
}
}
