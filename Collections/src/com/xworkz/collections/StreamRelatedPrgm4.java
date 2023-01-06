package com.xworkz.collections;

import java.util.Objects;

public class StreamRelatedPrgm4 {
	
	public StreamRelatedPrgm4() {
		
	}
	
	   public StreamRelatedPrgm4(String name, String location, boolean isDestroyed, long price) {
		super();
		this.name = name;
		this.location = location;
		this.isDestroyed = isDestroyed;
		this.price = price;
	}
	   private	String name;
	   private String location;
	   
	   public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public boolean isDestroyed() {
		return isDestroyed;
	}
	public void setDestroyed(boolean isDestroyed) {
		this.isDestroyed = isDestroyed;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	  private  boolean isDestroyed;
	   private long price;
	   
	   
	@Override
	public String toString() {
		return "StreamRelatedPrgm4 [name=" + name + ", location=" + location + ", isDestroyed=" + isDestroyed
				+ ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(isDestroyed, location, name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof StreamRelatedPrgm4 ) {
				StreamRelatedPrgm4 dto=(StreamRelatedPrgm4)obj;
				if(dto.name.equals(this.name)) {
					System.out.println("matching name"+dto.name);
					return true;
					
					
				}
				
			}
			
		}
		return false;
	  }
	
	}
