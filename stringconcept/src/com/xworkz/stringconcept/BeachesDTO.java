package com.xworkz.stringconcept;

public class BeachesDTO {
private  String name;
private  int id;





public BeachesDTO() {
	System.out.println(this.getClass().getName());
	}

public  String getName() {
	return this.name;
}

public void setName(String name) {
	this.name = name;
}

public  int getId() {
	return id;
}

public  void setId(int id) {
	this.id = id;
}

@Override
public String toString() {
	
	return "Beaches-[Beach Id="+ this.getId() +" , Beach Name="+ this.getName() +" ] ";
	
	//return "clsname-{representation="this.getId()"}"
 }
@Override
public boolean equals(Object obj) {
	BeachesDTO beach= (BeachesDTO) obj;
	if(this.getName().equals(beach.getName())) {
		return true;
	}
	else {
		return false;
	}
	
}

@Override
public int hashCode() {
	return this.id;
}

}
