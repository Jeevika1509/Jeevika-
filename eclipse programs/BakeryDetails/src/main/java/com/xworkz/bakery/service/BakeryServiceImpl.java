package main.java.com.xworkz.bakery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.java.com.xworkz.bakery.dto.BakeryDTO;
import main.java.com.xworkz.bakery.repository.BakeryRepository;

@Service
public class BakeryServiceImpl implements BakeryService {

	@Autowired
	private BakeryRepository bakeryRepository;
	
    public BakeryServiceImpl() {
		System.out.println("created"+this.getClass().getSimpleName());
	}
	@Override
	public boolean validateAndSave(BakeryDTO dto) {
		System.out.println("running validate and save in bakery service"+dto);
		boolean saved=this.bakeryRepository.save(dto);
		System.out.println("saved in repo"+saved);
		return false;
	}

}
