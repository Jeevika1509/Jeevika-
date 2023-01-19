package com.xworkz.dtoExamples.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.dtoExamples.dto.ResortDTO;
import com.xworkz.dtoExamples.repository.ResortRepository;

@Component
public class ResortServiceImpl implements ResortService {

	@Autowired
	private ResortRepository resortRepository;
	private Validator validator;
	
	@Autowired
	public void setValidator(Validator validator) {
		this.validator = validator;
	}
	@Override
	public boolean validateAndSave(ResortDTO dto) {
		
		System.out.println("running validate and save");
		System.out.println("Resort DTO"+dto);
		
		Set<ConstraintViolation<ResortDTO>> violations=validator.validate(dto);
		if(!violations.isEmpty()) {
			System.out.println("Error in data");
			violations.forEach(ele->System.out.println(ele.getMessage()));
			return false;
		}
		else {
		System.out.println("no errors,data is valid");
		boolean saved=resortRepository.save(dto);
		System.out.println("dto saved using repo"+saved);
		return saved;
	}
	}

}
