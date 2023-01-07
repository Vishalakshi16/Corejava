package com.xworkz.map;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Pg {
	public static void main(String[] args) {
		Map<String,Double> map=new TreeMap();
		map.put("Bajju",335D);
		map.put("sneha",3456D);
		map.put("Manu", 1234D);
		map.put("Sawati",2345D);
		map.put("Preeti",3456D);
		map.put("Shubhangi",4567D);
		map.put("Sree Sai",5678D);
		map.put("Maruti ", 6789D);
		map.put("Kshi", 7890D);
		map.put("Manju",5567D);
		
		System.out.println("***********keys*************");
		Set<String> keys=map.keySet();
		keys.forEach(e->System.out.println(e));
		
		System.out.println("***************values***************");
		Collection<Double> values=map.values();
		values.forEach(e->System.out.println(e));
		
		
		System.out.println("******************Both*****************");
		Set<Entry<String,Double>> entries=map.entrySet();
		for(Entry ref:entries) {
			System.out.println(ref.getKey()+" "+ref.getValue());
			
		}
		
	}

}
