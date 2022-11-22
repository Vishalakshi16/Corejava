package com.xworkz.encapsulationapp;

public class ElectronicsDeviceTester {
 public static void main(String[] args) {
	 ElectronicsDeviceDTO ed=new ElectronicsDeviceDTO();
	 ed.setName("laptop");
	 ed.setPrice(99000);
	 System.out.println("Electronic Device Name "+ ed.getName());
	 System.out.println("Electronic Device price "+ ed.getPrice());
}
}
