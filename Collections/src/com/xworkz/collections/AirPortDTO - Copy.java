package com.xworkz.collections;

public class AirPortDTO {
	private String name;
	private String place;
	private int ticketPrice;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public AirPortDTO(String name, String place, int ticketPrice) {
		super();
		this.name = name;
		this.place = place;
		this.ticketPrice = ticketPrice;
	}
	public int getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(int ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	@Override
	public String toString() {
		return "AirPortDTO [name=" + name + ", place=" + place + ", ticketPrice=" + ticketPrice + "]";
	}
	
	
	public AirPortDTO() {
		
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof AirPortDTO) {
				AirPortDTO dto=(AirPortDTO)obj;
				if(dto.name.equals(this.name)) {
					System.out.println("name is matching "+dto.name);
					return true;
				}
				
				if(dto.place.equals(this.place)) {
					System.out.println("name is matching "+dto.place);
					return true;
				}
			}
		}
		return false;
	}

}
