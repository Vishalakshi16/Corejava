package com.xworkz.hospitalapp;

import java.util.Scanner;

import com.xworkz.hospitalapp.constant.Gender;
import com.xworkz.hospitalapp.hospital.Hospital;
import com.xworkz.hospitalapp.patient.Patient;

public class HospitalTester {
	public static void main(String args[]) {
		Scanner sc =new  Scanner(System.in);
		System.out.println("enter the patient name ");
		String patientName=sc.next();
		System.out.println("enter the address ");
		String address=sc.next();
		System.out.println("enter the patient age");
		int age=sc.nextInt();
		Patient patient=new Patient(patientName,address,Gender.female,age);
		System.out.println(Gender.female);
		Hospital p1=new Hospital();
		p1.isEmergency=true;
		p1.isTreatmenRequired=true;
		
		boolean isAmditted=p1.admit(patient);
		System.out.println("allowed to admit a hospital "+isAmditted);
		
		
		sc.close();
		

	}
}
