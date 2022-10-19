package com.xworkz.copy.examples;

public class Toothpaste {

	public String[] brand;
	public String[] flavour;
	public double weight;
	public String[] ingredients;
	public String[] color;
	public int price;
	public int barcode;
	public String manufacturingDate;
	public String expiryDate;
	public String[] offers;
	public int[] quantity;
	
	public Toothpaste(String[] brand,String[] flavour,double weight,String[] ingredients,String[] color,int price, int barcode, String manufacturingDate,String Expirydate, String[] offers,int[] quantity) {
		this.brand=brand;
		this.flavour=flavour;
		this.weight=weight;
		this.ingredients=ingredients;
		this.color=color;
		this.price=price;
		this.barcode=barcode;
		this.manufacturingDate=manufacturingDate;
		this.expiryDate=expiryDate;
		this.offers=offers;
		this.quantity=quantity;
		
	}
	
	public void display() {

		
        for (int i = 0; i < brand.length; i++) {
			
			String ref=this.brand[i];
			System.out.println(ref);
			
		}
		
		for (int i = 0; i < flavour.length; i++) {
			
			String ref=this.flavour[i];
			System.out.println(ref);
			
		}
		
		System.out.println(this.weight);
        for (int i = 0; i < ingredients.length; i++) {
			
			String ref=this.ingredients[i];
			System.out.println(ref);
			
		}
        
        for (int i = 0; i < color.length; i++) {
			
			String ref=this.color[i];
			System.out.println(ref);
			
		}
		

		System.out.println(this.price);
		System.out.println(this.barcode);
		System.out.println(this.manufacturingDate);
		System.out.println(this.expiryDate);
		
        for (int i = 0; i < offers.length; i++) {
			
			String ref=this.offers[i];
			System.out.println(ref);
			
		}
        
        for (int i = 0; i < quantity.length; i++) {
			
			int ref=this.quantity[i];
			System.out.println(ref);
			
		}
		
		
	}
}



