package com.xworkz.collections;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Collection;
import java.util.HashSet;

public class StreamRelatedPgrm {
	public static void main(String[] args) {
		Collection<String> webseries=new HashSet();
		webseries.add("Gattimel");
		webseries.add("honeymoon");
		webseries.add("Geeta");
		webseries.add("hoganasu");
		webseries.add("doveRani");
		webseries.add("Geeta");
		webseries.add("hoganasua");
		
		Collection<String> temp=new HashSet();
		for(String ref:webseries) {
			System.out.println("elements are" +" "+ref);
			if(ref.endsWith("a")) {
				System.out.println(ref);
				temp.add(ref);
			}
		}
		System.out.println(temp.size());
		System.out.println("temp element");
		
		for(String ref:temp) {
			System.out.println(ref);
		}
		
		System.out.println("running stream ");
		
		webseries.stream().filter((e) -> {return e.endsWith("a");})
		.collect(Collectors.toSet()).forEach((e) -> {
			System.out.println(e);
		});
		
		

	}
}
