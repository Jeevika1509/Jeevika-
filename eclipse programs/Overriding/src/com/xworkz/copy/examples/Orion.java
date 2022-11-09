package com.xworkz.copy.examples;

public class Orion extends ShoppingMall{
	
	public int noOfFloors;

	public Orion(String place, int noOfPeople,int noOfFloors) {
		super(place, noOfPeople);
		this.noOfFloors=noOfFloors;
		
	}
	
	public void display() {
		super.display();
		System.out.println(this.noOfFloors);
	}
	

}
