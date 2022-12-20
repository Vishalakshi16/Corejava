package com.xworkz.polymorphismapp.Exam;

public class Supplementary extends Exam {
	int noOfAttempts;
	public Supplementary(int noOfAttempts) {
		this.noOfAttempts=noOfAttempts;
	}
	@override/*it is not mendotary it is good practice--->
	@override:it is one of the annotation  metadata which is used to give info to the compilation */
	
	public boolean allow(HallTicket hallticket)
	{
	 System.out.println("invoke allow methode of supplementary");
	 if(noOfAttempts>1) {
		 return super.allow(hallticket);
	 }
	return false;	
	}
}
//DTO--->data transfer object ,design pattern task---8 on DTOS