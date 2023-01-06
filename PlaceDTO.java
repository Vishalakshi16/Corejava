package com.xworkz.collections;

public class PlaceDTO {
	private String name;
	private String speciality;
	private int noOfTaluk;
	
	@Override
	public String toString() {
		return "PlaceDTO [name=" + name + ", speciality=" + speciality + ", noOfTaluk=" + noOfTaluk + "]";
	}
	public PlaceDTO(String name, String speciality, int noOfTaluk) {
		super();
		this.name = name;
		this.speciality = speciality;
		this.noOfTaluk = noOfTaluk;
	}
	
	public PlaceDTO() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public int getNoOfTaluk() {
		return noOfTaluk;
	}
	public void setNoOfTaluk(int noOfTaluk) {
		this.noOfTaluk = noOfTaluk;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof PlaceDTO) {
				PlaceDTO dto=(PlaceDTO)obj;
				if(dto.name.equals(this.name)) {
					System.out.println("name is matching "+dto.name);
					return true;
				}
				
				
				if(dto.speciality.equals(this.speciality)) {
					System.out.println("name is matching "+dto.speciality);
					return true;
				}
			}
		}
		return false;
	}

}
