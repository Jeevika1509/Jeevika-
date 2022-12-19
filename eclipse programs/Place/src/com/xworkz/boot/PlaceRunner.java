package com.xworkz.boot;

import com.xworkz.place.dto.PlaceDTO;
import com.xworkz.place.exception.InvalidPlaceDataException;
import com.xworkz.place.repository.PlaceRepository;
import com.xworkz.place.repository.PlaceRepositoryImpl;
import com.xworkz.place.service.PlaceService;
import com.xworkz.place.service.PlaceServiceImpl;

public class PlaceRunner {

	public static void main(String[] args) {

		PlaceDTO dto=new PlaceDTO("RR Nagar","Bangalore",560098,"Karnataka","India");
		PlaceRepository repository=new PlaceRepositoryImpl();
		PlaceService service=new PlaceServiceImpl(repository);
		try {
			System.out.println("before calling validate and save");
			service.validateAndSave(dto);
			System.out.println("after calling validate and save");
		}
		catch(InvalidPlaceDataException e){
			e.printStackTrace();
		}
		System.out.println("after catch block");
	}

}
