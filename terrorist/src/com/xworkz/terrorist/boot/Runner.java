package com.xworkz.terrorist.boot;

import java.time.LocalDateTime;

import com.xworkz.terrorist.dto.TerroristDTO;
import com.xworkz.terrorist.service.TerroristService;
import com.xworkz.terrorist.service.TerroristServiceImpl;

public class Runner {
	public static void main(String[] args) {
		TerroristDTO dto=new TerroristDTO("manu",23,"india",true,false,"firing","xworkz");	
		System.out.println(dto);
		
		TerroristService service = new TerroristServiceImpl();
		service.validatingAndSaving(dto);
	}


}
