package com.xworkz.railwaystation.repository;

import com.xworkz.railwaystation.dto.RailwayStationDTO;
import com.xworkz.railwaystation.exception.StorageFullException;

public class RailwayStationRepositoryImpl implements RailwayStationRepository{

	private RailwayStationDTO[] dtos=new RailwayStationDTO[5];
	private int currentIndex=0;
	@Override
	public boolean save(RailwayStationDTO dto) {

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
