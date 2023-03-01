package com.xworkz.fi.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.fi.Dto.InterviewDto;

	@Component
	@RequestMapping("/attend")
	public class InterviewComponent {

		public InterviewComponent() {
			System.out.println("Created " + this.getClass().getSimpleName());
		}
		
		@PostMapping
		public String toAttend(InterviewDto dto) {
			System.out.println("running toAttend...");
			System.out.println("Dto " + dto);
			return "interview.jsp";
		}
	}



