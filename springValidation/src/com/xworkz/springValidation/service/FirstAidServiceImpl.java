package com.xworkz.springValidation.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.springValidation.dto.FirstAidDTO;
import com.xworkz.springValidation.repo.FirstAidRepo;
@Component
public class FirstAidServiceImpl implements FirstAidService{

	@Autowired
	private Validator validator;
	private FirstAidRepo firstAidRepo;
	
	@Autowired
	public FirstAidServiceImpl(FirstAidRepo firstAidRepo) {
		this.firstAidRepo=firstAidRepo;
		System.out.println("created service bu passing repo....fromspring..");
		
	}
	

	
	
	
	
	

	@Override
	public boolean validateAndSave(FirstAidDTO aidDTO) {
		System.out.println("running validate and save");
		System.out.println("aidDTO"+aidDTO);
		
		Set<ConstraintViolation<FirstAidDTO>> violations=this.validator.validate(aidDTO);
		
		if(!violations.isEmpty()) {
			System.err.println("there are validation error");
			violations.forEach(cv->System.err.println(cv.getMessage()));
			return false;
			
		}
		else {
			System.out.println("data is valid+ can save");
			boolean saved=this.firstAidRepo.save(aidDTO);
			System.out.println("save firstaid repo"+ saved);
			return saved;
		}
		
		
	}

}
