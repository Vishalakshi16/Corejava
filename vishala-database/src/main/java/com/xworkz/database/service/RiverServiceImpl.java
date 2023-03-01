package com.xworkz.database.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.database.dto.RiverDTO;
import com.xworkz.database.entity.RiverEntity;
import com.xworkz.database.repository.RiverRepository;

@Service
public class RiverServiceImpl implements RiverService {

	@Autowired
	private RiverRepository riverRepository;

	public RiverServiceImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<RiverDTO>> validateAndSave(RiverDTO dto) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<RiverDTO>> violations = validator.validate(dto);
		if (violations != null && !violations.isEmpty()) {
			System.err.println("violation in dto" + dto);
			return violations;
		} else {
			System.out.println("violation is not there in dto, can save");
			RiverEntity entity = new RiverEntity();
			entity.setName(dto.getName());
			entity.setBirthplace(dto.getBirthplace());
			entity.setLocation(dto.getLocation());
			entity.setNoOfSubRivers(dto.getNoOfSubRivers());

			boolean saved = this.riverRepository.save(entity);
			System.out.println("entity data is saved " + saved);
			return Collections.emptySet();
		}

	}

	@Override
	public RiverDTO findById(int id) {
		// TODO Auto-generated method stub
		if (id > 0) {
			RiverEntity entity = this.riverRepository.findBy(id);
			if (entity != null) {
				System.out.println("Entity of aeroplane founded by id:" + id);
				RiverDTO dto = new RiverDTO();
				dto.setBirthplace(entity.getBirthplace());
				dto.setLocation(entity.getLocation());
				dto.setName(entity.getName());
				// dto.setId(entity.getId());
				dto.setNoOfSubRivers(entity.getNoOfSubRivers());
				return dto;
			}
		}
		return RiverService.super.findById(id);
	}

	@Override
	public List<RiverDTO> findByName(String name) {
		System.out.println(" running findByName in service " + name);
		if (name != null && !name.isEmpty()) {
			System.out.println("Name is valid ....calling repo");
			List<RiverEntity> entities = this.riverRepository.findByName(name);
			List<RiverDTO> listOfDto = new ArrayList<RiverDTO>();
			for (RiverEntity entity : entities) {
				RiverDTO dto = new RiverDTO();
				dto.setBirthplace(entity.getBirthplace());
				dto.setId(entity.getId());
				dto.setLocation(entity.getLocation());
				dto.setName(entity.getName());
				dto.setNoOfSubRivers(entity.getNoOfSubRivers());
				listOfDto.add(dto);

			}
			System.out.println("size of dtos" + listOfDto.size());
			System.out.println("size of dtos" + entities.size());

			return listOfDto;
		} else {

			System.out.println("name is invalide");

		}
		return RiverService.super.findByName(name);
	}

}
