package com.xworkz.collections;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Comparator;

public class WeaponDTO implements Serializable,Comparable<WeaponDTO> {
	private String name;
	private String madeby;
	private LocalDate madeon;
	private int price;
	private Type type;
	
	public WeaponDTO() {
		super();
	}

	public WeaponDTO(String name, String madeby, LocalDate madeon, int price,Type type) {
		super();
		this.name = name;
		this.madeby = madeby;
		this.madeon = madeon;
		this.price = price;
		this.type=type;
	}

	
	
	@Override
	public String toString() {
		return "WeaponDTO [name=" + name + ", madeby=" + madeby + ", madeon=" + madeon + ", price=" + price + ", type="
				+ type + "]";
	}

	@Override
	public int hashCode() {
		
		return 30;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof WeaponDTO ) {
			WeaponDTO dto=(WeaponDTO)obj;
			if(dto.name.equals(this.name)) {
				return true;
			}
				
			return false;	
			}
		}
		
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMadeby() {
		return madeby;
	}

	public void setMadeby(String madeby) {
		this.madeby = madeby;
	}

	public LocalDate getMadeon() {
		return madeon;
	}

	public void setMadeon(LocalDate madeon) {
		this.madeon = madeon;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	

	@Override
	public int compareTo(WeaponDTO o) {
		return this.name.compareTo(o.name);

	}

	
	
	
	

}
