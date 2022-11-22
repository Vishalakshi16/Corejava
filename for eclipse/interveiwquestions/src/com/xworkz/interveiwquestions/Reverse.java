package com.xworkz.interveiwquestions;

public class Reverse {
	
public static void main(String[] args) {
	int  num=123;
	int rev=0;
	int digit ;

	while(num!=0) {
		digit =num%10;
		rev=(10*rev)+digit;
		num=num/10;
		}
System.out.println(rev);

}

}
