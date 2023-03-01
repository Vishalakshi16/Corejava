package com.xworkz.spring.repository;


import org.springframework.stereotype.Repository;

import com.xworkz.spring.dto.BakeryDTO;
@Repository
public class BakeryRepoImpl implements BakeryRepository{
	
	public BakeryRepoImpl() {
		System.out.println("created"+this.getClass().getSimpleName());
	}

	@Override
	public boolean save(BakeryDTO bakeryDTO) {
		System.out.println("Running save method in BakeryRepoImpl");
		return false;
	}

}
