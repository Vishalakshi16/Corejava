package com.xworkz.bigBasket.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="new_table")
public class BigBasketEntity {
	@Id
	@Column(name = "b_id")
	private int id;
	
	
	@Column(name = "b_item")
	private String item;
	
	@Column(name = "b_brand")
	private String brand;
	
	@Column(name = "b_section")
	private String section;
	
	@Column(name = "b_purchase")
	private boolean purchase;
	
	@Column(name = "b_owner")
    private String owner;
	
	@Column(name = "b_ownerWife")
    private String ownerWife;
	
	@Column(name = "b_noOfWorkers")
    private int noOfWorkers;
	
	@Column(name = "b_email")
    private String email;
	
	@Column(name = "b_password")
    private String password;
	
	@Column(name = "b_area")
    private String area;
    

}
