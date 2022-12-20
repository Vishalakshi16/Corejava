package com.xworkz.hospitalapp;

import com.xworkz.hospitalapp.constant.Gender;
import com.xworkz.hospitalapp.hospital.Hospital;
import com.xworkz.hospitalapp.patient.Patient;

public class ApolloHospital extends Hospital {
	public Patient[] patients;
	int index;
	Patient newPatients[];
	
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
	
	/*public boolean updatePatientAddressByName(String name,String newPatientAddress) {
		boolean isUpdate=false;
		System.out.println("inside updatePatientAddressByName");
		System.out.println("no of parameters:2:1)param patientName(String) 2) param patientNewAddress");
		for (int i = 0; i < patients.length; i++) {
			if(patients[i].getPatientName().equals(name)) {
				System.out.println("patient name is matched procedd with updating the address");
				patients[i].setAddress(newPatientAddress);
		
				isUpdate=true;
				
			}
		}
		return isUpdate;
	
	}*/
	
	
	
	/*public boolean updatePatientAgeByName(String name,int newPatientAge) {
		boolean isUpdate=false;
		System.out.println("inside updatePatientAgeByName");
		System.out.println("no of parameters:2:1)param patientName(String) 2) param patientNewAge");
		for (int i = 0; i < patients.length; i++) {
			if(patients[i].getPatientName().equals(name)) {
				System.out.println("patient name is matched procedd with updating the age");
				patients[i].setAge(newPatientAge);
		
				isUpdate=true;
				
			}
		}
		return isUpdate;
  }*/
	
	/*public boolean deletePatientByName(String patientName) {
		boolean isDeleted = false;
		newPatients = new Patient[patients.length - 1];
		// int j=0 ;
		for (int i = 0, k = 0; i < patients.length; i++) {
			if (!patients[i].getPatientName().equals(patientName)) {
				newPatients[k++] = patients[i];
				isDeleted = true;
			}
		}
		// System.out.println(Arrays.toString(newPatients.));

		return isDeleted;
	}

	public void getAllNewPatients() {
		System.out.println("List of Patients are :");
		for (int i = 0; i < newPatients.length; i++) {
			System.out.println(newPatients[i].getAddress() + "  " + newPatients[i].getPatientName() + "  "
					+ newPatients[i].getAge() + "  " + newPatients[i].getGender());
		}
	}*/
	
	
	
	/*public boolean deletePatientByAge(int age) {
		boolean isDeleted = false;
		newPatients = new Patient[patients.length - 1];
		// int j=0 ;
		for (int i = 0, k = 0; i < patients.length; i++) {
			if (!patients[i].getAge().equals(age)) {
				newPatients[k++] = patients[i];
				isDeleted = true;
			}
		}
		// System.out.println(Arrays.toString(newPatients.));

		return isDeleted;
	}

	public void getAllNewPatients() {
		System.out.println("List of Patients are :");
		for (int i = 0; i < newPatients.length; i++) {
			System.out.println(newPatients[i].getAddress() + "  " + newPatients[i].getPatientName() + "  "
					+ newPatients[i].getAge() + "  " + newPatients[i].getGender());
		}
	}*/
	
	
	/*public boolean deletePatientByAddress(String address) {
		boolean isDeleted = false;
		newPatients = new Patient[patients.length - 1];
		// int j=0 ;
		for (int i = 0, k = 0; i < patients.length; i++) {
			if (!patients[i].getAddress().equals(address)) {
				newPatients[k++] = patients[i];
				isDeleted = true;
			}
		}
		// System.out.println(Arrays.toString(newPatients.));

		return isDeleted;
	}

	public void getAllNewPatients() {
		System.out.println("List of Patients are :");
		for (int i = 0; i < newPatients.length; i++) {
			System.out.println(newPatients[i].getAddress() + "  " + newPatients[i].getPatientName() + "  "
					+ newPatients[i].getAge() + "  " + newPatients[i].getGender());
		}
	}*/
	
	public boolean deletePatientByGenders(Gender gender) {
		boolean isDeleted = false;
		newPatients = new Patient[patients.length - 1];
		// int j=0 ;
		for (int i = 0, k = 0; i < patients.length; i++) {
			if (!patients[i].getGender().equals(gender)) {
				newPatients[k++] = patients[i];
				isDeleted = true;
			}
		}
		// System.out.println(Arrays.toString(newPatients.));

		return isDeleted;
	}

	public void getAllNewPatients() {
		System.out.println("List of Patients are :");
		for (int i = 0; i < newPatients.length; i++) {
			System.out.println(newPatients[i].getAddress() + "  " + newPatients[i].getPatientName() + "  "
					+ newPatients[i].getAge() + "  " + newPatients[i].getGender());
		}
	}
}
