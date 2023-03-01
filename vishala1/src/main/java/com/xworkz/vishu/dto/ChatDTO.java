package com.xworkz.vishu.dto;

import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Component
public class ChatDTO {
	public String name;
	public String type;
	public int price;
	public int quantity;
	public int ranting;
	
	public boolean tasty;
	public String CenterName;
	public String owner;
	public int noOfCharts;
	public long ownerPh;
	
	public String Address;
	public int id;
	
	public ChatDTO() {
		System.out.println("created"+getClass().getSimpleName());
	}

}
