package com.xworkz.vishala.service;

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.vishala.dto.RiverDTO;


public interface RiverService {

	Set<ConstraintViolation<RiverDTO>> validateAndSave(RiverDTO dto);
	
	default RiverDTO findById(int id)
	{
		return null;
		
	}
	
	default List<RiverDTO> findByName(String name){
		return null;
	}

}
