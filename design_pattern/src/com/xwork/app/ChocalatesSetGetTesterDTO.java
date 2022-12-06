package com.xwork.app.wires;

import com.xworkz.encapsulationapp.ChocalatesDTO;

public class ChocalatesSetGetTesterDTO {
public static void main(String[] args) {
	ChocalatesSetGetDTO ch=new ChocalatesSetGetDTO();
	ch.setName("Dairymilk Silk bubbly");
	ch.setColor("cream");
	System.out.println("chocalate name "+ ch.getName());
	System.out.println("chocalate color "+ ch.getColor());
}
}
