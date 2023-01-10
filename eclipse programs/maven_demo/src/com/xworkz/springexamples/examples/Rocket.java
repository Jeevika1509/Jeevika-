package com.xworkz.springexamples.examples;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Rocket {

	@Value("India")
	private String country;
	@Value("BrahMos")
	private String name;
	@Value("34")
	private double budget;
	
	public Rocket() {
		System.out.println("running rocket with no arg constructor");
	}
	public String getCountry() {
		return country;
	}
	public String getName() {
		return name;
	}
	public double getBudget() {
		return budget;
	}
}
