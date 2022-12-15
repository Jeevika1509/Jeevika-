package com.xworkz.copy.boot;

import com.xworkz.copy.examples.Repository.HelmetRepository;
import com.xworkz.copy.examples.Repository.HelmetRepositoryImpl;
import com.xworkz.copy.examples.Service.HelmetService;
import com.xworkz.copy.examples.Service.HelmetServiceImpl;
import com.xworkz.copy.examples.constant.Color;
import com.xworkz.copy.examples.constant.HelmetType;
import com.xworkz.copy.examples.dto.HelmetDTO;

public class HelmetRunner {

	public static void main(String[] args) {

		HelmetDTO dto=new HelmetDTO("Steelbird",HelmetType.HALF,1400D,Color.BLUE);
		HelmetRepository repository=new HelmetRepositoryImpl();
		HelmetService helmetService=new HelmetServiceImpl(repository);
		
		boolean value=helmetService.validateAndSave(dto);
		System.out.println("values saved"+value);
	}

}
