package com.xworkz.bigBasket.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.bigBasket.dto.BigBasketDTO;
import com.xworkz.bigBasket.entity.BigBasketEntity;
import com.xworkz.bigBasket.repository.BigBasketRepo;




@Service
public class BigBasketServiceImpl implements BigBasketService{
	
	@Autowired
	private BigBasketRepo bigBasketRepo;
	
	public BigBasketServiceImpl() {
		System.out.println("created"+getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<BigBasketDTO>> validateAndSave(BigBasketDTO dto) {
		System.out.println("dto"+dto);
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<BigBasketDTO>> violations = validator.validate(dto);
		if(violations != null && !violations.isEmpty()) {
			System.err.println("violation in dto"+dto);
			return violations;
		}else {
			System.out.println("violation is not there in dto, can save");
			BigBasketEntity entity = new BigBasketEntity();
			entity.setItem(dto.getItem());
			entity.setBrand(dto.getBrand());
			entity.setArea(dto.getArea());
			entity.setEmail(dto.getEmail());
			
			entity.setNoOfWorkers(dto.getNoOfWorkers());
			entity.setOwner(dto.getOwner());
			entity.setOwnerWife(dto.getOwnerWife());
			entity.setPassword(dto.getPassword());
			entity.setPurchase(dto.getPurchase());
			entity.setSection(dto.getSection());
			
			
			boolean saved = this.bigBasketRepo.save(entity);
			System.out.println("entity data is saved "+saved);
			return Collections.emptySet();
		
			}
	

	}
	
	}
