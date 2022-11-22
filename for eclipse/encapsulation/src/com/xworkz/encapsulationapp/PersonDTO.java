package com.xworkz.encapsulationapp;

public class PersonDTO {
private String name;
private String personJob;
private String location;

public void setPersonName(String name) {
	this.name=name;
	
}

public String getPersonName() {
	return name;
}

public void setPersonJob(String personJob) {
	this.personJob=personJob;
}

public String getPersonJob() {
	return personJob;
}

public void setLocation(String location) {
	this.location=location;
}

public String getLocation() {
	return location;
}
}
