package com.xworkz.copy.examples;

public class Watch {

	private String brand="fastrack";
	private String modelno="6251SM01";
	private String type="analog";
	private String color="grey";
	public int price=1000;
	public int warranty=1;
	public boolean working=true;
	public boolean waterResistant=true;
	public String material="metal";
	double weight=180;
	boolean offers=true;
	String getBrand() {
		return brand;
	}
	 void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModelno() {
		return modelno;
	}
	 void setModelno(String modelno) {
		this.modelno = modelno;
	}
	public String getType() {
		return type;
	}
	 void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	 void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	 void setPrice(int price) {
		this.price = price;
	}
	public int getWarranty() {
		return warranty;
	}
	 void setWarranty(int warranty) {
		this.warranty = warranty;
	}
	public boolean isWorking() {
		return working;
	}
	 void setWorking(boolean working) {
		this.working = working;
	}
	public boolean isWaterResistant() {
		return waterResistant;
	}
	 void setWaterResistant(boolean waterResistant) {
		this.waterResistant = waterResistant;
	}
	public String getMaterial() {
		return material;
	}
	 void setMaterial(String material) {
		this.material = material;
	}
	public double getWeight() {
		return weight;
	}
	 void setWeight(double weight) {
		this.weight = weight;
	}
	public boolean isOffers() {
		return offers;
	}
	 void setOffers(boolean offers) {
		this.offers = offers;
	}
	
	
}
