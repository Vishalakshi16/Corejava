package com.workz.examapp.exam;
import com.workz.examapp.hallticket.HallTicket;

public class Exam {
	public HallTicket hallTicket;
	public  int fees;
	
 public boolean allow(HallTicket hallTicket) {
	 boolean isAllowed=false;
	 System.out.println("inside allow()");
	 System.out.println("the fees paid is:"+this.fees);
	 if(fees>=1200) {
		 System.out.println("fees is paid");
		 if(hallTicket!=null) {
		 this.hallTicket=hallTicket;
		 System.out.println("detailes of the candiate hallticket are");
		 this.hallTicket.displayDetailes();
		 isAllowed=true;
		 System.out.println("hallticket has been issued : now");
	 }
	 else {
		 System.out.println("no hallticket is found ");
	 }
	 }
	 else {
		 System.out.println("first pay the fees");
	 }
	 return isAllowed=true;
 }
}
