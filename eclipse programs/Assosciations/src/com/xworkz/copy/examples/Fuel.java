package com.xworkz.copy.examples;

import com.xworkz.copy.examples.boot.FuelType.Type;

public class Fuel {
	
	public boolean special;
	public Type type;
	public int price;
	public int quantity;
	public Brand brand=new Brand("Indian oil",9,4.5);
	
	public Fuel()
	{
		
	}

	public Fuel( boolean special, Type type, int price, int quantity) {
		super();
		this.special = special;
		this.type = type;
		this.price = price;
		this.quantity = quantity;
		
		if(brand!=null) {
			this.brand.showOff();
		}
		
		else {
			System.out.println("it is null");
		}
	}
	
	public int totalPrice()
	{
		int totalPrice = price*quantity;
		return totalPrice;
	}
	
	public void show() {
		
		System.out.println(this.special);
		System.out.println(this.price);
		System.out.println(this.quantity);
		System.out.println(this.type);
		brand.showOff();
	}

}
