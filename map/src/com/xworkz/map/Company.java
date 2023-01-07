package com.xworkz.map;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Company {
	public static void main(String[] args) {
		Map<String,String> map=new TreeMap<String,String>();
		
		map.put("Capgemini", "SystemSoftware");
		map.put("cognizant", "ApplicationSoftware");
		map.put("TCH", "utilitySoftware");
		map.put("Betron", "SystemSoftware");
		map.put("Infosys", "ApplicationSoftware");
		map.put("SeekingGon", "SystemSoftware");
		map.put("SwipeWire", "SystemSoftware");
		map.put("Salepush", "utilitySoftware");
		map.put("Formonix", "JavaSoftware");
		map.put("google", "LinuxSoftware");
		
		System.out.println("******keys**********");
		Set<String> keys=map.keySet();
		keys.forEach(e->System.out.println(e));
		
		System.out.println("**********values*****");
		Collection<String> values=map.values();
		values.forEach(e->System.out.println(e));
		
		System.out.println("*********both********");
		Set<Entry<String,String>> entries=map.entrySet();
		for(Entry ref:entries) {
			System.out.println(ref.getKey()+" "+ref.getValue());
		}
		
		
	}

}
