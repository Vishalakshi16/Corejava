package com.xworkz.interveiwquestions;

public class Palindrome {
	public static void main(String[] args) {
		int  num=123;
		int rev=0;
		int digit ;
         int temp=num;
		while(num!=0) {
			digit =num%10;
			rev=(10*rev)+digit;
			num=num/10;
			}
		if(temp==num) {
	System.out.println("pallindrom");

	}
		else {
			System.out.println("not a palindrom");
			}
		}
}
