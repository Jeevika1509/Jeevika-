package com.xworkz.example;

import org.springframework.stereotype.Component;

@Component
public class Petrol implements Fuel{

	@Override
	public void consume() {

		System.out.println("running petrol");
	}

}
