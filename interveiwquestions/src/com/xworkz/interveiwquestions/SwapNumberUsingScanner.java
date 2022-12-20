package com.xworkz.interveiwquestions;

import java.util.Scanner;

public class SwapNumberUsingScanner {
public static void main(String[] args) {
	
	System.out.println("enter two numbers x and y");
	Scanner sc=new Scanner(System.in);
	Scanner sc1=new Scanner(System.in);
	int x=sc.nextInt();
    int y=sc1.nextInt();
    x=x+y;
    y=x-y;
    x=x-y;
    System.out.println(x+" "+y);
	
}
}
