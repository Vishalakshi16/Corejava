package com.xworkz.interveiwquestions;

public class PalindromNum {
	
	
		
		public static void main(String[] args) {
			int  num=121;
			int rev=0;
			int digit ;
			int temp=num;

			while(num!=0) {
				digit =num%10;
				rev=(10*rev)+digit;
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
