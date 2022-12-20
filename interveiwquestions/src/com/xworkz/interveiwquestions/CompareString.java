package com.xworkz.interveiwquestions;

public class CompareString {
	public static void main(String[] args) {
		String str="nayan";
		String  reverse="";
		for (int i = 0; i <str.length(); i++) {
			System.out.print(" "+str.charAt(i));
		}
		
		for (int i = str.length()-1; i>=0 ; i--) {
			System.out.print( " "+str.charAt(i));
		 reverse+=str.charAt(i);
		}
		if(str.equals(reverse)) {
			System.out.println("matched");
			
		}
		else {
			System.out.println("not matched");
		}
	}
}
