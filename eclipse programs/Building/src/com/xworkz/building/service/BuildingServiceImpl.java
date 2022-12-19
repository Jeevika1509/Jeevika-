package com.xworkz.building.service;

import com.xworkz.building.dto.BuildingDTO;
import com.xworkz.building.exception.InvalidBuildingDataException;
import com.xworkz.building.repository.BuildingRepository;

public class BuildingServiceImpl implements BuildingService {

	private BuildingRepository buildingRepository;

	public BuildingServiceImpl(BuildingRepository buildingRepository) {
		super();
		this.buildingRepository = buildingRepository;
	}

	@Override
	public boolean validateAndSave(BuildingDTO dto) throws InvalidBuildingDataException {

		System.out.println("running validate and save"+dto);
		int no=dto.getNo();
		String name=dto.getName();
		int floors=dto.getFloors();
		String liftIn=dto.getLiftIn();
		String parkingIn=dto.getParkingIn();
		String type=dto.getType();
		
		boolean validNo=false;
		boolean validName=false;
		boolean validFloors=false;
		boolean validLiftIn=false;
		boolean validParkingIn=false;
		boolean validType=false;
		
		if(no>0) {
			System.out.println("valid number"+no);
			validNo=true;
		}
		else {
			System.err.println("invalid number"+no);
		}
		if(name!=null && name.length()>=3 && name.length()<=20) {
			System.out.println("valid building name"+name);
			validName=true;
		}
		else {
			System.err.println("invalid building name"+name);
		}
		if(floors>0) {
			System.out.println("valid number of floors"+floors);
			validFloors=true;
		}
		else {
			System.err.println("invalid number of floors"+floors);
		}
		if(liftIn!=null && liftIn.length()>=3 && liftIn.length()<=20) {
			System.out.println("valid liftIn"+liftIn);
			validLiftIn=true;
		}
		else {
			System.err.println("invalid liftIn"+liftIn);
		}
		
		if(parkingIn!=null && parkingIn.length()>=3 && parkingIn.length()<=20) {
			System.out.println("valid parkingIn"+parkingIn);
			validParkingIn=true;
		}
		else {
			System.err.println("invalid parkingIn"+parkingIn);
		}
		
		if(type!=null && type.length()>=3 && type.length()<=20) {
			System.out.println("valid building type"+type);
			validType=true;
		}
		else {
			System.err.println("invalid building type"+type);
		}
		if(validNo && validName && validFloors && validLiftIn && validParkingIn && validType) {
			System.out.println("building dto is valid"+dto);
			boolean saved=buildingRepository.save(dto);
			System.out.println("building dto is saved"+saved);
			return saved;
		}
		else {
			throw new InvalidBuildingDataException();
		}
		
	}
	
	
	
}
