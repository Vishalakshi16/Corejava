package com.xworkz.interveiwquestions;

public class Methods {

	public static void main(String[] args) {
//		Methods mn=new Methods();
//		mn.mobile(3456789L);
//		
	        name("chaitu");
	}
	
	public static void name(String name) {
	
		Methods mn=new Methods();
		mn.mobile(3456789L);
		System.out.println("name methode");
	}
	
public  void mobile(Long phNo) {
		System.out.println("phNo method ");
		//name("chaitu");
	}
}
/*static methode 
 can not override the static methode.static methode can be overload.
 if we can override using annotation @Override
 
 can we call static method inside instance method--->Yes
 

*/ 