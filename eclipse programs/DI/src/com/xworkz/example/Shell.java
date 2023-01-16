package com.xworkz.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Shell implements PetrolBunk {

	@Autowired
	@Qualifier("petrol")
	private Fuel fuel;
	@Override
	public void purchase() {
	System.out.println("running purchase");
	fuel.consume();
	}

	
}
