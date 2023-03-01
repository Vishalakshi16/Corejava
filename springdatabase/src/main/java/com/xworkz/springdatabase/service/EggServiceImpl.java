package com.xworkz.springdatabase.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.springdatabase.dto.EggDTO;
import com.xworkz.springdatabase.repository.EggRepo;


@Service
public class EggServiceImpl implements EggService{

	@Autowired
	private EggRepo eggRepo;
	
	public EggServiceImpl() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}
	
	@Override
	public boolean validateAndSave(EggDTO dto) {
		System.out.println("running validate and save in EggService");
		boolean saved = this.eggRepo.save(dto);
		System.out.println("saved in service"+saved);
		return false;
		
	}
}