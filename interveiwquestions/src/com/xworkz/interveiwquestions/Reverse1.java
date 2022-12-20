package com.xworkz.interveiwquestions;

public class Reverse1 {

	public static void main(String[] args) {
		String name="java programming";
		//there is no derect methode 
		System.out.println(name);
		
		//inbuilt are length() and charAt(i)
		for (int i = 0; i <name.length(); i++) {
			System.out.print(" "+name.charAt(i));
		}
		
		for (int i = name.length()-1; i>=0 ; i--) {
			System.out.print( " "+name.charAt(i));
		}
		//counting the given char
		int count=0;
		int count1=0;
		for (int i = 0; i < name.length(); i++) {
			if(name.charAt(i)=='a') {
				count+=1;
			
			}
			
			else {
				count1+=1;
		}
		
		}
		System.out.println(count);
		System.out.println(count1);
	}
}
