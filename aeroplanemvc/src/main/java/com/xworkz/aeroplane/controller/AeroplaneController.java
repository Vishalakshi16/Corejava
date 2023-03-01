package com.xworkz.aeroplane.controller;


	
	import java.util.Arrays;
	import java.util.List;
	import java.util.Set;

	import javax.validation.ConstraintViolation;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.aeroplane.dto.AeroplaneDTO;
import com.xworkz.aeroplane.service.AeroplaneService;

	

	@Controller
	@RequestMapping("/")
	public class AeroplaneController {
	
		@Autowired
		private AeroplaneService aeroplaneService;

		private List<String> type = Arrays.asList("core", "IT", "Non IT", "non Technical");

		public AeroplaneController() {
			System.out.println("Created " + this.getClass().getSimpleName());
		}

		


			
			@GetMapping("/air")
			public String onAeroplane(Model model) {
				System.out.println("running onAeroplane Get method");
				model.addAttribute("type", type);

				return "Aeroplane";
			}
			
			@PostMapping("/air")
			public String onAeroplane(Model model, AeroplaneDTO dto) {
				System.out.println("running onAeroplane Post method"+dto);
				
				Set<ConstraintViolation<AeroplaneDTO>> violations = aeroplaneService.validateAndSave(dto);
				if(violations.isEmpty()) {
					System.out.println("no violation in controller go to success page");
					model.addAttribute("dto", dto);
					return "AeroplaneSuccess";
				}
				model.addAttribute("type",type);
				
				model.addAttribute("errors",violations);
				model.addAttribute("dto",dto);
				System.out.println("violations in controller");
				return "Aeroplane";
			} 
		}


