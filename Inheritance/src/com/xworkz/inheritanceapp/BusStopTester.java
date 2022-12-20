package com.xworkz.inheritanceapp;

import com.xworkz.inheritanceapp.inheritance.BusStop;
import com.xworkz.inheritanceapp.inheritance.inherite.Majestic;

public class BusStopTester {

	public static void main(String args[]) {
		BusStop bs = new BusStop();
		bs.toTravel(50);
		System.out.println("Bus tickent amount is.."+bs.ticket);
		
		Majestic mj = new Majestic();
		mj.toTravel(30);
		System.out.println("Majestic bus ticket amount is.."+ mj.ticket);
		}
}
