package com.xworkz.theater.boot;

import com.xworkz.theater.Exception.InvalidTheaterDataException;
import com.xworkz.theater.dto.TheaterDTO;
import com.xworkz.theater.repository.TheaterRepository;
import com.xworkz.theater.repository.TheaterRepositoryImpl;
import com.xworkz.theater.service.TheaterService;
import com.xworkz.theater.service.TheaterServiceImpl;

public class TheaterRunner {

	public static void main(String[] args) {

		TheaterDTO dto=new TheaterDTO(1, "Gopalan Cinemas", "Gopal", 100);
		TheaterRepository repository=new TheaterRepositoryImpl();
		TheaterService service=new TheaterServiceImpl(repository);
		try {
			System.out.println("before calling validate and save");
			service.validateAndSave(dto);
			System.out.println("after calling validate and save");
		}catch(InvalidTheaterDataException e) {
			e.printStackTrace();
		}
		System.out.println("after catch block");
		
	}

}
