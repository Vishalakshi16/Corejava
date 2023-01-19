package com.xworkz.springValidation.repo;

import org.springframework.stereotype.Component;

import com.xworkz.springValidation.dto.ResortDTO;

import lombok.NoArgsConstructor;
@Component
@NoArgsConstructor
public class ResortRepoImpl implements ResortRepo{

	@Override
	public boolean save(ResortDTO dto) {
		System.out.println("Running save...");
		System.out.println("dto"+dto);
		return true;
		
	}

}
