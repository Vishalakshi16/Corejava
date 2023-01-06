package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;

public class HolidayRunner {
	public static void main(String[] args) {
		
		HolidayDTO airportDto=new HolidayDTO("Summer","HOD",60);
		HolidayDTO airportDto1=new HolidayDTO("Festival","Principle",20);
		HolidayDTO airportDto2=new HolidayDTO("NationalFestival","VTU",10);
		HolidayDTO airportDto3=new HolidayDTO("Winter","HR",30);
		HolidayDTO airportDto4=new HolidayDTO("Rainly","Lecture",15);
		
		Collection<HolidayDTO> col=new ArrayList<HolidayDTO>();
		col.add(airportDto4);
		col.add(airportDto3);
		col.add(airportDto2);
		col.add(airportDto1);
		col.add(airportDto);
		
		boolean contain=col.contains(airportDto4);
		System.out.println(contain);
		
		boolean equal=airportDto.equals(airportDto4);
		System.out.println(equal);
		
		
		
	}

}
