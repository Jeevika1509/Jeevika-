package com.xworkz.copy.examples;

public class Location {

	public String name;
	public int pincode;
	
	public Location() {
		
	}

	public Location(String name, int pincode) {
		super();
		this.name = name;
		this.pincode = pincode;
	}
	
	public void display()
	{
		System.out.println(this.name);
		System.out.println(this.pincode);
	}
}
