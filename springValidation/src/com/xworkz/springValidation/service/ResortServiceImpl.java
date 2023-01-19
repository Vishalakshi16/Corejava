package com.xworkz.springValidation.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.springValidation.dto.MissileDTO;
import com.xworkz.springValidation.dto.ResortDTO;
import com.xworkz.springValidation.repo.MissileRepo;
import com.xworkz.springValidation.repo.ResortRepo;

@Component
public class ResortServiceImpl implements ResortService{

	@Autowired
	private Validator validator;
	private ResortRepo resortRepo;
	
	@Autowired
	public ResortServiceImpl(ResortRepo resortRepo) {
		this.resortRepo=resortRepo;
		System.out.println("created service bu passing repo....fromspring..");
		
	}
	
    @Override
	public boolean validateAndSave(ResortDTO dto) {
		System.out.println("running validate and save");
		System.out.println("Repodto"+dto);
		
		Set<ConstraintViolation<ResortDTO>> violations=this.validator.validate(dto);
		
		if(!violations.isEmpty()) {
			System.err.println("there are validation error");
			violations.forEach(cv->System.err.println(cv.getMessage()));
			return false;
			
		}
		else {
			System.out.println("data is valid+ can save");
			boolean saved=this.resortRepo.save(dto);
			System.out.println("save firstaid repo"+ saved);
			return saved;
		}
		
		
	}

	

}
