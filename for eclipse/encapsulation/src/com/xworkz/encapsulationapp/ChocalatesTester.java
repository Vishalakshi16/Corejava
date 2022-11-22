package com.xworkz.encapsulationapp;

public class ChocalatesTester {
	public static void main(String[] args) {
		ChocalatesDTO ch=new ChocalatesDTO();
		ch.setName("Dairymilk Silk bubbly");
		ch.setColor("cream");
		System.out.println("chocalate name "+ ch.getName());
		System.out.println("chocalate color "+ ch.getColor());
	}

}
