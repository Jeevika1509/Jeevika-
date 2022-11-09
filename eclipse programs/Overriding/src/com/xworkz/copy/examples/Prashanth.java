package com.xworkz.copy.examples;

public class Prashanth extends Director{

	public int noOfActors;

	public Prashanth(String movieName, boolean hit,int noOfActors) {
		super(movieName, hit);
		this.noOfActors=noOfActors;
	}
	
	public void display() {
		super.display();
		System.out.println(this.noOfActors);
	}
	
	
}
