package com.xworkz.examples;

public class Members implements Home{

	@Override
	public boolean polite() {
		System.out.println("running polite method");
		return true;
	}

	@Override
	public boolean noQuarelling() {
		System.out.println("running no quarelling method");
		return true;
	}

	@Override
	public boolean beInTime() {
		System.out.println("running be in time method");
		return true;
	}

	@Override
	public boolean takePermission() {
		System.out.println("running take permission method");
		return true;
	}

	@Override
	public boolean respectElders() {
		System.out.println("running respect elders method");
		return true;
	}
	

}
