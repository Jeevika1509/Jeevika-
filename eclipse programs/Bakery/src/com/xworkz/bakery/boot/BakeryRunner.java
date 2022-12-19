package com.xworkz.bakery.boot;

import com.xworkz.bakery.dto.BakeryDTO;
import com.xworkz.bakery.exception.InvalidBakeryDataException;
import com.xworkz.bakery.repository.BakeryRepository;
import com.xworkz.bakery.repository.BakeryRepositoryImpl;
import com.xworkz.bakery.service.BakeryService;
import com.xworkz.bakery.service.BakeryServiceImpl;


public class BakeryRunner {

	public static void main(String[] args) {

		BakeryDTO dto=new BakeryDTO("Cake Walk", "Bandlab", 9573731235l,"Indiranagar","chocolate truffle" );
		BakeryRepository repository=new BakeryRepositoryImpl();
		BakeryService service=new BakeryServiceImpl(repository);
		try {
			System.out.println("before calling validate and save");
			service.validateAndSave(dto);
			System.out.println("after calling validate and save");
		}
		catch(InvalidBakeryDataException e){
			e.printStackTrace();
		}
		System.out.println("after catch block");

		
	}

}
