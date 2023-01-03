package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class StreamRelatedPrgm3 {
	public static void main(String[] args) {
		Collection<String> color=new ArrayList();
		color.add("Pink");
		color.add("White");
		color.add("Purple");
		color.add("Black");
		color.add("Yellow");
		
		color.stream().map((e)->{return e.toUpperCase();})
		.collect(Collectors.toList())
		.forEach((e)->{System.out.println(e);});
		
		color
		.stream()
		.filter(e->e.endsWith("e"))
		.filter(e->e.contains("r"))
		.map(e->e.charAt(0))
		.collect(Collectors.toList())
		.forEach(e->System.out.println(e));
		
	}

}
