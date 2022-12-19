package com.xworkz.railwaystation.boot;

import com.xworkz.railwaystation.dto.RailwayStationDTO;
import com.xworkz.railwaystation.exception.InvalidRailwayStationDataException;
import com.xworkz.railwaystation.repository.RailwayStationRepository;
import com.xworkz.railwaystation.repository.RailwayStationRepositoryImpl;
import com.xworkz.railwaystation.service.RailwayStationService;
import com.xworkz.railwaystation.service.RailwayStationServiceImpl;

public class RailwayStationRunner {

	public static void main(String[] args) {

		RailwayStationDTO dto=new RailwayStationDTO("YeshwanthpurJunction",6,"yeshwanthpur",50);
		RailwayStationRepository repository=new RailwayStationRepositoryImpl();
		RailwayStationService service=new RailwayStationServiceImpl(repository);
		try {
			System.out.println("before calling validate and save");
			service.validateAndSave(dto);
			System.out.println("after calling validate and save");
		}
		catch(InvalidRailwayStationDataException e){
			e.printStackTrace();
		}
		System.out.println("after catch block");
	}

}
