package com.xworkz.example;

import org.springframework.stereotype.Component;

@Component
public class Airtel implements Provider{

	@Override
	public void connect() {
		System.out.println("running connect method in airtel");
	}

}
