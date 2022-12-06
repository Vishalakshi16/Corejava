package com.xwork.app.wires;

import com.xworkz.encapsulationapp.HospitalsDTO;

public class HospitalsSetGetTester {
public static void main(String[] args) {
	HospitalsSetGetDTO hs=new HospitalsSetGetDTO();
	hs.setHospitalName("Apolla");
	hs.setNoOfPatients(40);
	hs.setAddress("bengaloor");
	System.out.println("Hospital name"+ hs.getHospitalName());
	System.out.println("Hospital name"+ hs.getNoOfPatients());
	System.out.println("Hospital name"+ hs.getAddress());
}
}
