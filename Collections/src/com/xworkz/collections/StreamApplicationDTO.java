package com.xworkz.collections;

import java.io.Serializable;
import java.util.Objects;

public class StreamApplicationDTO implements Serializable{
	private String name;
	private double version ;
	private boolean free;
	private String developedBy;
	private long price;
	
	
	public StreamApplicationDTO() {
		
	}
	
	
	public StreamApplicationDTO(String name, double version, boolean free, String developedBy, long price) {
		super();
		this.name = name;
		this.version = version;
		this.free = free;
		this.developedBy = developedBy;
		this.price = price;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getVersion() {
		return version;
	}
	public void setVersion(double version) {
		this.version = version;
	}
	public boolean isFree() {
		return free;
	}
	public void setFree(boolean free) {
		this.free = free;
	}
	public String getDevelopedBy() {
		return developedBy;
	}
	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "StreamApplicationDTO [name=" + name + ", version=" + version + ", free=" + free + ", developedBy="
				+ developedBy + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		return 25;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof StreamRelatedPrgm4 ) {
				StreamRelatedPrgm4 dto=(StreamRelatedPrgm4)obj;
				if(dto.getName().equals(this.name)) {
					System.out.println("matching name"+dto.getName());
					return true;
					
					
				}
				
			}
			
		}
		return false;
	}
	
	
	

}
