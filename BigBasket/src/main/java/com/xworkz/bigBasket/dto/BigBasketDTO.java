package com.xworkz.bigBasket.dto;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class BigBasketDTO {

	
	
	
	@NotBlank(message = "item should be selected")
	private String item;



	@Size(min = 3, max = 20, message = "brand cannot be less than 3 or greater than 20 chars")
	private String brand;

	
	
	@Size(min = 3, max = 20, message = "section cannot be less than 3 or greater than 20 chars")
	private String section;

	
	
	@Size(min = 3, max = 20, message = "Name cannot be less than 3 or greater than 20 chars")
	private Boolean purchase;

	
	
	@Size(min = 3, max = 20, message = "Name cannot be less than 3 or greater than 20 chars")
	private String owner;

	
	@Size(min = 3, max = 20, message = "Name cannot be less than 3 or greater than 20 chars")
	private String ownerWife;

	
	@Null
	private Integer noOfWorkers;


	
	@Size(min = 3, max = 20, message = "email cannot be less than 3 or greater than 20 chars")
	private String email;


	@Size(min = 3, max = 20, message = "password cannot be less than 3 or greater than 20 chars")
	private String password;


	
	@NotBlank(message = "area should be selected")
	private String area;

}
