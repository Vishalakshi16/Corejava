package com.xworkz.springdatabase.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import org.springframework.stereotype.Service;
import com.xworkz.springdatabase.dto.CMDTO;

@Service
public class CMServiceImpl implements CMService{
	
	
	public CMServiceImpl() {
		System.out.println("created"+this.getClass().getSimpleName());
	}
	
	@Override
	public Set<ConstraintViolation<CMDTO>> validateAndSave(CMDTO dto){
		System.out.println("Running validateAndSave");
		
		ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
		Validator validator =factory.getValidator();
		Set<ConstraintViolation<CMDTO>> constraintViolations=validator.validate(dto);
		if(constraintViolations!=null && !constraintViolations.isEmpty()) {
			System.err.println("constraintViolations is does not exist ,data is good");	
			return constraintViolations;
		}
		else {
			System.err.println("constraintViolations is exist ,data is good");
			return Collections.emptySet();

		}
		
	}


}
