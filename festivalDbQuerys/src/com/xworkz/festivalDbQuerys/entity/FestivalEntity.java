package com.xworkz.festivalDbQuerys.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="festival_inf")
@Data
@NoArgsConstructor
@NamedQuery(name = "findByIdAndName",query = "select en from FestivalEntity en where en.name ='independent' and en.id =25")
@NamedQuery(name = "findByNameAndRegionAndMainGod", query = "select en from FestivalEntity en where en.name ='Christmas' and en.region ='Karnataka' and en.mainGod ='Jesus'")
@NamedQuery(name = "findByMainGod",query = "select en from FestivalEntity en where en.mainGod ='vishnu'")
@NamedQuery(name = "findTotalDaysByName",query = "select en.totalDays from FestivalEntity en where en.name='Holi Hunnime'")
@NamedQuery(name = "findRegionAndMainGodByNameAndId",query ="select en.region,en.mainGod from FestivalEntity en where en.name='Krishna Janmashtami' and en.id=11")
@NamedQuery(name = "findMainGodAndTotalDaysByName",query ="select en.mainGod, en.totalDays from FestivalEntity en where en.name='Ramzan'")
@NamedQuery(name = "findTotal",query="select count(en) from FestivalEntity en")
@NamedQuery(name = "findMaxTotalDays",query = "select max(totalDays) from FestivalEntity en")
public class FestivalEntity {
	
	public FestivalEntity(String name, String region, int totalDays, String sweet, String mainGod) {
		super();
		this.name = name;
		this.region = region;
		this.totalDays = totalDays;
		this.sweet = sweet;
		this.mainGod = mainGod;
	}

	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String  name;
	
	
	@Column(name="region")
	private String region;
	
	
	@Column(name="total_days")
	private int totalDays;
	
	@Column(name="sweet")
	private String sweet;
	
	@Column(name="main_god")
	private String mainGod;
	

}
