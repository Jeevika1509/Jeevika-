package com.xworkz.copy.things;

public class Shirt {
	
	public static String brand;
	public String material;
	public double price;
	public int quantity=1;
	public String color;
	
	static {
		Shirt.brand="Vero Moda";
	}

	public Shirt(String material) {
		this.material=material;
	}
	
	public void setPrice(double price) {
		this.price=price;
	}
	
	public void display()
	{
		System.out.println(Shirt.brand);
		System.out.println(this.material);
		System.out.println(this.price);
		System.out.println(this.quantity);
		System.out.println(this.color);
	}
}
