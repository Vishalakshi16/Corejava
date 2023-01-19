package com.xworkz.springValidation.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springValidation.dto.FirstAidDTO;
import com.xworkz.springValidation.dto.MissileDTO;
import com.xworkz.springValidation.dto.ResortDTO;
import com.xworkz.springValidation.service.FirstAidService;
import com.xworkz.springValidation.service.MissileService;
import com.xworkz.springValidation.service.ResortService;
import com.xworkz.springValidation.springConfiguration.SpringConfiguration;

public class Runner {
	
	public static void main(String[] args) {
		
		ApplicationContext container=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		System.out.println("*************8FirstAid Runner***********8");
		FirstAidService service=container.getBean(FirstAidService.class);
		boolean saved=service.validateAndSave(new FirstAidDTO());
		System.out.println("saved"+saved);
		
		
		System.out.println("**************8missile Runner*************");
		MissileService service1=container.getBean(MissileService.class);
		boolean saved1=service1.validateAndSave(new MissileDTO());
		System.out.println("saved"+saved1);
		
		
		System.out.println("***************Resort Runner***************");
		ResortService service2=container.getBean(ResortService.class);
		boolean saved2=service2.validateAndSave(new ResortDTO());
		System.out.println("saved"+saved2);
	}
	
	

}
