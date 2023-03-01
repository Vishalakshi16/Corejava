package com.xworkz.springdatabase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.springdatabase.dto.EggDTO;
import com.xworkz.springdatabase.service.EggService;

@Controller
@RequestMapping("/egg")
public class EggController {
	
	@Autowired
	public EggService eggService;
	
	public EggController() {
		System.out.println("created"+this.getClass().getSimpleName());
	}
	
	
	@PostMapping
	public String onOrder(EggDTO dto,Model model) {
		System.out.println("Running onOrder in EggController");
		boolean saved=this.eggService.validateAndSave(dto);
		System.out.println("saved"+saved);
		System.out.println(dto);
		return "index.jsp";
	}

}
