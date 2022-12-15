package com.xworkz.copy.examples.Repository;

import com.xworkz.copy.examples.dto.HelmetDTO;

public class HelmetRepositoryImpl implements HelmetRepository{

	private HelmetDTO[] dtos=new HelmetDTO[5];
	private int currentIndex=0;
	@Override
	public boolean save(HelmetDTO dto) {
	
		if(this.currentIndex>=this.dtos.length) {
			System.out.println("cannot save data");
			return false;
		}
		this.dtos[this.currentIndex]=dto;
		System.out.println("data saved"+dto+"in index"+this.currentIndex);
		this.currentIndex++;
		return true;
	}

	
}
