package com.xworkz.theater.repository;

import com.xworkz.theater.Exception.StorageFullException;
import com.xworkz.theater.dto.TheaterDTO;

public class TheaterRepositoryImpl implements TheaterRepository {
	
	private TheaterDTO[] dtos=new TheaterDTO[5];
	private int currentIndex=0;
	@Override
	public boolean save(TheaterDTO dto) {

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
