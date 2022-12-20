package com.xworkz.stringconcept;

public class BeachesTester {
public static void main(String[] args) {
	
	BeachesDTO beaches=new BeachesDTO();
	beaches.setId(1);
	beaches.setName("om beach");
	System.out.println(beaches);
	
	
	BeachesDTO beaches1=new BeachesDTO();
	beaches1.setId(2);
	beaches1.setName("om beach");
	System.out.println(beaches1);
	System.out.println(beaches==beaches1);
	System.out.println(beaches.equals(beaches1));
	
	
	System.out.println(beaches1.hashCode());
}
}