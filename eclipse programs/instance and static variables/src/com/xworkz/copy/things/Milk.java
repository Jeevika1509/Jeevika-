package com.xworkz.copy.things;

public class Milk {
	
	public static String brand;
	public double price;
	public int quantity;
	public String manufacturingDate;
	public String type="pasteurised milk";
	
	static {
		Milk.brand="nandini";
	}
	
	public Milk(double price) {
		this.price=price;
	}
	
	public void setQuantity(int quantity) {
		this.quantity=quantity;
	}
	
	public void display()
	{
		System.out.println(Milk.brand);
		System.out.println(this.type);
		System.out.println(this.price);
		System.out.println(this.quantity);
		System.out.println(this.manufacturingDate);
	}
	

}
