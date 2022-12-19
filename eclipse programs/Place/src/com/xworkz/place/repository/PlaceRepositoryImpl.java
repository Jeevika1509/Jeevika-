package com.xworkz.place.repository;

import com.xworkz.place.dto.PlaceDTO;
import com.xworkz.place.exception.StorageFullException;

public class PlaceRepositoryImpl implements PlaceRepository {

	private PlaceDTO[] dtos=new PlaceDTO[5];
	private int currentIndex=0;
	@Override
	public boolean save(PlaceDTO dto) {

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
