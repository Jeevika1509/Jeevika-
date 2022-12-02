package com.xworkz.examples;

public class XworkzRajajinagar implements Xworkz,TrafficRule{

	@Override
	public boolean interview() {
		System.out.println("running interview method");
		return true;
	}

	@Override
	public boolean placement() {
		System.out.println("running placement method");
		return true;
	}

	@Override
	public boolean training() {
		System.out.println("running training method");
		return true;
	}

	@Override
	public boolean wearHelmet() {
		System.out.println("running wear helmet method");
		return true;
	}

	@Override
	public boolean tripleRide() {
		System.out.println("running triple ride method");
		return true;
	}

	
}
