package com.xworkz.vishala.controller;

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
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.vishala.dto.RiverDTO;
import com.xworkz.vishala.service.RiverService;

@Controller
@RequestMapping("/")
public class RiverController {

	@Autowired
	private RiverService riverService;

	private List<String> location = Arrays.asList("Bagalkot", "Bijapur", "Hebbal", "Hubli", "Darwad", "Bengaloor");
	private List<Integer> noOfSubRivers = Arrays.asList(4, 8, 9, 10, 11);

	public RiverController() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@GetMapping("/river")
	public String onRiver(Model model) {
		System.out.println("running onRiver Get method");
		model.addAttribute("location", location);
		model.addAttribute("noOfSubRivers", noOfSubRivers);
		return "River";
	}

	@PostMapping("/river")
	public String onRiver(Model model, RiverDTO dto) {
		System.out.println("running onRiver Post method" + dto);

		Set<ConstraintViolation<RiverDTO>> violations = riverService.validateAndSave(dto);
		if (violations.isEmpty()) {
			System.out.println("no violation in controller go to success page");
			return "RiverSuccess";
		}
		model.addAttribute("location", location);
		model.addAttribute("noOfSubRivers", noOfSubRivers);
		model.addAttribute("errors", violations);
		model.addAttribute("dto", dto);
		System.out.println("violations in controller");
		return "River";
	}

	@GetMapping("/find")
	public String onSearch(@RequestParam int id, Model model) {
		System.out.println("running onSearch Get method" + id);
		RiverDTO dto = this.riverService.findById(id);
		if (dto != null) {
			model.addAttribute("dto", dto);

		} else {
			model.addAttribute("message", "Data not found");
		}
		return "RiverSearch";
	}
	
	@GetMapping("/searchbyname")
	private String onSearchCompany(@RequestParam String name,Model model) {
      System.out.println("running onSearchCompany controller  "+name);
      List<RiverDTO> list=this.riverService.findByName(name);
      model.addAttribute("list", list);
      return "NameSearch";
	}
	
}
