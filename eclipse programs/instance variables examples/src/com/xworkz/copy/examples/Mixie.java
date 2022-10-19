package com.xworkz.copy.examples;

public class Mixie {

	public String brand;
	public String[] modelNumber;
	public String[] color;
	public double length;
	public double width;
	public double[] capacity;
	public double speed;
	public int warranty;
	public int[] price;
	public boolean working;
	public String[] material;
	public double weight;
	
	public Mixie(String brand,String[] modelnumber,String[] color,double length,double width,double[] capacity,double speed, int warranty, int[] price,boolean working,String[] material,double weight) {
		this.brand=brand;
		this.modelNumber=modelnumber;
		this.color=color;
		this.length=length;
		this.width=width;
		this.capacity=capacity;
		this.speed=speed;
		this.warranty=warranty;
		this.price=price;
		this.working=working;
		this.material=material;
		this.weight =weight;
	}
	
	public void display() {

		System.out.println(this.brand);
        for (int i = 0; i < modelNumber.length; i++) {
			
			String ref=this.modelNumber[i];
			System.out.println(ref);
			
		}
       
		for (int i = 0; i < color.length; i++) {
			
			String ref=this.color[i];
			System.out.println(ref);
			
		}
		
		 System.out.println(this.length);
	     System.out.println(this.width);
		
		
       for (int i = 0; i < capacity.length; i++) {
			
			double ref=this.capacity[i];
			System.out.println(ref);
			
		}
		
		System.out.println(this.speed);
		
		System.out.println(this.warranty);
		
		
        for (int i = 0; i < price.length; i++) {
			
			double ref=this.price[i];
			System.out.println(ref);
			
		}
        System.out.println(this.working);
     
         
        for (int i = 0; i < material.length; i++) {
			
			String ref=this.material[i];
			System.out.println(ref);
			
		}
        
        System.out.println(this.weight);
	}
       
	
}
