package com.xworkz.examples;

public class CommonPeople implements CovidRules{

	@Override
	public boolean wearMask() {
		System.out.println("running wear mask method");
		return true;
	}

	@Override
	public boolean sanitize() {
		System.out.println("running sanitise method");
		return true;
	}

	@Override
	public boolean maintainDistance() {
		System.out.println("running maintain distance method");
		return true;
	}

	@Override
	public boolean stayHome() {
		System.out.println("running stay home method");
		return true;
	}

	@Override
	public boolean quarantine() {
		System.out.println("running quarantine method");
		return true;
	}

}
