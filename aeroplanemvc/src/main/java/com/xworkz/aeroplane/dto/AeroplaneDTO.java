package com.xworkz.aeroplane.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;


	@Data
	@NoArgsConstructor
	
	public class AeroplaneDTO {

		
		
		
		@NotBlank(message = "company should be selected")
		private String company;



		@Size(min = 3, max = 20, message = "name cannot be less than 3 or greater than 20 chars")
		private String name;

		
		
	
		private int cost;

		
		
		@Size(min = 3, max = 20, message = "type cannot be less than 3 or greater than 20 chars")
		private String type;

		
		
		@Size(min = 3, max = 20, message = "country cannot be less than 3 or greater than 20 chars")
		private String country;

		
		

	}



