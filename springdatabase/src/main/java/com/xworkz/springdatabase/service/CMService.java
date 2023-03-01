package com.xworkz.springdatabase.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.springdatabase.dto.CMDTO;

public interface CMService {

	Set<ConstraintViolation<CMDTO>> validateAndSave(CMDTO cmdto);
}
