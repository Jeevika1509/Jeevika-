package com.xworkz.dtoExamples.repository;

import org.springframework.stereotype.Component;

import com.xworkz.dtoExamples.dto.FirstAidDTO;

@Component
public class FirstAidRepositoryImpl implements FirstAidRepository {

	@Override
	public boolean save(FirstAidDTO dto) {
		System.out.println("running save in repo");
		System.out.println("FirstAidDTO"+dto);
		return true;
	}
	

}
