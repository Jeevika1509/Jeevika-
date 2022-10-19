package com.xworkz.copy.examples;

public class Microoven {
	
	public String brand;
	public String[] modelNumber;
	public double length;
	public double width;
	public String[] color;
	public double weight;
	public String[] microOvenType;
	public int price;
	public int warranty;
	public double[] capacity;
	public int[] quantity;
	public String[] offers;
	
	public Microoven(String brand,String[] modelnumber,double length,double width,String[] color,double weight, String[] microOvenType, int price,int warranty, double[] capacity,int[] quantity,String[] offers) {
		this.brand=brand;
		this.modelNumber=modelnumber;
		this.length=length;
		this.width=width;
		this.color=color;
		this.weight=weight;
		this.microOvenType=microOvenType;
		this.price=price;
		this.warranty=warranty;
		this.capacity=capacity;
		this.quantity=quantity;
		this.offers=offers;
	
	}
	
	public void display() {

		System.out.println(this.brand);
        for (int i = 0; i < modelNumber.length; i++) {
			
			String ref=this.modelNumber[i];
			System.out.println(ref);
			
		}
        System.out.println(this.length);
        System.out.println(this.width);
		
		for (int i = 0; i < color.length; i++) {
			
			String ref=this.color[i];
			System.out.println(ref);
			
		}
		
		System.out.println(this.weight);
       for (int i = 0; i < microOvenType.length; i++) {
			
			String ref=this.microOvenType[i];
			System.out.println(ref);
			
		}
		
		System.out.println(this.price);
		
		System.out.println(this.warranty);
		
		
        for (int i = 0; i < capacity.length; i++) {
			
			double ref=this.capacity[i];
			System.out.println(ref);
			
		}
     
         
        for (int i = 0; i < quantity.length; i++) {
			
			double ref=this.quantity[i];
			System.out.println(ref);
			
		}
        
        for (int i = 0; i < offers.length; i++) {
			
			String ref=this.offers[i];
			System.out.println(ref);
			
		}
	}
       
        

}
