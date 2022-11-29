package com.xworkz.examples;

public class Citizen implements Bank{

	@Override
	public boolean linkAdharCard() {
		System.out.println("running link adhar card method");
		return true;
	}

	@Override
	public boolean linkPanCard() {
		System.out.println("running link pan card method");
		return true;
	}

	@Override
	public int minAgeForAccountOpening() {
		System.out.println("running min age for account opening method");
		return 18;
	}

	@Override
	public boolean updatedPhoto() {
		System.out.println("running link updated photo method");
		return true;
	}

	@Override
	public boolean linkPhoneNumber() {
		System.out.println("running link phone number method");
		return true;
	}

}
