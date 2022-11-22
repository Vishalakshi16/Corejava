package com.xworkz.hospitalapp.patient;

import com.xworkz.hospitalapp.constant.Gender;

public class Patient {
  public String patientName;
  public String address;
  public Gender gender;
  public Integer age;
  
  public Patient(String patientName,String address,Gender gender,Integer age) {
	  super();
	  this.patientName=patientName;
	  this.address=address;
	  this.gender=gender;
	  this.age=age;
  }
  public void displayInfo() {
	  System.out.println("patient name is:"+this.patientName);
	  System.out.println("patient address is:"+this.address);
	  System.out.println("patient gender is:"+this.gender);
	  System.out.println("patient age is:"+this.age);
		 
  }
}
