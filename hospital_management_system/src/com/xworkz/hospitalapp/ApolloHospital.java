package com.xworkz.hospitalapp;

import com.xworkz.hospitalapp.constant.Gender;
import com.xworkz.hospitalapp.hospital.Hospital;
import com.xworkz.hospitalapp.patient.Patient;

public class ApolloHospital extends Hospital {
	public Patient[] patients;
	int index;
	
	public ApolloHospital(int size) {
		patients=new Patient[size];

	}
	
	public boolean addPatient(Patient patient) {
		boolean isPatientAdded=false;
		if(patient!=null) {
			System.out.println("patient detailes");
			patients[index++]=patient;
			isPatientAdded=true;
			//index++;
		}
		return isPatientAdded;
	}
	public void getAllPatients() {
		System.out.println("list of  patient names");
		for (int i = 0; i < patients.length; i++) {
			System.out.println(patients[i].getPatientName() 
					+" "+
		patients[i].getAddress() +" "+
		patients[i].getGender() +" "+ 
		patients[i].getAge());
		}
		
		
	}
	
	
/*public void getPatiByName(String patientName) {
	System.out.println("inside getPatiByName");
	System.out.println("No of parameters: 1: patientName(String)");
	 for (int i = 0; i < patients.length; i++) {
		if(patients[i].getPatientName().equals(patientName)) {
			System.out.println(patients[i].getPatientName() 
					+" "+
		patients[i].getAddress() +" "+
		patients[i].getGender() +" "+ 
		patients[i].getAge());
			
		}
		else {
			System.out.println("No patient not found");
		}
	}
}*/
	
	
	
	
	
	
	/*public void getPatientByAge(int age) {
		System.out.println("inside getPatientByAge");
		System.out.println("No of parameters: 1: age(int)");
		 for (int i = 0; i < patients.length; i++) {
			if(patients[i].getAge().equals(age)) {
				System.out.println(patients[i].getPatientName() 
						+" "+
			patients[i].getAddress() +" "+
			patients[i].getGender() +" "+ 
			patients[i].getAge());
				
			}
			else {
				//System.out.println("No patient not found");
			}
		}
}*/
	
	
	
	
	
	
	
	/*public void getPatientByAddress(String  address) {
		System.out.println("inside getPatientByAddress");
		System.out.println("No of parameters: 1: address(int)");
		 for (int i = 0; i < patients.length; i++) {
			if(patients[i].getAddress().equals(address)) {
				System.out.println(patients[i].getPatientName() 
						+" "+
			patients[i].getAddress() +" "+
			patients[i].getGender() +" "+ 
			patients[i].getAge());
				
			}
			else {
				//System.out.println("No patient not found");
			}
		}
}*/
	
	
	
	
	/*public void getPatientByAddress(Gender  gender) {
		System.out.println("inside getPatientByGender");
		System.out.println("No of parameters: 1: gender(Gender)");
		 for (int i = 0; i < patients.length; i++) {
			if(patients[i].getGender().equals(gender)) {
				System.out.println(patients[i].getPatientName() 
						+" "+
			patients[i].getAddress() +" "+
			patients[i].getGender() +" "+ 
			patients[i].getAge());
				
			}
			else {
				//System.out.println("No patient not found");
			}
		}
}*/
	
	
	/*public void getPatientNameByGender(Gender  gender) {
		System.out.println("inside getPatientByGender");
		System.out.println("No of parameters: 1: gender(Gender)");
		 for (int i = 0; i < patients.length; i++) {
			if(patients[i].getGender().equals(gender)) {
				System.out.println(patients[i].getPatientName() 
						+" "+
			patients[i].getAddress() +" "+
			patients[i].getGender() +" "+ 
			patients[i].getAge());
				
			}
			else {
				//System.out.println("No patient not found");
			}
		}
}*/
	public void getGenderByPatientname(String  patientName) {
		System.out.println("inside getGenderByPatientname");
		System.out.println("No of parameters: 1: GenderByPatientname(int)");
		 for (int i = 0; i < patients.length; i++) {
			if(patients[i].getPatientName().equals(patientName)) {
				System.out.println(patients[i].getPatientName() 
						+" "+
			patients[i].getAddress() +" "+
			patients[i].getGender() +" "+ 
			patients[i].getAge());
				
			}
			else {
				//System.out.println("No patient not found");
			}
		}
}
	
	
	
	
	
}
