package com.xworkz.examples;

public class Visitors implements Hospital{

	@Override
	public int visitorTimings() {
		System.out.println("running visitor timings method");
		return 10;
	}

	@Override
	public boolean limitVisitors() {
		System.out.println("running limit visitor method");
		return true;
	}

	@Override
	public boolean maintainLowVoice() {
		System.out.println("running maintain low voice method");
		return true;
	}

	@Override
	public boolean restrictCallsAtPatientRoom() {
		System.out.println("running restrict calls at patient room method");
		return true;
	}

	@Override
	public boolean sanitiseHands() {
		System.out.println("running sanitise hands method");
		return true;
	}

}
