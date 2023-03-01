
package com.xworkz.fi.Dto;

import lombok.Data;

	@Data
	public class InterviewDto {
		
		private String name;
		private String company;
		private String role;
		
		public InterviewDto() {
			System.out.println("Created " + this.getClass().getSimpleName());
		}

}
