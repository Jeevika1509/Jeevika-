package com.xworkz.example;

import org.springframework.stereotype.Component;

@Component
public class Jio implements Provider {

	@Override
	public void connect() {
		System.out.println("running connect method in jio");
	}

}
