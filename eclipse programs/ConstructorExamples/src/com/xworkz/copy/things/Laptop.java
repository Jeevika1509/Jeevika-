package com.xworkz.copy.things;

public class Laptop {
	public String brand;
	public String color;
	public int price;
	
	public Laptop(){
		System.out.println("constructor with no arguments:");
	}
	
	public Laptop(String brand,String color)
	{
		this();
		this.brand=brand;
		this.color=color;
		System.out.println("constructor with 2 arguments string,string with properties brand,color:"+"brand:"+brand+" "+"color:"+color);
	}
	
	public Laptop(String brand,String color,int price)
	{
		this(brand,color);
		this.price=price;
		System.out.println("constructor with 3 arguments string,string and int with properties brand,colo,price:"+"brand:"+brand+" "+"color:"+color+" "+"price:"+price);
	}
	
}
