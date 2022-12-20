package com.xworkz.collections;

import java.util.TreeSet;

public class Sweets {
	public static void main(String[] args) {
		String sweet1="Gulaam jamun";
		String sweet2="Jalebi";
		String sweet3="Shrikhand";
		String sweet4="Halwa";
		String sweet5="Rasmalai";
		String sweet6="Rasgulla";
		String sweet7="Malpua";
		String sweet8="Ladoo";
		String sweet9="Kulfi";
		String sweet10="Basundi";
		String sweet11="Khaja";
		String sweet12="Balushahi";
		String sweet13="mysore pak";

		TreeSet<String> collection=new TreeSet<String>();
		
		collection.add(sweet1);
		collection.add(sweet2);
		collection.add(sweet3);
		collection.add(sweet4);
		collection.add(sweet5);
		collection.add(sweet6);
		collection.add(sweet7);
		collection.add(sweet8);
		collection.add(sweet9);
		collection.add(sweet10);
		collection.add(sweet11);
		collection.add(sweet12);
		collection.add(sweet13);
		collection.add("peda");
		
		System.out.println(collection.size());
		
		collection.clear();
		System.out.println("after clear......");
	    System.out.println(collection.size());
		
		
		
		
		

		
	}

}

