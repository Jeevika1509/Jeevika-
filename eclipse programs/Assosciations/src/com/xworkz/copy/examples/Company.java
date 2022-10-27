package com.xworkz.copy.examples;

public class Company {

	public String name;
	public char type;
	
	public Company() {
		
	}
	
	public Company(String name, char type) {
		super();
		this.name = name;
		this.type = type;
	}

	public void showOff()
	{
		System.out.println(this.name);
		System.out.println(this.type);
	}
}
