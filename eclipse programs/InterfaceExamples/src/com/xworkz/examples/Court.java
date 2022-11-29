package com.xworkz.examples;

public class Court implements Rule{

	@Override
	public boolean InterpretLaw() {
		System.out.println("running interpret law method");
		return true;
	}

	@Override
	public boolean determineConstitutionOfLaw() {
		System.out.println("running determine constitution of law method");
		return true;
	}

	@Override
	public boolean Justice() {
		System.out.println("running justice method");
		return true;
	}

	@Override
	public boolean enhanceSocialOrder() {
		System.out.println("running enhance Social Order method");
		return true;
	}

	@Override
	public boolean resolveDisputes() {
		System.out.println("running resolve Disputes method");
		return true;
	}

}
