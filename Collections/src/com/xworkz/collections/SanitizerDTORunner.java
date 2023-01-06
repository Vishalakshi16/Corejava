package com.xworkz.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class SanitizerDTORunner {
	public static void main(String[] args) {
		SanitizerDTO sanitizerDTO=new SanitizerDTO("pink","Sterillium",1,100D);
		SanitizerDTO sanitizerDTO1=new SanitizerDTO("green","savlon",2,200D);
		SanitizerDTO sanitizerDTO2=new SanitizerDTO("black","dettol",3,4D);
		SanitizerDTO sanitizerDTO3=new SanitizerDTO("blue","lifebuoy",4,400D);
		SanitizerDTO sanitizerDTO4=new SanitizerDTO("chocalate","godrej",5,500D);
		SanitizerDTO sanitizerDTO5=new SanitizerDTO("red","dabur",6,600D);
		SanitizerDTO sanitizerDTO6=new SanitizerDTO("purple","multani",7,700D);
		SanitizerDTO sanitizerDTO7=new SanitizerDTO("nevyblue","corvil",8,800D);
		SanitizerDTO sanitizerDTO8=new SanitizerDTO("waterclr","trust",9,900D);
		SanitizerDTO sanitizerDTO9=new SanitizerDTO("yellow","DCM shrisham",10,1100D);
		
		
		Collection<SanitizerDTO> collection=new LinkedList<SanitizerDTO>();
		collection.add(sanitizerDTO);
		collection.add(sanitizerDTO1);
		collection.add(sanitizerDTO2);
		collection.add(sanitizerDTO3);
		collection.add(sanitizerDTO4);
		collection.add(sanitizerDTO5);
		collection.add(sanitizerDTO6);
		collection.add(sanitizerDTO7);
		collection.add(sanitizerDTO8);
		collection.add(sanitizerDTO9);
	
	
		
		/*Iterator<SanitizerDTO> itr2=collection.iterator();
		   while(itr2.hasNext()) {
			   SanitizerDTO element2=itr2.next();
			   if(element2.getPrice()>5) {
				   System.out.println("element is  "+element2);
				   
				  
			   }
		   }*/
		   
		   
		   
		   Iterator<SanitizerDTO> itr1=collection.iterator();
		   while(itr1.hasNext()) {
			   SanitizerDTO element1=itr1.next();
			   if("grren".equals(element1.getColor())) {
				   System.out.println(element1);
				   
			   }
			   //System.out.println(element1); 
		   }
		   
		   

	}
	
	

}
