package com.xworkz.examples;

public class Student implements School{

	@Override
	public boolean uniform() {
		System.out.println("running uniform method");
		return true;
	}

	@Override
	public boolean idcard() {
		System.out.println("running idcard method");
		return true;
	}

	@Override
	public boolean attendence() {
		System.out.println("running attendence method");
		return true;
	}

	@Override
	public boolean disciplined() {
		System.out.println("running disciplined method");
		return true;
	}

	@Override
	public boolean homework() {
		System.out.println("running homework method");
		return true;
	}
	
	

}
