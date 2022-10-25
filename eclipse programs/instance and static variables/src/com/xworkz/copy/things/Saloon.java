package com.xworkz.copy.things;

public class Saloon {

	public static String name;
	public String location="rr nagar";
	public double price;
	public String haircut;
	public boolean offers;
	
	static {
		Saloon.name="perimeter";
	}
	
	public Saloon(double price) {
		this.price=price;
	}
	
	public void setOffers(boolean offers) {
		this.offers=offers;
	}
	
	public void display()
	{
		System.out.println(Saloon.name);
		System.out.println(this.location);
		System.out.println(this.price);
		System.out.println(this.haircut);
		System.out.println(this.offers);
	}
}
