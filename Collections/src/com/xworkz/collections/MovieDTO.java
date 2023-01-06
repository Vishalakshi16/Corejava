package com.xworkz.collections;

import java.io.Serializable;
import java.time.LocalDate;

public class MovieDTO  implements Serializable,Comparable<MovieDTO>{
	
	private String name;
	private String language;
	private double budget;
	private LocalDate date;
	private double profit;
	
	public MovieDTO() {
		super();
	}

	public MovieDTO(String name, String language, double budget, LocalDate date, double profit) {
		super();
		this.name = name;
		this.language = language;
		this.budget = budget;
		this.date = date;
		this.profit = profit;
	}

	@Override
	public String toString() {
		return "MovieDTO [name=" + name + ", language=" + language + ", budget=" + budget + ", date=" + date
				+ ", profit=" + profit + "]";
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 20;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof MovieDTO) {
				MovieDTO dto=(MovieDTO)obj;
				if(dto.name.equals(this.name)) {
					return true;
					
				}
				
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

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public double getProfit() {
		return profit;
	}

	public void setProfit(double profit) {
		this.profit = profit;
	}

	

	@Override
	public int compareTo(MovieDTO o) {
		return this.name.compareTo(o.name);
	}
	
	
	

}
