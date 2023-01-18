package com.xworkz.soldier.boot;

import com.xworkz.soldier.dto.SoldierDTO;
import com.xworkz.soldier.repo.SoldierRepo;
import com.xworkz.soldier.repo.SoldierRepoImpl;
import com.xworkz.soldier.service.SoldierServiceImp;

public class SoldierRunner {
	
	public static void main(String[] args) {
		SoldierDTO dto=new SoldierDTO("akshara",1,"topper","xworkz","bashyamcircle");
		
		SoldierServiceImp service=new SoldierServiceImp();
		SoldierRepo repo=new SoldierRepoImpl();
		service.setSoldierRepo(repo);
		service.validateAndSave(dto);
	}

}
