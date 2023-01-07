package com.xworkz.map;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Pincode_Area {
	public static void main(String[] args) {
		Map<Long,String> map=new HashMap<Long,String>();
		map.put(234567L, "Bagalkot");
		map.put(434567L, "Hubli");
		map.put(734567L, "Darwad");
		map.put(934567L, "Mumbai");
		map.put(334567L, "Haveri");
		map.put(134567L, "Hasan");
		map.put(424567L, "Shivamoga");
		map.put(634567L, "Talikotte");
		map.put(7734567L, "Bijapur");
		map.put(884567L, "Ronihal");
		
		
		System.out.println("***********keys************");
		Set<Long> keys=map.keySet();
		System.out.println(keys);
		
		System.out.println("************Values*******");
		Collection<String> values=map.values();
		values.forEach(e->System.out.println(e));
		
		System.out.println("both");
		Set<Entry<Long,String>> entries=map.entrySet();
		for(Entry ref:entries) {
			System.out.println(ref.getKey()+" "+ref.getValue());
			
		}
		
		
	}

}
