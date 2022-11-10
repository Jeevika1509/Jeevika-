package com.xworkz.copy.examples;

public class Rafell extends WarJet{

	@Override
	public void fireTarget() {
		super.fireTarget();
		System.out.println("running fire target in child class");
	}
}
