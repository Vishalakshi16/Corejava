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
		
		
		/*System.out.println("enter patient name");
		String patientName=scanner.next();
		apolloHospital.getGenderByPatientname(patientName);*/
		
		
		/*System.out.println("enter patient name");
		String patientName=scanner.next();
		apolloHospital.getGenderByPatientname(patientName);
		
		System.out.println("enter patient address");
		String newAddress=scanner.next();
		apolloHospital.getGenderByPatientname(newAddress);
		
		
		
		apolloHospital.updatePatientAddressByName(patientName,newAddress);
		apolloHospital.getAllPatients();*/
		
		/*System.out.println("enter patient name");
		String patientName=scanner.next();
		
		System.out.println("enter patient age");
		Integer newAge=scanner.nextInt();
		
		apolloHospital.updatePatientAgeByName(patientName,newAge);
		apolloHospital.getAllPatients();*/
		
		/*System.out.println("Enter the patient name to delete "); 
		String patientName = scanner.next() ;
		
		apolloHospital.deletePatientByName(patientName);
		apolloHospital.getAllNewPatients();*/
		
		/*System.out.println("Enter the patient age to delete "); 
		int age = scanner.nextInt() ;
		
		apolloHospital.deletePatientByAge(age);
		apolloHospital.getAllNewPatients();*/
		
		/*System.out.println("Enter the patient address to delete "); 
		String address = scanner.next() ;
		
		apolloHospital.deletePatientByAddress(address);
		apolloHospital.getAllNewPatients();*/
		
		
		System.out.println("Enter the patient gender to delete "); 
		//Gender gender = scanner.next() ;
		
		apolloHospital.deletePatientByGender(Gender.valueOf(scanner.next()));
		apolloHospital.getAllNewPatients();
		
		
		scanner.close();
		
		
	}

}
//getPatientByAge(int age);
//getPatientByGender(Gender gender)
//getPatientByAddress(String address);
//getPatientNameByGender()
//getGenderByPatientName()
//patientagebyname
