<<<<<<< HEAD
package com.xworkz.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class ShoesSize {
	public static void main(String[] args) {
		Integer shoesSize1=6;
		Integer shoesSize2=7; 
		Integer shoesSize3=8; 
		Integer shoesSize4=9; 
		Integer shoesSize5=10; 
		Integer shoesSize6=16; 
		Integer shoesSize7=26; 
		Integer shoesSize8=36; 
		Integer shoesSize9=46; 
		Integer shoesSize10=56; 
		Integer shoesSize11=66;
		Integer shoesSize12=76; 
		Integer shoesSize13=86; 
		Integer shoesSize14=61; 
		Integer shoesSize15=62; 
		
		

		TreeSet<Integer> collection=new TreeSet<Integer>();
		
		
		collection.add(shoesSize1);
		collection.add(shoesSize1);
		collection.add(shoesSize3);
		collection.add(shoesSize4);
		collection.add(shoesSize5);
		collection.add(shoesSize6);
		collection.add(shoesSize7);
		collection.add(shoesSize8);
		collection.add(shoesSize9);
		collection.add(shoesSize10);
		collection.add(shoesSize11);
		collection.add(shoesSize12);
		
		for(Integer element:collection) {
			System.out.println(element);
			
		}
		
		Iterator<Integer> ref=collection.iterator();
		while(ref.hasNext())
		{
			Integer element=ref.next();
		System.out.println(element);
		}
	}

}
=======
package com.xworkz.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class ShoesSize {
	public static void main(String[] args) {
		Integer shoesSize1=6;
		Integer shoesSize2=7; 
		Integer shoesSize3=8; 
		Integer shoesSize4=9; 
		Integer shoesSize5=10; 
		Integer shoesSize6=16; 
		Integer shoesSize7=26; 
		Integer shoesSize8=36; 
		Integer shoesSize9=46; 
		Integer shoesSize10=56; 
		Integer shoesSize11=66;
		Integer shoesSize12=76; 
		Integer shoesSize13=86; 
		Integer shoesSize14=61; 
		Integer shoesSize15=62; 
		
		

		TreeSet<Integer> collection=new TreeSet<Integer>();
		
		
		collection.add(shoesSize1);
		collection.add(shoesSize1);
		collection.add(shoesSize3);
		collection.add(shoesSize4);
		collection.add(shoesSize5);
		collection.add(shoesSize6);
		collection.add(shoesSize7);
		collection.add(shoesSize8);
		collection.add(shoesSize9);
		collection.add(shoesSize10);
		collection.add(shoesSize11);
		collection.add(shoesSize12);
		
		for(Integer element:collection) {
			System.out.println(element);
			
		}
		
		Iterator<Integer> ref=collection.iterator();
		while(ref.hasNext())
		{
			Integer element=ref.next();
		System.out.println(element);
		}
	}

}
>>>>>>> 7a206f2b905225af17e2f91ffe99946aa7136d01
