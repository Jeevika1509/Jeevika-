package com.xworkz.dtoExamples.repository;

import org.springframework.stereotype.Component;

import com.xworkz.dtoExamples.dto.ResortDTO;

@Component
public class ResortRepositoryImpl implements ResortRepository{

	@Override
	public boolean save(ResortDTO dto) {

		System.out.println("running save in repo");
		System.out.println("Resort DTO"+dto);
		return true;
	}
	

}
