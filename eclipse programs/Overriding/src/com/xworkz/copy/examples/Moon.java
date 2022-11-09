package com.xworkz.copy.examples;

public class Moon extends Satellite{
	
	public String color;

	
	
	public Moon(String name, int distanceFromEarth,String color) {
		super(name, distanceFromEarth);
		this.color=color;
	}



	public void display() {
		super.display();
		System.out.println(this.color);
	}
	
	
	

}
