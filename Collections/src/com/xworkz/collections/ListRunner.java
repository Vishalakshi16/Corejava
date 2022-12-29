package com.xworkz.collections;

import java.util.ArrayList;
import java.util.List;

public class ListRunner {
	public static void main(String[] args) {
		
		List<String> li=new ArrayList<String>();
	     li.add("a");//0
	     li.add("b");//1
	     li.add("c");//2
	     li.add("d");//3
	     li.add("e");//4
	     li.add("f");//5
	     
	     for(String ref:li) {
	    	 System.out.println(ref);
	     }
	     
	     System.out.println("*************ADD Method**************");
	     li.add(1,"v");
	    // li.add(2,"b");
	     
	     for(String ref:li) {
	    	 System.out.println(ref);
	     }
	     
	     System.out.println("******************REMOVE***********************");
	     li.remove(1);
	     li.remove("f");
	     
	     for(String ref:li) {
	    	 System.out.println(ref);
	     }
	     
	     System.out.println("*****************SET *****************");
	     li.set(0,"vishu");
	     li.set(2,"chaitu");
	     for(String ref:li) {
	    	 System.out.println(ref);
	     }
	     
	     
	     
	}

}
