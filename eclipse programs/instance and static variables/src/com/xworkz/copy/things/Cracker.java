package com.xworkz.copy.things;

public class Cracker {
	
	public static String brand;
	public String crackerName="sparklers";
	public double price;
	public int quantity;
	public boolean burst;
	
	static {
		Cracker.brand="Standard";
	}
	
	public Cracker(double price) {
		this.price=price;
	}
	
	public void setQuantity(int quantity) {
		this.quantity=quantity;
	}
	
	public void display()
	{
		System.out.println(Cracker.brand);
		System.out.println(this.crackerName);
		System.out.println(this.price);
		System.out.println(this.quantity);
		System.out.println(this.burst);
	}

}
