package com.xworkz.examples;

public class VijayaLakshmi extends JavaTrainee implements KarnatakaRTO{

	public VijayaLakshmi(String name, String gender, int age, long phone, String email) {
		super(name, gender, age, phone, email);
		System.out.println("name :"+name+ "gender :"+gender+"age :"+age+"phone number :"+phone+"email :"+email);
	}

	@Override
	public boolean paidTax(double amount) {
		System.out.println("running paid tax");
		System.out.println("tax paid is:"+amount);
		return true;
	}

	@Override
	public double gst() {
		System.out.println("running gst method");
		return 0;
	}

	@Override
	public double vat() {
		return 0;
	}

}
