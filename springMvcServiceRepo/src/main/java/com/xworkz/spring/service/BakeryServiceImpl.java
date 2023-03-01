package com.xworkz.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.xworkz.spring.dto.BakeryDTO;
import com.xworkz.spring.repository.BakeryRepository;
@Service
public class BakeryServiceImpl implements BakeryService{
	@Autowired
	private BakeryRepository bakeryRepository;
	
	public BakeryServiceImpl() {
		System.out.println("created"+this.getClass().getSimpleName());
	}

	@Override
	public boolean validateAndSave(BakeryDTO dto) {
		System.out.println("Running validateAndSave in BakeryServiceRepo"+dto);
		boolean saved=this.bakeryRepository.save(dto);
		System.out.println("save in repo"+saved);
		return true;
	}

}
