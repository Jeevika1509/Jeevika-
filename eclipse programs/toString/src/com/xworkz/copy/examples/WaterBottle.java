package com.xworkz.copy.examples;

public class WaterBottle {

	private String brand;
	private String color;
	private int price; 
	private String material;
	private String capacity; 
	private String durable; 
	private int quantity; 
	private String reusable; 
	private String weight; 
	private String type;
	
	public WaterBottle() {
		
	}
	
	public WaterBottle(String brand, String color, int price, String material, String capacity, String durable,
			int quantity, String reusable, String weight, String type) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.material = material;
		this.capacity = capacity;
		this.durable = durable;
		this.quantity = quantity;
		this.reusable = reusable;
		this.weight = weight;
		this.type = type;
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
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	public String getDurable() {
		return durable;
	}
	public void setDurable(String durable) {
		this.durable = durable;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getReusable() {
		return reusable;
	}
	public void setReusable(String reusable) {
		this.reusable = reusable;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "WaterBottle [brand=" + brand + ", color=" + color + ", material=" + material + ", capacity=" + capacity
				+ ", durable=" + durable + ", reusable=" + reusable + ", weight=" + weight + ", type=" + type + "]";
	}
	
	public boolean equals(Object obj) {
		System.out.println("running equals method");
		if(obj instanceof WaterBottle) {
			System.out.println("obj is water bottle,can check the properties");
			WaterBottle waterBottles=(WaterBottle)obj;
			if(this.brand.equals(waterBottles.brand) && this.material.equals(waterBottles.material) && this.color.equals(waterBottles.color) && this.capacity.equals(waterBottles.capacity) && this.durable.equals(waterBottles.durable) && this.reusable.equals(waterBottles.reusable) && this.weight.equals(waterBottles.weight) && this.type.equals(waterBottles.type)) {
				System.out.println("water bottle brand,color,material,capacity,durability,reusable,weight and type is same");
				return true;
			}
		}
		else {
			System.out.println("obj is not water bottle,cannot check properties");
		}
		return false;
	

}
	
}
