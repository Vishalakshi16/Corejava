package com.xworkz.redbus.transport;

public class Transportation {
	
	RedBusContract redBusContract;
	int noOfBookings;
	String name=" Shree Durga Parameshary";
	
	public boolean bookings(RedBusContract contract) {
		boolean isBookingDone=false;
		System.out.println("inside booking methods");
		boolean condition =contract.conditionOfBus();
		if(condition==true) {
			System.out.println("bus is in good condition");
			if(noOfBookings<=contract.minBooking()) {
				System.out.println("no of booking is "+ noOfBookings);
				System.out.println("tq for booking the ticket tbrought "+name);
				isBookingDone=true;
			}
			else {
			System.out.println("cannot proceeds with booking as number of book exceeds");	
			}
		}
			else{
				System.out.println("cannot proceeds with booking as bus is not in good condition");
			}
			return isBookingDone;
		}
	}


