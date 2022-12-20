package com.xworkz.inbuiltfunction;
import com.xworkz.inbuiltfunction.AnimalTester;

public class AnimalTester{
	


	public static void main(String[] args) {
		
		String str="kgf2 is a movie";
		 System.out.println(str.toString());//jvm
		
		AnimalDTO beaches=new AnimalDTO();
		beaches.setId(1);
		beaches.setName("cat");
		System.out.println(beaches);
		
		
		AnimalDTO beaches1=new AnimalDTO();
		beaches1.setId(2);
		beaches1.setName("dog");
		System.out.println(beaches1);
		System.out.println(beaches==beaches1);
		System.out.println(beaches.equals(beaches1));
		
		
		System.out.println(beaches1.hashCode());
	
	}
}
