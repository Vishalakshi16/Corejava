package com.workz.examapp;

import com.workz.examapp.exam.Exam;
import com.workz.examapp.hallticket.HallTicket;

public class ExamTester {
	public static void main(String args[]) {
		String subjectNames[]= {"os","vlsi","m1","m2"};
		HallTicket hallTicket=new HallTicket("manga",subjectNames, "2LB17EC016", "vtu");
		Exam exam=new Exam();
		exam.fees=1200;
		boolean isAllowed=exam.allow(hallTicket);
		System.out.println("allowed to write a exam "+isAllowed);
		
		
		HallTicket hallTicket1=new HallTicket("manga",subjectNames, "2LB17EC016", "vtu");
		Exam exam1=new Exam();
		exam1.fees=1200;
		boolean isAllowed1=exam1.allow(hallTicket);
		System.out.println("allowed to write a exam "+isAllowed1);
		

	}
}
