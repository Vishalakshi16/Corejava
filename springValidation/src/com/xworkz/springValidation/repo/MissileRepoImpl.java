package com.xworkz.springValidation.repo;

import org.springframework.stereotype.Component;

import com.xworkz.springValidation.dto.MissileDTO;

import lombok.NoArgsConstructor;
@Component
@NoArgsConstructor
public class MissileRepoImpl implements MissileRepo{

	@Override
	public boolean save(MissileDTO dto) {
		System.out.println("running save in repo ");
		System.out.println("dto"+dto);
		return true;
	}

}
