package com.xworkz.copy.things;

public class Fish {
	
	public String name;
	public String type;
	public int price;
	public float weight;
	public double length;
	
	public Fish() {
		System.out.println("constructor with no arguments ");
	}
	
	public Fish(String name)
	{
		this.name=name;
	}
	
	public Fish(int price)
	{
		this.price=price;
	}
	
	public Fish(float weight,String type)
	{
		this.weight=weight;
		this.type=type;
	}
	
	public Fish(double length)
	{
		this.length=length;
	}
	
	public Fish(String type,int price)
	{
		this.type=type;
		this.price=price;
	}

	public Fish(String name,float weight) {
		this.name=name;
		this.weight=weight;
	}
	public Fish(double length,float weight) {
		this.length=length;
		this.weight=weight;
	}
	
	
}
