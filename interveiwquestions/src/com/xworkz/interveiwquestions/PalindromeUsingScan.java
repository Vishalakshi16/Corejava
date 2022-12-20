package com.xworkz.interveiwquestions;

import java.util.Scanner;

public class PalindromeUsingScan {
public static void main(String[] args) {
	System.err.println("enter num value");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int digit=0;
	int rev=0;
	int temp=num;
	
	while(num>0) {
		digit=num%10;
		rev=rev*10+digit;
		num=num/10;
		
	}
	if(temp==rev) {
		System.out.println("palindrom");
	}
	else {
		System.out.println("not palindrom");
	}
	
}
}
