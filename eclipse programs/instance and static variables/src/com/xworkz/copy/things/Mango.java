package com.xworkz.copy.things;

public class Mango {

	public static String color;
	public String type="neelam";
	public double price;
	public int quantity;
	public String quality;
	
	static {
		Mango.color="yellow";
	}
	
	public Mango(double price) {
		this.price=price;
	}
	
	public void setQuantity(int quantity) {
		this.quantity=quantity;
	}
	
	public void display()
	{
		System.out.println(this.type);
		System.out.println(Mango.color);
		System.out.println(this.price);
		System.out.println(this.quantity);
		System.out.println(this.quality);
	}
}
