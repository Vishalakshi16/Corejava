package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class StreamRelatedPrgm2 {
	public static void main(String[] args) {
		Collection<String> stores=new ArrayList();
		stores.add("BigBazar");
		stores.add("D-Mart");
		stores.add("BigBazar");
		stores.add("vishal-mart");
		stores.add("Benki");
		stores.add("Meenakshi");
		stores.add("chromo");
		
		
		
		System.out.println("one Running");
		stores.stream().filter((e) -> {return e.contains("o");})
		.collect(Collectors.toSet())
		.forEach((e)->{System.out.println(e);});
		
		System.out.println("another Running ");
		stores.stream().filter((e) -> {return e.contains("o") && e.endsWith("t") ;})
		.collect(Collectors.toSet())
		.forEach((e)->{System.out.println(e);});
		
		System.out.println("another running ");
		//ends with -->uppercase--->print it
		stores.stream().filter((e) -> {return e.endsWith("t") ;})
		.map((e)->{return e.toUpperCase();})
		.collect(Collectors.toSet())
		.forEach((e)->{System.out.println(e);});
		
		System.out.println("another run of stream ");
		stores.stream()
		.map((e)->{
			if(e.length()>8)
				return e;
			return "NA";
			})
		.collect(Collectors.toSet())
		.forEach((e)->{System.out.println(e);});
		
	}

}
