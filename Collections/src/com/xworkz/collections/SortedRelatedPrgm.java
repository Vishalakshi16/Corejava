package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class SortedRelatedPrgm {
	public static void main(String[] args) {
		List<Integer> col=new ArrayList();
		col.add(12);
		col.add(17);
		col.add(72);
		col.add(32);
		col.add(82);
		
		//Collectors.sort(col);//list
		//col.forEach(e->System.out.println(e));//insertion order
		
		col.stream().sorted().forEach(e->System.out.println(e));//sorted order
		
	}

}
