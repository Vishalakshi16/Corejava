package com.xworkz.collections;

public class GameDTO {
	private String name;
	private String type;
	private int noOfPlayers;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getNoOfPlayers() {
		return noOfPlayers;
	}
	public void setNoOfPlayers(int noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}
	public GameDTO(String name, String type, int noOfPlayers) {
		super();
		this.name = name;
		this.type = type;
		this.noOfPlayers = noOfPlayers;
	}
	
	@Override
	public String toString() {
		return "Game [name=" + name + ", type=" + type + ", noOfPlayers=" + noOfPlayers + "]";
	}
	public GameDTO() {
		
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof GameDTO) {
				GameDTO dto=(GameDTO)obj;
				if(dto.name.equals(this.name)) {
					System.out.println("name is matching "+dto.name);
					return true;
				}
				
				if(dto.type.equals(this.type)) {
					System.out.println("name is matching "+dto.type);
					return true;
				}
			}
		}
		return false;
	}
		
		
	}


