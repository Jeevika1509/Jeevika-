package com.xworkz.terroristExample.service;

import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;


import com.xworkz.terroristExample.dto.TerroristDTO;

public class TerroristServiceImpl implements TerroristService{

	public  TerroristServiceImpl() {
		System.out.println("Created TerroristServiceImpl with no argument constructor");
	}
	@Override
	public boolean validateAndSave(TerroristDTO dto) {
		System.out.println("executing validateAndSave");
		System.out.println("dto passed:"+dto);
		
		ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
		Validator validator=factory.getValidator();
		Set<ConstraintViolation<TerroristDTO>> violations=validator.validate(dto);
		if(!violations.isEmpty()) {
			System.out.println("Error in data");
			violations.forEach(ele->System.out.println(ele.getMessage()));
			return false;
		}
		System.out.println("no errors");
		return true;
		
	}

}
