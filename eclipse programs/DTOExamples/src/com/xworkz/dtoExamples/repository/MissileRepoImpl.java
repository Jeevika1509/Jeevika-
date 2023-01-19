package com.xworkz.dtoExamples.repository;

import org.springframework.stereotype.Component;

import com.xworkz.dtoExamples.dto.MissileDTO;

@Component
public class MissileRepoImpl implements MissileRepository {

	@Override
	public boolean save(MissileDTO dto) {
		
		System.out.println("running save in repo");
		System.out.println("Missile Repo"+dto);
		
		return true;
	}

}
