package com.xworkz.examples;

public class People implements TrafficRules{

	@Override
	public boolean wearHelmet() {
		System.out.println("running wear helmet method");
		return true;
	}

	@Override
	public boolean drivingLicense() {
		System.out.println("running driving license method");
		return true;
	}

	@Override
	public boolean wearSeatBelt() {
		System.out.println("running wear seat belt method");
		return true;
	}

	@Override
	public boolean followTrafficSignals() {
		System.out.println("running follow traffic signal method");
		return true;
	}

	@Override
	public boolean tripleRiding() {
		System.out.println("running triple riding method");
		return true;
	}

}
