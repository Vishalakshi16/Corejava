package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.patient.Patient;

public class Hospital {
	public Patient patient;
	public boolean isEmergency;
	public boolean isTreatmenRequired;
	public boolean admit(Patient patient) {
		boolean isAmditted=false;
		if(isTreatmenRequired==true) {
		if(isEmergency==true) {
		this.patient=patient;	
		this.patient.displayInfo();
		System.out.println("patient can be allowed");
	}
		else {
			System.out.println("add the patient in generalwaed");
			}
		}
		
	else {
		System.out.println("treatment is requered");
	}


	return isAmditted ;
	}
}