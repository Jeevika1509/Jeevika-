package com.xworkz.bakery.repository;

import com.xworkz.bakery.dto.BakeryDTO;
import com.xworkz.bakery.exception.StorageFullException;


public class BakeryRepositoryImpl implements BakeryRepository {

	private BakeryDTO[] dtos=new BakeryDTO[5];
	private int currentIndex=0;
	@Override
	public boolean save(BakeryDTO dto) {

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
