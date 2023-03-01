package com.xworkz.aeroplane.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.aeroplane.dto.AeroplaneDTO;
import com.xworkz.aeroplane.entity.AeroplaneEntity;
import com.xworkz.aeroplane.repo.AeroplaneRepository;
import com.xworkz.aeroplane.dto.AeroplaneDTO;

@Service
public class AeroplaneServiceImpl implements AeroplaneService{
	
	@Autowired
	private AeroplaneRepository aeroplaneRepository;
	
	public AeroplaneServiceImpl() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}
	
	@Override
	public Set<ConstraintViolation<AeroplaneDTO>> validateAndSave(AeroplaneDTO dto) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<AeroplaneDTO>> violations = validator.validate(dto);
		if(violations != null && !violations.isEmpty()) {
			System.err.println("violation in dto"+dto);
			return violations;
		}else {
			System.out.println("violation is not there in dto, can save");
			AeroplaneEntity entity = new AeroplaneEntity();
			entity.setCompany(dto.getCompany());
			entity.setCost(dto.getCost());
			entity.setCountry(dto.getCountry());
			entity.setName(dto.getName());
			entity.setType(dto.getType());
			
			boolean saved = this.aeroplaneRepository.save(entity);
			System.out.println("entity data is saved "+saved);
			return Collections.emptySet();
			
			
		}
		
	
	}
}

