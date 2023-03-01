package com.xworkz.bigBasket.controller;

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

import com.xworkz.bigBasket.dto.BigBasketDTO;
import com.xworkz.bigBasket.service.BigBasketService;

@Controller
@RequestMapping("/big")
public class BigBasketController {
	
	


		@Autowired
		private BigBasketService bigBasketService;

		private List<String> items = Arrays.asList("chocalate", "snacks", "cosmatics", "detersent","vegetable");
		private List<String> areas = Arrays.asList("rajajinagar", "BTM", "Kuvempu", "gayitri","kalyanagar");

		public BigBasketController() {
			System.out.println("Created " + this.getClass().getSimpleName());
		}

		@GetMapping
		public String onValentine(Model model) {
			System.out.println("running onValentine Get method");
			model.addAttribute("items", items);
			model.addAttribute("areas", areas);
			return "Bigbasket";
		}
		
		@PostMapping
		public String onValentine(Model model, BigBasketDTO dto) {
			System.out.println("running onValentine Post method"+dto);
			
			Set<ConstraintViolation<BigBasketDTO>> violations = bigBasketService.validateAndSave(dto);
			if(violations.isEmpty()) {
				System.out.println("no violation in controller go to success page");
				model.addAttribute("dto", dto);
				return "Success";
			}
			model.addAttribute("items",items);
			model.addAttribute("areas",areas);
			model.addAttribute("errors",violations);
			model.addAttribute("dto",dto);
			System.out.println("violations in controller");
			return "Bigbasket";
		} 
	}


