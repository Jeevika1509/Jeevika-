package com.xworkz.soldier.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.soldier.dto.SoldierDTO;
import com.xworkz.soldier.repository.SoldierRepository;


public class SoldierServiceImpl implements SoldierService{

	private SoldierRepository soldierRepository;
	
	public void setSoldierRepository(SoldierRepository soldierRepository) {
		this.soldierRepository = soldierRepository;
	}

	public SoldierServiceImpl() {
		System.out.println("created soldier service impl using no arg constructor");
	}

	@Override
	public boolean validateAndSave(SoldierDTO dto) {

		System.out.println("starting validate and save");
		System.out.println("dto passed"+dto);
		ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
		Validator validator=factory.getValidator();
		Set<ConstraintViolation<SoldierDTO>> violations=validator.validate(dto);
		if(!violations.isEmpty()) {
			System.out.println("Error in data");
			violations.forEach(ele->System.out.println(ele.getMessage()));
			return false;
		}
		else {
		System.out.println("no errors,data is valid");
		boolean saved=soldierRepository.save(dto);
		System.out.println("dto saved using repo"+saved);
		return saved;
	}
	}
}
