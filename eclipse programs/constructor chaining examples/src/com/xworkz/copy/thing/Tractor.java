package com.xworkz.copy.thing;

public class Tractor {
	
	public String name;
	public String brand;
	public float price;
	public String color;
	public float hp;
	public String model;
	
	public Tractor(){
		
		System.out.println("constructor with no argumnets");
		
	}
	
	public Tractor(String name) {
		this.name=name;
	
	}
	
	public Tractor(String name,float price) {
		this(name);
		this.price=price;
	}
	
	public Tractor(String brand,String color)
	{
		this.brand=brand;
		this.color=color;
	}
	
	public Tractor(String brand,String color,float hp)
	{
		this(brand,color);
		this.hp=hp;
	}
	
	public Tractor(String brand,String color,String model) {
		
		this(brand,color);
		this.model=model;
	}

}
