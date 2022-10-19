package com.xworkz.copy.examples;

import com.xworkz.copy.examples.boot.Brand.Brand;

public class Helmet {
	
	public Brand brand;
	public double weight;
	public String color;
	public String size;
	public int price;


	public Helmet(Brand brand,double weight,String color,String size,int price) {
		
		this.brand=brand;
		this.weight=weight;
		this.color=color;
		this.size=size;
		this.price=price;
	}
	
	public void display() {
		
		System.out.println("helmet brand:"+this.brand);
		System.out.println("helmet weight:"+this.weight);
		System.out.println("helmet color :"+this.color);
		System.out.println("helmet size:"+this.size);
		System.out.println("helmet price"+this.price);
}
}
