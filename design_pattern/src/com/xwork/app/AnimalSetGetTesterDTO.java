package com.xwork.app.wires;

public class AnimalSetGetTesterDTO {

	public static void main(String[] args) {
		AnimalGetSetDTO an =new  AnimalGetSetDTO();
		an.setName("chimpanji");
		an.setColor("black");
		System.out.println("animal name is "+an.getName());
		System.out.println("animal name is "+an.getColor());
	}
}
