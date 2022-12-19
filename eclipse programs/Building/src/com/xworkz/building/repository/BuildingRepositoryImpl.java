package com.xworkz.building.repository;

import com.xworkz.building.dto.BuildingDTO;
import com.xworkz.building.exception.StorageFullException;

public class BuildingRepositoryImpl implements BuildingRepository {

	private BuildingDTO[] dtos=new BuildingDTO[5];
	private int currentIndex=0;
	@Override
	public boolean save(BuildingDTO dto){

		if(this.currentIndex>=this.dtos.length) {
			System.out.println("cannot save data");
			throw new StorageFullException("Storage is full"+this.dtos.length);
		}
		this.dtos[this.currentIndex]=dto;
		System.out.println("data saved"+dto+"in index"+this.currentIndex);
		this.currentIndex++;
		
		return false;
	}
	
	
	
}
