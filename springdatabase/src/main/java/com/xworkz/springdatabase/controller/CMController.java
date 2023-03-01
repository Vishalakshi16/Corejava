package com.xworkz.springdatabase.controller;

import java.util.Set;
import javax.validation.ConstraintViolation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.springdatabase.dto.CMDTO;
import com.xworkz.springdatabase.service.CMService;

@Controller
@RequestMapping("/cm")
public class CMController {
	
	@Autowired
	private CMService cmService ;
	public CMController() {
		System.out.println("created"+getClass().getSimpleName());
	}
	
	@PostMapping
	public String onCm(CMDTO cmdto,Model model) {
		System.out.println("running onCM"+cmdto);
		
   Set<ConstraintViolation<CMDTO>> constraintViolations=this.cmService.validateAndSave(cmdto);
  if(!constraintViolations.isEmpty()) {
	  System.err.println("validation failed ,display error message");
	  constraintViolations.forEach((cv)->System.err.print(cv.getMessage()));
  }
  else {
	  
	  System.out.print("validation success ,display success message");
	  
  }
		return "CM.jsp";
	}
	
	
	

}
