package com.xworkz.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.spring.dto.BakeryDTO;
import com.xworkz.spring.service.BakeryService;
@Controller
@RequestMapping("/sweet")
public class BakeryController {
	
	@Autowired
	private BakeryService bakeryService;
	
	public BakeryController() {
System.out.println("created"+this.getClass().getSimpleName());	}
	
	@PostMapping
	public String onBakery(BakeryDTO bakeryDTO,Model model) {
		System.out.println("running onCasino"+bakeryDTO);
		model.addAttribute("Name",bakeryDTO.getName());
		model.addAttribute("getOwnerName",bakeryDTO.getOwnerName());
		model.addAttribute("getOwnerWifeName",bakeryDTO.getOwnerWifeName());
		model.addAttribute("getMarried",bakeryDTO.isOwnerMarried());
		model.addAttribute("getFamous",bakeryDTO.getFamous());
		model.addAttribute("getSince",bakeryDTO.getSince());
		
		
		
		boolean saved = this.bakeryService.validateAndSave(bakeryDTO);
		System.out.println("saved "+saved);
		
		return "BakerySuccess.jsp";
		
	}



}
