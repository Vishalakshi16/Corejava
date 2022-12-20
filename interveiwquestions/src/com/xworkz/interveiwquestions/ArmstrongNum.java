package com.xworkz.interveiwquestions;

public class ArmstrongNum {
public static void main(String[] args) {
	int num=143;
	int i=num;
	int sum=0;
	int n=0;
	while(num>0) {
		n=num%10;
		num=num/10;
		sum=sum+(n*n*n);
		
	}
	if(i==sum) {
		
		System.out.println("armstrong");
		
	}
	else {
		
		System.out.println("not Armstrong");
		
	}
	
}
}
