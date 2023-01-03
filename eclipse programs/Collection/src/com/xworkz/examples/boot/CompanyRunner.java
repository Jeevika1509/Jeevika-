package com.xworkz.examples.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.examples.DTO.CompanyCEODTO;

public class CompanyRunner {

	public static void main(String[] args) {

		Collection<CompanyCEODTO> collection=new ArrayList<CompanyCEODTO>();
		collection.add(new CompanyCEODTO("Sundar Pichai", "Google", 50, "American"," M.B.A", true));
		collection.add(new CompanyCEODTO("Vijayakumar", "HCL", 55, "Indian","Electrical and electronics engineering", false));
		collection.add(new CompanyCEODTO("Satya Nadella", "Microsoft", 38, "American", "Electrical Engineering", true));
		collection.add(new CompanyCEODTO("Parag Agarwal", "Twitter", 38, "Indian-American", "P.H.D", true));
		
		collection.stream().filter(dto->dto.getAge()>30).collect(Collectors.toSet()).forEach(dto->System.out.println(dto));
	}

}
