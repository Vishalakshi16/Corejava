package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class StreamApplicationDTORunner {
	public static void main(String[] args) {
		Collection<StreamApplicationDTO> applicationdto=new ArrayList();
		applicationdto.add
		(new StreamApplicationDTO("whatsapp",244D,false,"jan koum and Brian Action",234L));
		applicationdto.add
		(new StreamApplicationDTO("InstaGram",544D,true,"Kelvin systrom",345L));
		applicationdto.add
		(new StreamApplicationDTO("Facebook",844D,true,"google",456L));
		applicationdto.add
		(new StreamApplicationDTO("Teligram",744D,true,"billionaire pavel durov",785L));
		
		applicationdto
		.stream()
		.filter((e)->{
			 if(e.getDevelopedBy().equals("google")) {
				 return "google";
						 
				 return " ";
			 }
		})
	    .collect(Collectors.toSet())
	    .forEach(dto->System.out.println(dto));

		
		
	}

}
