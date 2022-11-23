package com.xworkz.copy.examples;

public class Lipstick {
	
	private String brand;
	private String color;
	private int price; 
	private int quantity; 
	private boolean offers; 
	private String modelNo; 
	private String countryOfOrigin; 
	private String type;
	private String expiryDate;
	private double weight;
	
	public Lipstick() {
		
	}
	
	public Lipstick(String brand, String color, int price, int quantity, boolean offers, String modelNo,
			String countryOfOrigin, String type, String expiryDate, double weight) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.quantity = quantity;
		this.offers = offers;
		this.modelNo = modelNo;
		this.countryOfOrigin = countryOfOrigin;
		this.type = type;
		this.expiryDate = expiryDate;
		this.weight = weight;
	}

	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public boolean isOffers() {
		return offers;
	}
	public void setOffers(boolean offers) {
		this.offers = offers;
	}
	public String getModelNo() {
		return modelNo;
	}
	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}
	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}
	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Lipstick [brand=" + brand + ", color=" + color + ", modelNo=" + modelNo + ", countryOfOrigin="
				+ countryOfOrigin + ", type=" + type + "]";
	}
	
	public boolean equals(Object obj) {
		System.out.println("running equals method");
		if(obj instanceof Lipstick) {
			System.out.println("obj is lipstick,can check the properties");
			Lipstick lipsticks=(Lipstick)obj;
			if(this.brand.equals(lipsticks.brand) && this.type.equals(lipsticks.type) && this.color.equals(lipsticks.color) && this.modelNo.equals(lipsticks.modelNo) && this.countryOfOrigin.equals(lipsticks.countryOfOrigin)) {
				System.out.println("lipstick brand,color,model,country of origin and type is same");
				return true;
			}
		}
		else {
			System.out.println("obj is not lipstick,cannot check properties");
		}
		return false;
	

}
	
	
	

}
