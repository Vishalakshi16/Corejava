package com.xworkz.redbus.transport;

public class RedBusTester {
public static void main(String[] args) {
	RedBusContract rd= new VrlImpl();
	
	Transportation transport=new Transportation();
	transport.noOfBookings=24;
	transport.bookings(rd);
	 
	 
}
}
