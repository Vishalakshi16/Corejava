package com.xworkz.hospitalapp.patient;

import com.xworkz.hospitalapp.constant.Gender;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Patient {
  private String patientName;
  private String address;
  private Gender gender;
  private Integer age;
  
public Patient(String patientName2, String address2, Gender female, int age2) {
	// TODO Auto-generated constructor stub
}

//  public Patient(String patientName,String address,Gender gender,Integer age) {
//	  super();
//	  this.patientName=patientName;
//	  this.address=address;
//	  this.gender=gender;
//	  this.age=age;
//  }
  public void displayInfo() {
	  System.out.println("patient name is:"+this.patientName);
	  System.out.println("patient address is:"+this.address);
	  System.out.println("patient gender is:"+this.gender);
	  System.out.println("patient age is:"+this.age);
		 
  }
}
