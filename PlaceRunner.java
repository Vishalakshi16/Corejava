package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;

public class PlaceRunner {
	public static void main(String[] args) {
		
		PlaceDTO placeDto=new PlaceDTO("Bagalkot","Dog",6);
		PlaceDTO placeDto1=new PlaceDTO("Bengaloor","IT industry",9);
		PlaceDTO PlaceDTODto2=new PlaceDTO("Darawad","Pedda",7);
		PlaceDTO PlaceDTODto3=new PlaceDTO("Davanagere","BenneDosa",5);
		PlaceDTO PlaceDTODto4=new PlaceDTO("Belgavi","Kunda",8);
		
		
		Collection<PlaceDTO> col=new ArrayList<PlaceDTO>();
		col.add(PlaceDTODto4);
		col.add(PlaceDTODto3);
		col.add(PlaceDTODto2);
		col.add(placeDto1);
		col.add(placeDto);
		
		 boolean contain=col.contains(PlaceDTODto4);
		 System.out.println(contain);
		 
		 boolean equal=placeDto.equals(PlaceDTODto2);
		 System.out.println(equal);
		
	}

}
