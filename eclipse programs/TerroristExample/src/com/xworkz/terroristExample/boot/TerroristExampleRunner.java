package com.xworkz.terroristExample.boot;

import com.xworkz.terroristExample.boot.dto.TerroristDTO;
import com.xworkz.terroristExample.boot.dto.service.TerroristServiceImpl;

public class TerroristExampleRunner {

	public static void main(String[] args) {

		TerroristDTO dto=new TerroristDTO("Abdul Rahman Yasin", 62, "Indiana", false, false, "bombs", "Qaida");
		
		TerroristServiceImpl impl=new TerroristServiceImpl();
		impl.validateAndSave(dto);
		
		
	}

}
