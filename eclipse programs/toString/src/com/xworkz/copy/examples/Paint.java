package com.xworkz.copy.examples;

public class Paint {
	
	private String brand;
	private String color;
	private String type;
	private int quantity;  
	private double weight; 
	private String usedFor;
	private String modelNo;
	private String material;
	private int price; 
	private String countryOfOrigin;
	
	public Paint() {
		
	}
	
	public Paint(String brand, String color, String type, int quantity, double weight, String usedFor, String modelNo,
			String material, int price, String countryOfOrigin) {
		super();
		this.brand = brand;
		this.color = color;
		this.type = type;
		this.quantity = quantity;
		this.weight = weight;
		this.usedFor = usedFor;
		this.modelNo = modelNo;
		this.material = material;
		this.price = price;
		this.countryOfOrigin = countryOfOrigin;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getUsedFor() {
		return usedFor;
	}
	public void setUsedFor(String usedFor) {
		this.usedFor = usedFor;
	}
	public String getModelNo() {
		return modelNo;
	}
	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}
	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}

	@Override
	public String toString() {
		return "Paint [brand=" + brand + ", color=" + color + ", type=" + type + ", usedFor=" + usedFor + ", modelNo="
				+ modelNo + ", material=" + material + "]";
	}
	
	public boolean equals(Object obj) {
		System.out.println("running equals method");
		if(obj instanceof Paint) {
			System.out.println("obj is paint,can check the properties");
			Paint paints=(Paint)obj;
			if(this.brand.equals(paints.brand) && this.type.equals(paints.type) && this.color.equals(paints.color) && this.modelNo.equals(paints.modelNo) && this.usedFor.equals(paints.usedFor) && this.material.equals(paints.material)) {
				System.out.println("paint brand,color,model,material,usedfor and type is same");
				return true;
			}
		}
		else {
			System.out.println("obj is not paint,cannot check properties");
		}
		return false;
	

}
	
	
	

}
