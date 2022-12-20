package com.xworkz.interveiwquestions;

public class Pattern {
	public static void main(String[] args) {
		for (int row = 1; row <=4; row++) {
			for (int col = 1; col <=4; col++) {
				if(col==1 || col==4 ||row==1|| row==4) {
					System.out.print("#");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}
}
