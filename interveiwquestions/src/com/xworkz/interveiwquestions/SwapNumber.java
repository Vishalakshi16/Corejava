package com.xworkz.interveiwquestions;

public class SwapNumber {
	public static void main(String[] args) {
		
	int a=10;
	int b=20;
	System.out.println("before swapping numbers are "+ a +" "+ b );
//	temp=a;
//	a=b;
//	b=temp;
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("after swapping numbers are "+ a +" "+ b );
	
	}

}