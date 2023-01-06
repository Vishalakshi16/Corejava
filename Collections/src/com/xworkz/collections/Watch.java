<<<<<<< HEAD
package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Watch {

	public static void main(String[] args) {
		String watch1="Taitan";
		String watch2="Timex";
		String watch3="swatch";
		String watch4="casio";
		String watch5="cartier";
		

		
		
Collection<String> collection=new ArrayList<String>();
		
		collection.add(watch1);
		collection.add(watch2);
		collection.add(watch3);
		collection.add(watch4);
		collection.add(watch5);
		
		
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

public class Watch {

	public static void main(String[] args) {
		String watch1="Taitan";
		String watch2="Timex";
		String watch3="swatch";
		String watch4="casio";
		String watch5="cartier";
		

		
		
Collection<String> collection=new ArrayList<String>();
		
		collection.add(watch1);
		collection.add(watch2);
		collection.add(watch3);
		collection.add(watch4);
		collection.add(watch5);
		
		
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
