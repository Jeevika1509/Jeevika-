package com.xworkz.examples;

public class Students implements College{

	@Override
	public boolean maintainAttendence() {
		System.out.println("running maintain attendence method");
		return true;
	}

	@Override
	public boolean wearIdCard() {
		System.out.println("running wear id card method");
		return true;
	}

	@Override
	public boolean completeAssignments() {
		System.out.println("running complete assignments method");
		return true;
	}

	@Override
	public boolean beOnTimeToCol() {
		System.out.println("running be on time to college method");
		return true;
	}

	@Override
	public boolean discipline() {
		System.out.println("running discipline method");
		return true;
	}
	

}
