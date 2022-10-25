package com.xworkz.copy.things;

public class Lamp {
	
	public static String brand;
	public String material="wood";
	public double price;
	public int quantity;
	public String type;
	
	static {
		Lamp.brand="phillips";
	}
	
	public Lamp(double price) {
		this.price=price;
	}
	
	public void setQuantity(int quantity) {
		this.quantity=quantity;
	}
	
	public void display()
	{
		System.out.println(Lamp.brand);
		System.out.println(this.material);
		System.out.println(this.price);
		System.out.println(this.quantity);
		System.out.println(this.type);
	}


}
