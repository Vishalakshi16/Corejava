package com.xworkz.vishala.repository;

import java.util.Collections;
import java.util.List;

import com.xworkz.vishala.entity.RiverEntity;

public interface RiverRepository {

	boolean save(RiverEntity entity);
	
	default RiverEntity findBy(int id)
	{
		return null;
		
	}
	
	default List<RiverEntity> findByName(String name){
		return Collections.emptyList();
	}
}
