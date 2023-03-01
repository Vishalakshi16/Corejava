package com.xworkz.goa.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.goa.dto.CasinoDTO;

@Component
@RequestMapping("/gambling")
public class CasinoController {
	public CasinoController() {
		System.out.println("created"+getClass().getSimpleName());
	}
	
	@PostMapping
	public String onCasio(CasinoDTO casinoDTO,Model model) {
		System.out.println("running onCasino"+casinoDTO);
		model.addAttribute("Name",casinoDTO.getName());
		model.addAttribute("Price",casinoDTO.getEntryFee());
		
		return "CasinoSuccess.jsp";
		
	}
}
