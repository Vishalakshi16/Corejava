package com.workz.examapp.hallticket;

public class HallTicket{
	private String candidateName;
	private String subjectName[];
	private String usnNo;
	private String universityName;


public HallTicket(String candidateName,String subjectNames[],String usnNo,String universityName){
	this.candidateName=candidateName;
	this.subjectName=subjectNames;
	this.usnNo=usnNo;
	this.universityName=universityName;
	
}
public void displayDetailes() {
	System.out.println("candidateName is "+this.candidateName);
	System.out.println("candidateName is "+this.subjectName);
	System.out.println("candidateName is "+this.usnNo);
	System.out.println("candidateName is "+this.universityName);
	System.out.println("list the subject names are belowed");
	for (int i = 0; i < subjectName.length; i++) {
		System.out.println(subjectName[i]);
	}
}
}
