package com.xworkz.map;

import java.io.Serializable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapRelatedPgrm implements Serializable {
	
	public static void main(String[] args) {
		Map<String,Double> map=new HashMap<String,Double>();
		map.put("Bagalkot", 25.4);
		map.put("Bijapur", 30.4);
		map.put("Mudhol", 31.4);
		map.put("Mysore", 32.4);
		map.put("Rajastan", 40.4);
		
		System.out.println(map.size());
		if(map.isEmpty()) {
		System.out.println("map nalli yella ide");
		}
		else {
			System.out.println("map nalli yella ide");
		}
		
		System.out.println("only keys are printed");
		Set<String> keys=map.keySet();
		//System.out.println(keys);
		keys.forEach(e->System.out.println(e));
	  
		
		System.out.println("only values are printed");
		 Collection<Double> values=map.values();
		 //System.out.println(values);
		 values.forEach(e->System.out.println(e));
		 
		 System.out.println("both keys and values are printed");
		Set<Entry<String,Double>> entries=map.entrySet();
		
		for(Entry<String,Double> ref:entries) {
			System.out.println(ref.getKey()+" "+ref.getValue());			
		}
		

	}
}
