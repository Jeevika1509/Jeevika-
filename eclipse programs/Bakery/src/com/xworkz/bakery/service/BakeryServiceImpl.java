package com.xworkz.bakery.service;

import com.xworkz.bakery.dto.BakeryDTO;
import com.xworkz.bakery.exception.InvalidBakeryDataException;
import com.xworkz.bakery.repository.BakeryRepository;

public class BakeryServiceImpl implements BakeryService {

	private BakeryRepository bakeryRepository;

	public BakeryServiceImpl(BakeryRepository bakeryRepository) {
		super();
		this.bakeryRepository = bakeryRepository;
	}

	@Override
	public boolean validateAndSave(BakeryDTO dto) throws InvalidBakeryDataException {

		System.out.println("running validate and save"+dto);
		String name=dto.getName();
		String owner=dto.getOwner();
		long contact=dto.getContact();
		String location=dto.getLocation();
		String famousFor=dto.getFamousFor();
		
		boolean validName=false;
		boolean validOwner=false;
		boolean validContact=false;
		boolean validLocation=false;
		boolean validFamousFor=false;
		
		if(name!=null && name.length()>=3 && name.length()<=25) {
			System.out.println("valid bakery name"+name);
			validName=true;
		}
		else {
			System.err.println("invalid bakery name"+name);
		}
		if(owner!=null && owner.length()>=3 && owner.length()<=25) {
			System.out.println("valid owner name"+owner);
			validOwner=true;
		}
		else {
			System.err.println("invalid owner name"+owner);
		}
		if(contact>0) {
			System.out.println("valid contact no"+contact);
			validContact=true;
		}
		else {
			System.err.println("invalid contact no"+contact);
		}
		if(location!=null && location.length()>=3 && location.length()<=25) {
			System.out.println("valid location"+location);
			validLocation=true;
		}
		else {
			System.err.println("invalid location name"+location);
		}
		if(famousFor!=null && famousFor.length()>=3 && famousFor.length()<=25) {
			System.out.println("valid famousFor"+famousFor);
			validFamousFor=true;
		}
		else {
			System.err.println("invalid famousFor"+famousFor);
		}
		if(validName && validOwner && validContact && validLocation && validFamousFor) {
			System.out.println("bakery dto is valid"+dto);
			boolean saved=bakeryRepository.save(dto);
			System.out.println("bakery dto is saved"+saved);
			return saved;
		}
		else {
			throw new InvalidBakeryDataException();
		}
		
		
	}
	
	
}
