package com.xworkz.goa.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.goa.dto.BeachDTO;

@Component
@RequestMapping("/enjoy")

public class BeachController {
	public BeachController() {
		System.out.println("created"+getClass().getSimpleName());
	}
	
	@PostMapping
	public String onBeach(BeachDTO beachDTO,Model model) {
		System.out.println("running onBeach"+beachDTO);
		model.addAttribute("Name",beachDTO.getName());
		model.addAttribute("location",beachDTO.getLocation());
		
		
		return "BeachesSuccess.jsp";
		
	}

}
