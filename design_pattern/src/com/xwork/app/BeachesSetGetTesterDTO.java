package com.xwork.app.wires;

import com.xworkz.encapsulationapp.BeachesDTO;

public class BeachesSetGetTesterDTO {
public static void main(String[] args) {
	BeachesSetGetDTO bch=new BeachesSetGetDTO();
	bch.setName("malpe");
	bch.setId(70);
	System.out.println("Beach name is "+ bch.getName());
	System.out.println("Beach name is "+ bch.getId());
}
}
