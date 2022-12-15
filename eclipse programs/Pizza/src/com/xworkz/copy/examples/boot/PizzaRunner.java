package com.xworkz.copy.examples.boot;

import java.time.LocalDateTime;

import com.xworkz.copy.examples.Service.PizzaService;
import com.xworkz.copy.examples.Service.PizzaServiceImpl;
import com.xworkz.copy.examples.constant.PizzaSize;
import com.xworkz.copy.examples.dto.PizzaDTO;

public class PizzaRunner {

	public static void main(String[] args) {

		PizzaDTO pizza=new PizzaDTO();
		pizza.setName("veg loaded");
		pizza.setCompany("dominos");
		pizza.setPrice(140);
		pizza.setCheese(true);
		pizza.setSize(PizzaSize.SMALL);
		pizza.setFlavour("spicy");
		pizza.setType("VEG");
		pizza.setCreatedBy("SYSTEM");
		pizza.setCreatedDate(LocalDateTime.now());
		
		PizzaService service=new PizzaServiceImpl();
		boolean saved=service.validateAndSave(pizza);
		System.out.println(saved);
	}

}
