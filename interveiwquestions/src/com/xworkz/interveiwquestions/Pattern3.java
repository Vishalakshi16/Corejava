package com.xworkz.interveiwquestions;

public class Pattern3 {
public static void main(String[] args) {
	for (int row = 1; row<=3; row++) {
		for (int col = 1; col<=3; col++) {
			if(col==1||col==3||row==2&&col==2) {
				System.out.print("@");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}
