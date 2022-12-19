package com.xworkz.railwaystation.service;

import com.xworkz.railwaystation.dto.RailwayStationDTO;
import com.xworkz.railwaystation.exception.InvalidRailwayStationDataException;
import com.xworkz.railwaystation.repository.RailwayStationRepository;

public class RailwayStationServiceImpl implements RailwayStationService {

	private RailwayStationRepository railwayStationRepository;
	
	public RailwayStationServiceImpl(RailwayStationRepository railwayStationRepository) {
		super();
		this.railwayStationRepository = railwayStationRepository;
	}

	@Override
	public boolean validateAndSave(RailwayStationDTO dto) throws InvalidRailwayStationDataException {

		System.out.println("running validate and save"+dto);
		String name=dto.getName();
		int noOfPlatforms=dto.getNoOfPlatforms();
		String area=dto.getArea();
		int platformTicketPrice=dto.getPlatformTicketPrice();
		
		boolean validName=false;
		boolean validNoOfPlatforms=false;
		boolean validArea=false;
		boolean validPlatformTicketPrice=false;
		
		if(name!=null && name.length()>=3 && name.length()<=25) {
			System.out.println("valid railway station name"+name);
			validName=true;
		}
		else {
			System.err.println("invalid railway station name"+name);
		}
		
		if(noOfPlatforms>0) {
			System.out.println("valid number of platforms"+noOfPlatforms);
			validNoOfPlatforms=true;
		}
		else {
			System.err.println("invalid number of platforms"+noOfPlatforms);
		}
		
		if(area!=null && area.length()>=3 && area.length()<=20)
		{
			System.out.println("valid area"+area);
			validArea=true;
		}
		else {
			System.err.println("invalid area name"+area);
		}
		
		if(platformTicketPrice>0) {
			System.out.println("valid platform ticket price"+platformTicketPrice);
			validPlatformTicketPrice=true;
		}
		else {
			System.err.println("invalid platform ticket price"+platformTicketPrice);
		}
		
		if(validName && validNoOfPlatforms && validArea && validPlatformTicketPrice) {
			System.out.println("Railway Station DTO is valid"+dto);
			boolean saved=railwayStationRepository.save(dto);
			System.out.println("railway station dto is saved"+saved);
			return saved;
		}

		else {
				throw new InvalidRailwayStationDataException();
		}
	}
	

}
