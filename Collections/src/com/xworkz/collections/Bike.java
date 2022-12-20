package com.xworkz.collections;

import java.util.TreeSet;

public class Bike {
public static void main(String[] args) {
	String bike1="pulser";
	String bike2="yamaha";
	String bike3="karishma";
	String bike4="kenetic";
	String bike5="tvs";
	String bike6="hybuse";
	String bike7="ktm";
	String bike8="bulet";
	String bike9="bajaj";
	String bike10="royenfild";
	String bike11="jupiter";
	String bike12="honda";
	String bike13="hero pulser";
	String bike14="bajaj pulser";
	String bike15="honda dio 150";
	String bike16="honda jupiter";
	String bike17="honda shine";
	String bike18="bajaj";
	

	TreeSet<String> collection=new TreeSet<String>();
	
	
	collection.add(bike1);
	collection.add(bike2);
	collection.add(bike3);
	collection.add(bike4);
	collection.add(bike5);
	collection.add(bike6);
	collection.add(bike7);
	collection.add(bike8);
	collection.add(bike9);
	collection.add(bike10);
	collection.add(bike11);
	collection.add(bike12);
	collection.add(bike13);
	collection.add(bike14);
	collection.add(bike15);
	collection.add(bike16);
	collection.add(bike17);
	collection.add(bike18);
	
	collection.add("Phoenix ");
	
	
	
	
	System.out.println(collection.size());
	
	collection.clear();
	System.out.println("after clear......");
    System.out.println(collection.size());
	
}
}
