package com.xworkz.copy.things;

public class Sweet {

	public static String brand;
	public String sweetName;
	public double price;
	public int quantity = 20;
	public String color;

	static {
		Sweet.brand = "kanti sweets";
	}

	public Sweet(String sweetName) {
		this.sweetName = sweetName;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void display() {
		System.out.println(Sweet.brand);
		System.out.println(this.sweetName);
		System.out.println(this.price);
		System.out.println(this.quantity);
		System.out.println(this.color);
	}

}
