package com.xworkz.copy.examples;

public class Fridge {

	public String brand;
	public String[] color;
	public int[] numberOfDoors;
	public String[] modelNumber;
	public double length;
	public double width;
	public double weight;
	public double[] capacity;
	public double[] price;
	public String[] offers;
	public int warranty;
	
	public Fridge(String brand,String[] color,int[] numberOfDoors,String[] modelNumber,double length,double width, double weight, double[] capacity,double[] price, String[] offers,int warranty) {
		this.brand=brand;
		this.color=color;
		this.numberOfDoors=numberOfDoors;
		this.modelNumber=modelNumber;
		this.length=length;
		this.width=width;
		this.weight=weight;
		this.capacity=capacity;
		this.price=price;
		this.offers=offers;
		this.warranty=warranty;
	}
		
		public void display() {

			System.out.println(this.brand);
	        for (int i = 0; i < color.length; i++) {
				
				String ref=this.color[i];
				System.out.println(ref);
				
			}
			
			for (int i = 0; i < numberOfDoors.length; i++) {
				
				int ref=this.numberOfDoors[i];
				System.out.println(ref);
				
			}
	       for (int i = 0; i < modelNumber.length; i++) {
				
				String ref=this.modelNumber[i];
				System.out.println(ref);
				
			}
			
			System.out.println(this.length);
			
			System.out.println(this.width);
			
			System.out.println(this.weight);
			
			
	        for (int i = 0; i < capacity.length; i++) {
				
				double ref=this.capacity[i];
				System.out.println(ref);
				
			}
	         
	        for (int i = 0; i < price.length; i++) {
				
				double ref=this.price[i];
				System.out.println(ref);
				
			}
	        for (int i = 0; i < offers.length; i++) {
				
				String ref=this.offers[i];
				System.out.println(ref);
				
			}
	        
	        System.out.println(this.warranty);
	        
	        
	        
			
		
	}
}
