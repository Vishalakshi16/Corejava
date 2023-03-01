package com.xworkz.vishala.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


import lombok.Data;

@Data
@Entity
@Table(name="river_info")
@NamedQuery(name="findByName",query="select en from RiverEntity en where en.name=:nm")
public class RiverEntity {
	
	@Id
	@Column(name="r_id")
	private int id;
	
	@Column(name="r_name")
	private String name;
	
	@Column(name="r_noOfSubRivers")
    private Integer noOfSubRivers;
	
	@Column(name="r_birthplace")
    private String birthplace;
	
	@Column(name="r_location")
    private String location;


}
