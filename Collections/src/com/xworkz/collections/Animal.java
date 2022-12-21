package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class Animal {
	public static void main(String[] args) {
		String animal1="Chimpanji";
		String animal2="Gorilaa";
		String animal3="Dog";
		String animal4="cat";
		String animal5="Rabbit";
		String animal6="cow";
		String animal7="goat";
		String animal8="hourse";
		String animal9="Lion";
		String animal10="Tiger";

		
		
Collection<String> collection=new ArrayList<String>();
		
		collection.add(animal1);
		collection.add(animal2);
		collection.add(animal3);
		collection.add(animal4);
		collection.add(animal5);
		collection.add(animal6);
		collection.add(animal7);
		collection.add(animal8);
		collection.add(animal9);
		collection.add(animal10);
		
		for(String element:collection) {
			System.out.println(element);
			
		}
		
		Iterator<String> ref=collection.iterator();
		while(ref.hasNext())
		{
		String element=ref.next();
		System.out.println(element);
		}
		
	}

}
