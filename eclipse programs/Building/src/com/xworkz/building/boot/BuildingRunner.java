package com.xworkz.building.boot;

import com.xworkz.building.dto.BuildingDTO;
import com.xworkz.building.exception.InvalidBuildingDataException;
import com.xworkz.building.repository.BuildingRepository;
import com.xworkz.building.repository.BuildingRepositoryImpl;
import com.xworkz.building.service.BuildingService;
import com.xworkz.building.service.BuildingServiceImpl;

public class BuildingRunner {

	public static void main(String[] args) {

		BuildingDTO dto=new BuildingDTO(1,"chitrita",5,"first floor","ground floor","residential");
		BuildingRepository repository=new BuildingRepositoryImpl();
		BuildingService service=new BuildingServiceImpl(repository);
		try {
			System.out.println("before calling validate and save");
			service.validateAndSave(dto);
			System.out.println("after calling validate and save");
		}
		catch(InvalidBuildingDataException e) {
			e.printStackTrace();
		}
		System.out.println("after catch block");
	}

}
