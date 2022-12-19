package com.xworkz.theater.service;


import com.xworkz.theater.Exception.InvalidTheaterDataException;
import com.xworkz.theater.dto.TheaterDTO;
import com.xworkz.theater.repository.TheaterRepository;

public class TheaterServiceImpl implements TheaterService{

	private TheaterRepository theaterRepository;
	
	public TheaterServiceImpl(TheaterRepository theaterRepository) {
		super();
		this.theaterRepository = theaterRepository;
	}

	@Override
	public boolean validateAndSave(TheaterDTO dto) throws InvalidTheaterDataException {
		
		System.out.println("running validateAndSave"+dto);
		int id=dto.getId();
		String name=dto.getName();
		String brand=dto.getBrand();
		int seats=dto.getSeats();
		
		boolean validId=false;
		boolean validName=false;
		boolean validBrand=false;
		boolean validSeats=false;
		
		if(id>0) {
			System.out.println("valid theater id"+id);
			validId=true;
		}
		else {
			System.err.println("invalid theater id"+id);
		}
		if(name!=null && name.length()>=3 && name.length()<=20) {
			System.out.println("valid theater name"+name);
			validName=true;
		}
		else {
			System.err.println("invalid theater name"+name);
		}
		
		if(brand!=null && brand.length()>=3 && brand.length()<=20) {
			System.out.println("valid theater brand"+brand);
			validBrand=true;
		}
		else {
			System.err.println("invalid theater brand"+brand);
		}
		if(seats>0) {
			System.out.println("valid number of seats"+seats);
			validSeats=true;
		}
		else {
		System.err.println("invalid number of seats"+name);
		}
		if(validId && validName && validBrand && validSeats)
		{
			System.out.println("Theater DTO is valid"+dto);
			boolean saved=theaterRepository.save(dto);
			System.out.println("theater dto is saved"+saved);
			return saved;
		}
		else {
			throw new InvalidTheaterDataException();
		}
		
	}

	
}
