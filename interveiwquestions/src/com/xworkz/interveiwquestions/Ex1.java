package com.xworkz.interveiwquestions;

import java.util.Iterator;
import java.util.Scanner;

public class Ex1 {
public static void main(String args[]) {
	
	int num;
	int count=0;
	//double a = 0,b = 0,c=0;
	System.out.println("enter the number");
	Scanner sc=new Scanner(System.in);
	num=sc.nextInt();
	double a=1;
	double b=2;
	double c=3;
 for (double i = a; i <c; i++) {
	 count+=1;
	 if(count==1) {
	    a=Math.pow(num, 1);
	 }
	 else if(count==2){
		b=Math.pow(num, 2);
	 }
	 else if(count==3){
		c=Math.pow(num, 3);
	 }
}
	
	System.out.println(a+"   "+ b +" "+c );
	
	
	
	
	
  }
}
