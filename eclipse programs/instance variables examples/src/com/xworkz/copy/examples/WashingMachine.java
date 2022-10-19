package com.xworkz.copy.examples;

import com.xworkz.copy.examples.boot.colors.colors;

public class WashingMachine {

	public String brand;
	public String type;
	public colors color;
	public double loadCapacity;
	public int price;

	
	
	public WashingMachine(String brand,String type,colors color,double loadCapacity,int price) {
		
		this.brand=brand;
		this.type=type;
		this.color=color;
		this.loadCapacity=loadCapacity;
		this.price=price;
	}
	
	public void display() {
		
		System.out.println("washing machine brand:"+this.brand);
		System.out.println("washing machine type:"+this.type);
		System.out.println("colors :"+color);
		System.out.println("washing machine load capacity"+this.loadCapacity);
		System.out.println("price of the washing machine"+this.price);
		
	}
		
	}