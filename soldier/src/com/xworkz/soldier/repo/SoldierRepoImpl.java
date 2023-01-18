package com.xworkz.soldier.repo;

import com.xworkz.soldier.dto.SoldierDTO;

public class SoldierRepoImpl implements SoldierRepo {
	
	public SoldierRepoImpl() {
		System.out.println("creating SoldierRepoImpl with no argument const...");
	}

	@Override
	public boolean save(SoldierDTO dto) {
		System.out.println("Running save");
		System.out.println("dto"+dto);
		return false;
	}

	
	

}
