package com.xworkz.springValidation.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.springValidation.dto.FirstAidDTO;
import com.xworkz.springValidation.dto.MissileDTO;
import com.xworkz.springValidation.repo.FirstAidRepo;
import com.xworkz.springValidation.repo.MissileRepo;
@Component
public class MissileServiceImpl  implements MissileService{
	
	

	@Autowired
	private Validator validator;
	private MissileRepo missileRepo;
	
	@Autowired
	public MissileServiceImpl(MissileRepo missileRepo) {
		this.missileRepo=missileRepo;
		System.out.println("created service bu passing repo....fromspring..");
		
	}
	
    @Override
	public boolean validateAndSave(MissileDTO dto) {
		System.out.println("running validate and save");
		System.out.println("dto"+dto);
		
		Set<ConstraintViolation<MissileDTO>> violations=this.validator.validate(dto);
		
		if(!violations.isEmpty()) {
			System.err.println("there are validation error");
			violations.forEach(cv->System.err.println(cv.getMessage()));
			return false;
			
		}
		else {
			System.out.println("data is valid+ can save");
			boolean saved=this.missileRepo.save(dto);
			System.out.println("save firstaid repo"+ saved);
			return saved;
		}
		
		
	}








	

}
