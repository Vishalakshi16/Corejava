package com.xworkz.soldier.dto;



import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor

public class SoldierDTO extends AbstractAuditDTO{
	
	@NotNull
	@NotBlank
	@Size(min=3,max=20,message="name should be greater than 3 less than 20")
	private String name;
	
	@Min(0)
	@Max(10000)
	private int id;
	
	@NotNull//only for String
	@NotBlank//all non primitive types
	@Size(min=3,max=20,message="rank should be greater than 3 less than 20")
	private String rank;
	
	@NotNull
	@NotBlank
	@Size(min=3,max=20,message="batallion should be greater than 3 less than 20")
	private String batallion;
	
	@NotNull
	@NotBlank
	@Size(min=3,max=20,message="country should be greater than 3 less than 20")
	private String country;
	
	

}
