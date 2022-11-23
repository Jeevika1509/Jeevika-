package com.xworkz.copy.examples;

public class Vehicle {
	
	private String brand;
	private String name;
	private int price;
	private String color;
	private String insurance;
	private String emissionTest;
	private String model;
	private String offers;
	private int mileage;
	private double engineCapacity;
	
	public Vehicle() {
		
	}
	
	
	public Vehicle(String brand, String name, int price, String color, String insurance, String emissionTest,
			String model, String offers, int mileage, double engineCapacity) {
		super();
		this.brand = brand;
		this.name = name;
		this.price = price;
		this.color = color;
		this.insurance = insurance;
		this.emissionTest = emissionTest;
		this.model = model;
		this.offers = offers;
		this.mileage = mileage;
		this.engineCapacity = engineCapacity;
	}


	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getInsurance() {
		return insurance;
	}
	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}
	public String getEmissionTest() {
		return emissionTest;
	}
	public void setEmissionTest(String emissionTest) {
		this.emissionTest = emissionTest;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getOffers() {
		return offers;
	}
	public void setOffers(String offers) {
		this.offers = offers;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	public double getEngineCapacity() {
		return engineCapacity;
	}
	public void setEngineCapacity(double engineCapacity) {
		this.engineCapacity = engineCapacity;
	}


	@Override
	public String toString() {
		return "Vehicle [brand=" + brand + ", name=" + name + ", color=" + color + ", insurance=" + insurance
				+ ", emissionTest=" + emissionTest + ", model=" + model + ", offers=" + offers + "]";
	}
	
	public boolean equals(Object obj) {
		System.out.println("running equals method");
		if(obj instanceof Vehicle) {
			System.out.println("obj is vehicle,can check the properties");
			Vehicle vehicles=(Vehicle)obj;
			if(this.brand.equals(vehicles.brand) && this.name.equals(vehicles.name) && this.color.equals(vehicles.color) && this.insurance.equals(vehicles.insurance) && this.emissionTest.equals(vehicles.emissionTest) && this.model.equals(vehicles.model) && this.offers.equals(vehicles.offers)) {
				System.out.println("vehicle brand,name,color,insurance,emissiontest,model,and offers is same");
				return true;
			}
		}
		else {
			System.out.println("obj is not vehicle,cannot check properties");
		}
		return false;
	

}

	
}
