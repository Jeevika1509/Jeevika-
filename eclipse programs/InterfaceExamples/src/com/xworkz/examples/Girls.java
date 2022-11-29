package com.xworkz.examples;

public class Girls implements Hostel{

	@Override
	public boolean visitorsNotAllowed() {
		System.out.println("running visitors not allowed method");
		return false;
	}

	@Override
	public boolean beInTime() {
		System.out.println("running be in time method");
		return true;
	}

	@Override
	public boolean cleanliness() {
		System.out.println("running cleanliness method");
		return true;
	}

	@Override
	public boolean useOfMobilePhone() {
		System.out.println("running use of mobile phones method");
		return true;
	}

	@Override
	public boolean laptopsAllowed() {
		System.out.println("running laptops allowed method");
		return true;
	}
	

}
