package com.xworkz.examples;

public class Police implements Rules
{

	@Override
	public boolean preventionCrime() {
		System.out.println("running prevention crime method");
		return true;
	}

	@Override
	public boolean detentionCrime() {
		System.out.println("running detention crime method");
		return true;
	}

	@Override
	public boolean provideEmergencyResponse() {
		System.out.println("running provide emergency response method");
		return true;
	}

	@Override
	public boolean protect() {
		System.out.println("running protect method");
		return true;
	}

	@Override
	public boolean enforceLaw() {
		System.out.println("running enforce law method");
		return true;
	}

}
