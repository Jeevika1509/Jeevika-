package com.xworkz.place.service;

import com.xworkz.place.dto.PlaceDTO;
import com.xworkz.place.exception.InvalidPlaceDataException;
import com.xworkz.place.repository.PlaceRepository;

public class PlaceServiceImpl implements PlaceService{

	private PlaceRepository placeRepository;

	public PlaceServiceImpl(PlaceRepository placeRepository) {
		super();
		this.placeRepository = placeRepository;
	}

	@Override
	public boolean validateAndSave(PlaceDTO dto) throws InvalidPlaceDataException {

		System.out.println("running validate and save"+dto);
		String name=dto.getName();
		String city=dto.getCity();
		int pincode=dto.getPincode();
		String state=dto.getState();
		String country=dto.getCountry();
		
		boolean validName=false;
		boolean validCity=false;
		boolean validPincode=false;
		boolean validState=false;
		boolean validCountry=false;
		
		if(name!=null && name.length()>=3 && name.length()<=20) {
			System.out.println("valid place name"+name);
			validName=true;
		}
		else {
			System.err.println("invalid place name"+name);
		}
		
		if(city!=null && city.length()>=3 && city.length()<=20) {
			System.out.println("valid city name"+city);
			validCity=true;
		}
		else {
			System.err.println("invalid city name"+city);
		}
		
		if(pincode>0) {
			System.out.println("valid pincode"+pincode);
			validPincode=true;
		}
		else {
			System.err.println("invalid pincode"+pincode);
		}
		
		if(state!=null && state.length()>=3 && state.length()<=20) {
			System.out.println("valid state name"+state);
			validState=true;
		}
		else {
			System.err.println("invalid state name"+state);
		}
		
		if(country!=null && country.length()>=3 && country.length()<=20) {
			System.out.println("valid country name"+country);
			validCountry=true;
		}
		else {
			System.err.println("invalid country name"+country);
		}
	    if(validName && validCity && validPincode && validState && validCountry) {
	    	System.out.println("place dto is valid"+dto);
	    	boolean saved=placeRepository.save(dto);
	    	System.out.println("place dto is saved"+saved);
	    	return saved;
	    }
	    else {
	    	throw new InvalidPlaceDataException();
	    }
		
		
	}
	
	
}
