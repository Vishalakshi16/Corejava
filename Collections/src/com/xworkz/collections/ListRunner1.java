package com.xworkz.collections;

import java.util.LinkedList;
import java.util.List;

public class ListRunner1 {
	
	public static void main(String[] args) {
		List<Integer> li=new LinkedList<Integer>();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		li.add(5);
		li.add(6);
		
		for(int ref:li) {
			System.out.println(ref);
		}
		
		System.out.println("**************add*****  both allowed************");
		li.add(0,18);
		li.add(1,19);
		
		for(int ref:li) {
			System.out.println(ref);
		}
		

		
	System.out.println("***********REMOVE******index only**********");
	li.remove(0);
	li.remove(2);
	for(int ref:li) {
		System.out.println(ref);
	}
	
	System.out.println("******************set*****both**********************");
	li.set(0, 20);
	li.set(1, 22);
	for(int ref:li) {
		System.out.println(ref);
	}

	}
}
