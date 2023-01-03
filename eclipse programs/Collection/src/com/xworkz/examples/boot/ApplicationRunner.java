package com.xworkz.examples.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.examples.DTO.ApplicationDTO;

public class ApplicationRunner {

	public static void main(String[] args) {

		Collection<ApplicationDTO> collection=new ArrayList<ApplicationDTO>();
		collection.add(new ApplicationDTO("Microsoft Office",365, true, "Microsoft", 0));
		collection.add(new ApplicationDTO("OneDrive", 11, false, "Microsoft", 5000));
		collection.add(new ApplicationDTO("Telegram", 0, true, "Pavel Durov", 0));
		collection.add(new ApplicationDTO("Google pay", 0, true, "Google", 100));
		
		collection.stream().filter(dto->dto.isFree() && dto.getDevelopedBy()=="Google").collect(Collectors.toSet()).forEach(dto->System.out.println(dto));
		collection.stream().filter(dto->dto.getVersion()>5).map(dto->dto.getName()).collect(Collectors.toSet()).forEach(name->System.out.println(name));
	}

}
