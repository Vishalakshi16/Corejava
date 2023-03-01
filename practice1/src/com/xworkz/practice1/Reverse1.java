package com.xworkz.practice1;

public class Reverse1 {
public static void main(String[] args) {
			int num=123;
			int digit=0;
			int rev=0;
			
			while(num>=0) {
			digit=num%10;
			num=num/10;
			rev=rev+digit*10;
			
			}
			System.out.println(rev);
			
		

	}
}
