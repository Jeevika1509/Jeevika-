package com.xworkz.examples;

public class Guest implements Hotel{

	@Override
	public int checkIn() {
		System.out.println("running check in method");
		return 10;
	}

	@Override
	public boolean petsAllowed() {
		System.out.println("running pets allowed method");
		return false;
	}

	@Override
	public boolean billsInCheque() {
		System.out.println("running bills in cheque method");
		return false;
	}

	@Override
	public int departureTime() {
		System.out.println("running departure time method");
		return 8;
	}

	@Override
	public boolean takeCareOfBelongings() {
		System.out.println("running take care of belongings method");
		return true;
	}

	
}
