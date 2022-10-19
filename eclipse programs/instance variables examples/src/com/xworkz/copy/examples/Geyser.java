package com.xworkz.copy.examples;

public class Geyser {
	
	public String brand;
	public String[] modelNumber;
	public double[] price;
	public double[] capacity;
	public double length;
	public double width;
	public String[] color;
	public double weight;
	public int warranty;
	public int[] quantity;
	public boolean offers;
	
	public Geyser(String brand,String[] modelnumber,double[] price,double[] capacity,double length,double width, String[] color, double weight,int warranty, int[] quantity,boolean offers) {
		this.brand=brand;
		this.modelNumber=modelnumber;
		this.price=price;
		this.capacity=capacity;
		this.length=length;
		this.width=width;
		this.color=color;
		this.weight=weight;
		this.warranty=warranty;
		this.quantity=quantity;
		this.offers=offers;
	
	}
	
	public void display() {

		System.out.println(this.brand);
        for (int i = 0; i < modelNumber.length; i++) {
			
			String ref=this.modelNumber[i];
			System.out.println(ref);
			
		}
		
		for (int i = 0; i < price.length; i++) {
			
			double ref=this.price[i];
			System.out.println(ref);
			
		}
       for (int i = 0; i < capacity.length; i++) {
			
			double ref=this.capacity[i];
			System.out.println(ref);
			
		}
		
		System.out.println(this.length);
		
		System.out.println(this.width);
		
		
        for (int i = 0; i < color.length; i++) {
			
			String ref=this.color[i];
			System.out.println(ref);
			
		}
        

		System.out.println(this.weight);
		

		System.out.println(this.warranty);
		
         
        for (int i = 0; i < quantity.length; i++) {
			
			double ref=this.quantity[i];
			System.out.println(ref);
			
		}
        
        
        System.out.println(this.offers);
        
        
	}

}
