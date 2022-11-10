package com.xworkz.copy.examples;

public class Pg extends Home{
	
	@Override
	public void providesSecurity() {
		super.providesSecurity();
		System.out.println("running provides security in child class");
	}

}
