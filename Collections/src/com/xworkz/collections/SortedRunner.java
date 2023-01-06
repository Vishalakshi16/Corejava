package com.xworkz.collections;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortedRunner {
	public static void main(String[] args) {
		
		Collection<String> brands=Stream.of("lee","levis","flying Machine","peter Englan").collect(Collectors.toSet());
		brands.stream().sorted().forEach(e->System.out.println(e));
	}

}
