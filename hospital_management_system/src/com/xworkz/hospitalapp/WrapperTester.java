package com.xworkz.hospitalapp;

import java.util.Scanner;

public class WrapperTester {
 public static void main(String[] args) {
	  
	 Scanner scanner=new Scanner(System.in);
	 System.out.println("enter age");
	   Integer age=scanner.nextInt();
	   
	Integer age1=age;
	System.out.println(age1);
	
	//boxing
	long phNo=456789023;
	//unboxing
	Long mNo=phNo;
	long mPh1=mNo;
	
	double amount=1000.0;
	Double balence=amount;
	double b1=balence;
	
	float price=10.0f;
	Float price1=price;
	float price2=price1;
	
    char ch='a';
    Character ch1=ch;
    char ch2=ch1;
    
    byte id=1;
    Byte id1=id;
    byte id2=id1;
    
    short shopNo=12;
    Short shopNo1=shopNo;
    short  shopNo2=shopNo1;
    
    
    boolean name=false;
    Boolean name1=name;
    boolean name2=name1;
    
    
    
    
	
	
	
	
}


}
