package com.xworkz.collections;

public class CalendarDTO {
	private String name;
	private String language;
	private int id;
	
	public CalendarDTO(String name, String language, int id) {
		super();
		this.name = name;
		this.language = language;
		this.id = id;
	}
	@Override
	public String toString() {
		return "CalendarDTO [name=" + name + ", language=" + language + ", id=" + id + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
	public CalendarDTO() {
		
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof CalendarDTO) {
				CalendarDTO dto=(CalendarDTO)obj;
				if(dto.name.equals(this.name)) {
					System.out.println("name is matching "+dto.name);
					return true;
				}
				
				if(dto.id==(this.id)) {
					System.out.println("id is matching "+dto.id);
					return true;
				}
				
				
			}
		}
		return false;
	}

}
