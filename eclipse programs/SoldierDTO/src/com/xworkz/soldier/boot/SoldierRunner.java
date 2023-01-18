package com.xworkz.soldier.boot;

import com.xworkz.soldier.dto.SoldierDTO;
import com.xworkz.soldier.repository.SoldierRepoImpl;
import com.xworkz.soldier.repository.SoldierRepository;
import com.xworkz.soldier.service.SoldierServiceImpl;

public class SoldierRunner {

	public static void main(String[] args) {

		SoldierDTO dto=new SoldierDTO("Manoj kumar pandey", 1, "captain", "gorkha rifles", "India");
		SoldierServiceImpl service=new SoldierServiceImpl();
		SoldierRepository repo=new SoldierRepoImpl();
		service.setSoldierRepository(repo);
		service.validateAndSave(dto);
	}

}
