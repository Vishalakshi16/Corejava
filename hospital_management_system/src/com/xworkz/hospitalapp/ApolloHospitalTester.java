package com.xworkz.hospitalapp;

import java.util.Scanner;

import com.xworkz.hospitalapp.constant.Gender;
import com.xworkz.hospitalapp.patient.Patient;


public class ApolloHospitalTester {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter size");
		int size= scanner.nextInt();
		
		ApolloHospital apolloHospital =new ApolloHospital(size);
		
		
		
		/*enter name 
		 patient.patientName=scanner.next();
		 */
		for(int i=0;i<size;i++) {
			Patient patient=new Patient();
		System.out.println("enter name");
		patient.setPatientName(scanner.next());
	
		
		System.out.println("enter age");
		//patient.age=scanner.nextInt();
		patient.setAge(scanner.nextInt());
		
		System.out.println("enter address");
		patient.setAddress(scanner.next());
		//patient.address=scanner.next();
		//patient.address="bilagi";
		
		System.out.println("enter gender");
		//String gender=scanner.next();
		//patient.setGender(Gender.valueOf(gender));
		patient.setGender(Gender.valueOf(scanner.next()));
		
		apolloHospital.addPatient(patient);
		
		
		 }
		apolloHospital.getAllPatients();
		
		
		/*System.out.println("enter patient name");
		String patientName=scanner.next();
		apolloHospital.getPatiByName(patientName);*/
		
		
		
		/*System.out.println("enter patient age");
		int age=scanner.nextInt();
		apolloHospital.getPatientByAge(age);*/
		
		
		/*System.out.println("enter patient address");
		String address=scanner.next();
		apolloHospital.getPatientByAddress(address);*/
		
		
		/*System.out.println("enter patient gender");
		//Gender gender=scanner.next();
		apolloHospital.getPatientByGender(Gender.valueOf(scanner.next()));*/
		
		/*System.out.println("enter patient gender");
		//Gender gender=scanner.next();
		apolloHospital.getPatientNameByGender(Gender.valueOf(scanner.next()));*/
		
		
		System.out.println("enter patient name");
		String patientName=scanner.next();
		apolloHospital.getGenderByPatientname(patientName);
		
		
		scanner.close();
		
		
	}

}
//getPatientByAge(int age);
//getPatientByGender(Gender gender)
//getPatientByAddress(String address);
//getPatientNameByGender()
//getGenderByPatientName()
