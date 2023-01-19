package com.xworkz.springValidation.repo;

import org.springframework.stereotype.Component;

import com.xworkz.springValidation.dto.FirstAidDTO;

import lombok.NoArgsConstructor;
@Component
@NoArgsConstructor
public class FirstAidRepoImpl implements FirstAidRepo{

	@Override
	public boolean save(FirstAidDTO aidDTO) {
		
		System.out.println("running save in repo");
		System.out.println("aidDto"+aidDTO);
				return true;
	}
	
	

}
