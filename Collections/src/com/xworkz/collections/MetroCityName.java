<<<<<<< HEAD
package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MetroCityName {

	public static void main(String[] args) {
		String city1="kolkata";
		String city2="Delhi";
		String city3="mumbai";
		String city4="Noida";
		String city5="Kochi";
		

		
		
Collection<String> collection=new ArrayList<String>();
		
		collection.add(city1);
		collection.add(city2);
		collection.add(city3);
		collection.add(city4);
		collection.add(city5);
		
		
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
=======
package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MetroCityName {

	public static void main(String[] args) {
		String city1="kolkata";
		String city2="Delhi";
		String city3="mumbai";
		String city4="Noida";
		String city5="Kochi";
		

		
		
Collection<String> collection=new ArrayList<String>();
		
		collection.add(city1);
		collection.add(city2);
		collection.add(city3);
		collection.add(city4);
		collection.add(city5);
		
		
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
>>>>>>> 7a206f2b905225af17e2f91ffe99946aa7136d01
