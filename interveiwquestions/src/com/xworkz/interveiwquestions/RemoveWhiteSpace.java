package com.xworkz.interveiwquestions;

import java.util.Scanner;

public class RemoveWhiteSpace {
public static void main(String[] args) {
	System.out.println("enter string ");
	Scanner sc=new Scanner(System.in);
	 String s=sc.nextLine();
	 
	 char c[]=s.toCharArray();
	 for (int i = 0; i < c.length; i++) {
		if(c[i]!=' ') {
			System.out.print(c[i]);
			
		}
	}
}
}
