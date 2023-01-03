package com.xworkz.examples.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.examples.DTO.CompanyCEODTO;
import com.xworkz.examples.DTO.DaughterDTO;

public class CompanyRunner {

	public static void main(String[] args) {

		Collection<CompanyCEODTO> collection=new ArrayList<CompanyCEODTO>();
		collection.add(new CompanyCEODTO("Sundar Pichai", "Google", 50, "American"," M.B.A", true,new DaughterDTO("Ramya", 9706854318l, 20, false, true)));
		collection.add(new CompanyCEODTO("Vijayakumar", "HCL", 55, "Indian","Electrical and electronics engineering", false,new DaughterDTO("Rakshitha",9187626345l,30, true, false)));
		collection.add(new CompanyCEODTO("Satya Nadella", "Microsoft", 38, "American", "Electrical Engineering", true,new DaughterDTO("Radhika", 9729773703l, 25, false, true)));
		collection.add(new CompanyCEODTO("Parag Agarwal", "Twitter", 38, "Indian-American", "P.H.D", true,new DaughterDTO("Priya", 9201092830l, 35, true, false)));
		
		collection.stream().map(dto->dto.getDaughterdto()).collect(Collectors.toList()).forEach(dto->System.out.println(dto));
		System.out.println(System.lineSeparator());
		collection.stream().map(dto->dto.getDaughterdto().getName()).collect(Collectors.toList()).forEach(dto->System.out.println(dto));
		System.out.println(System.lineSeparator());
		collection.stream().filter(dto->dto.getAge()>30).collect(Collectors.toSet()).forEach(dto->System.out.println(dto));
	}

}
