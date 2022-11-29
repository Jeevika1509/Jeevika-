package com.xworkz.examples;

public class Football implements Team{

	@Override
	public int matchTimings() {
		System.out.println("running match timimngs method");
		return 90;
	}

	@Override
	public boolean isbreak() {
		System.out.println("running is break method");
		return true;
	}

	@Override
	public int minNoOfPlayers() {
		System.out.println("running min no of players method");
		return 7;
	}

	@Override
	public boolean constitute() {
		System.out.println("running constitute method");
		return true;
	}

	@Override
	public boolean referee() {
		System.out.println("running referee method");
		return true;
	}

}
