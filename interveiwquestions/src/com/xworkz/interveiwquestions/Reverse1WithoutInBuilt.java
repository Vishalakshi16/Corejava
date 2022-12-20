package com.xworkz.interveiwquestions;

public class Reverse1WithoutInBuilt {
	public static void main(String[] args) {
		int count=0;
		int count1=0;
		String str="Good Morning";
		//tocharaarray : string as input char is a output 
		for (char ch:str.toCharArray()) {
			if(ch=='o') {
				count+=1;
			}
			else {
				count1+=1;
			}
			//System.out.print(ch+" ");
		}
		System.out.println(count);
		System.out.println(count1);
	}

}
