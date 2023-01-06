package com.xworkz.collections;

public class HolidayDTO {
	private String name;
	private String anouncedBy;
	private int noOfDays;
	
	public HolidayDTO(String name, String anouncedBy, int noOfDays) {
		super();
		this.name = name;
		this.anouncedBy = anouncedBy;
		this.noOfDays = noOfDays;
	}
	@Override
	public String toString() {
		return "HolidayDTO [name=" + name + ", anouncedBy=" + anouncedBy + ", noOfDays=" + noOfDays + ", getName()="
				+ getName() + ", getAnouncedBy()=" + getAnouncedBy() + ", getNoOfDays()=" + getNoOfDays()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAnouncedBy() {
		return anouncedBy;
	}
	public void setAnouncedBy(String anouncedBy) {
		this.anouncedBy = anouncedBy;
	}
	public int getNoOfDays() {
		return noOfDays;
	}
	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}
	
	public HolidayDTO() {
		
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof HolidayDTO) {
				HolidayDTO dto=(HolidayDTO)obj;
				if(dto.name.equals(this.name)) {
					System.out.println("name is matching "+dto.name);
					return true;
				}
				
				if(dto.anouncedBy.equals(this.anouncedBy)) {
					System.out.println("name is matching "+dto.anouncedBy);
					return true;
				}
			}
		}
		return false;
}
}
