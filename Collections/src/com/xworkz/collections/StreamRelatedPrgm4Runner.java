package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class StreamRelatedPrgm4Runner {
	
	public static void main(String[] args) {
		Collection<StreamRelatedPrgm4> palacedto=new ArrayList();
		palacedto.add
		(new StreamRelatedPrgm4("mysore","mysore",false,345L));
		palacedto.add
		(new StreamRelatedPrgm4("Bengaloor","Bengaloor",true,445L));
		palacedto.add
		(new StreamRelatedPrgm4("lalit","mysore",true,345L));
		palacedto.add
		(new StreamRelatedPrgm4("parapa agraga","Bengaloor",true,345L));
		
	   
	    palacedto.stream().filter(dto->!dto.isDestroyed())
	    .collect(Collectors.toSet())
	    .forEach(dto->System.out.println(dto));
	    
	    System.out.println("running another method");
	    palacedto.stream().map(dto->dto.getName())
	    .collect(Collectors.toSet())
	    .forEach(name->System.out.println(name));
	    
	    System.out.println("another runn....");
	    long count=palacedto.stream()
	    		.filter(dto->dto.getName().endsWith("u"))
	    		.count();
	    
	    System.out.println("counting of destroyed palace" +count);
	   
	}
   
}
