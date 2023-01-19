package com.xworkz.dtoExamples.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.dtoExamples.dto.FirstAidDTO;
import com.xworkz.dtoExamples.repository.FirstAidRepository;

@Component
public class FirstAidServiceImpl implements FirstAidService{

	@Autowired
	private FirstAidRepository firstAidRepository;
	private Validator validator;
	
	@Autowired
	public void setValidator(Validator validator) {
		this.validator = validator;
	}


	@Override
	public boolean validateAndSave(FirstAidDTO dto) {

		System.out.println("running validate and save");
		System.out.println("FirstAidDTO"+dto);
		
		Set<ConstraintViolation<FirstAidDTO>> violations=validator.validate(dto);
		if(!violations.isEmpty()) {
			System.out.println("Error in data");
			violations.forEach(ele->System.out.println(ele.getMessage()));
			return false;
		}
		else {
		System.out.println("no errors,data is valid");
		boolean saved=firstAidRepository.save(dto);
		System.out.println("dto saved using repo"+saved);
		return saved;
		

	}
	}

}
