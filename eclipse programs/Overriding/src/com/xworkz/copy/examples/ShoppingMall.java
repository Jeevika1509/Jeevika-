package com.xworkz.copy.examples;

public class ShoppingMall {
	
	public String place;
	public int noOfPeople;
	
	public ShoppingMall(String place, int noOfPeople) {
		super();
		this.place = place;
		this.noOfPeople = noOfPeople;
	}
	
	public void display() {
		
		System.out.println(this.place);
		System.out.println(this.noOfPeople);
	}

}
