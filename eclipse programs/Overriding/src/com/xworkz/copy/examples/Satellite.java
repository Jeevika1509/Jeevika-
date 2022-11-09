package com.xworkz.copy.examples;

public class Satellite {
	
	public String name;
	public int distanceFromEarth;
	
	public Satellite(String name, int distanceFromEarth) {
		super();
		this.name = name;
		this.distanceFromEarth = distanceFromEarth;
	}

	public void display()
	{
		System.out.println(this.name);
		System.out.println(this.distanceFromEarth);
	}

}
