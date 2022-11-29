package com.xworkz.examples;

public class Cricket implements TeamMembers{

	@Override
	public boolean containBreak() {
		System.out.println("running contains break method");
		return true;
	}

	@Override
	public int noOfPlayers() {
		System.out.println("running no of players method");
		return 11;
	}

	@Override
	public boolean umpire() {
		System.out.println("running umpire method");
		return true;
	}

	@Override
	public boolean substitute() {
		System.out.println("running substitute method");
		return true;
	}

	@Override
	public boolean runout() {
		System.out.println("running run out method");
		return true;
	}

}
