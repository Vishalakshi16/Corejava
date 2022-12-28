package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;

public class AirPortRunner {
	
	public static void main(String[] args) {
		
		AirPortDTO airportDto=new AirPortDTO("Indiragandi","Bengaloor",1000);
		AirPortDTO airportDto1=new AirPortDTO("Lalbahadur","Darwad",2000);
		AirPortDTO airportDto2=new AirPortDTO("AbdulKalam","Hubli",5000);
		AirPortDTO airportDto3=new AirPortDTO("VishakPatanam","Mumbai",9000);
		AirPortDTO airportDto4=new AirPortDTO("Surat","Dubai",4000);
		
		
		Collection<AirPortDTO> col=new ArrayList<AirPortDTO>();
		
		col.add(airportDto4);
		col.add(airportDto);
		col.add(airportDto1);
		col.add(airportDto2);
		col.add(airportDto3);
		
		boolean contain=col.contains(airportDto4);
		System.out.println(contain);
		
		boolean equal=airportDto4.equals(airportDto);
		System.out.println(equal);
		
		
	}

}
