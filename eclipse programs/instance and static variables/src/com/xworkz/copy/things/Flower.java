package com.xworkz.copy.things;

public class Flower {
	
	public static String flower;
	public double price;
	public int quantity;
	public String color="white";
	public double weight;
	
	static {
		Flower.flower="lily";
	}
	
	public Flower(double price) {
		this.price=price;
	}
	
	public void setQuantity(int quantity) {
		this.quantity=quantity;
	}
	
	public void display()
	{
		System.out.println(Flower.flower);
		System.out.println(this.price);
		System.out.println(this.quantity);
		System.out.println(this.color);
		System.out.println(this.weight+"grams");
	}

}
