package com.xworkz.soldier.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.soldier.dto.SoldierDTO;
import com.xworkz.soldier.repo.SoldierRepo;

public class SoldierServiceImp implements SoldierService{
	private SoldierRepo soldierRepo;
	public SoldierServiceImp() {
		System.out.println("creating SoldierServiceImp with no args const....");
	}
	
	public void setSoldierRepo(SoldierRepo soldierRepo) {
		this.soldierRepo=soldierRepo ;
	}
	
	

	@Override
	public boolean validateAndSave(SoldierDTO dto) {
		System.out.println("starting validateAndSave method");
		System.out.println("dto"+ dto);
		
		ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
		Validator validator=factory.getValidator();
		Set<ConstraintViolation<SoldierDTO>> violation=validator.validate(dto);
		if(!violation.isEmpty()) {
			System.err.println("there are validation error");
			violation.forEach(v->{
			System.out.println("violation message "+v.getMessage());
			});
			return false;
		}
		else {
			System.out.println("data is validate");
			boolean saved=soldierRepo.save(dto);
					System.out.println("dto saved using repo"+saved);
			return saved;
		}
		
		


		//return false;
	}

	

}
