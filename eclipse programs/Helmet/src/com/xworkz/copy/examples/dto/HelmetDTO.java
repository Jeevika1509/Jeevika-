package com.xworkz.copy.examples.dto;

import java.time.LocalDateTime;

import com.xworkz.copy.examples.constant.*;
import java.time.LocalDateTime;

public class HelmetDTO extends AbstractAuditDTO {

	private String brand;
	private HelmetType type;
	private Double price;
	private Color color;
	
	@Override
	public String toString() {
		return "HelmetDTO [brand=" + brand + ", type=" + type + ", price=" + price + ", color=" + color
				+ ", toString()=" + super.toString() + "]";
	}

	public HelmetDTO() {
		
		System.out.println("calling no argument constructor");
	}

	public HelmetDTO(String brand, HelmetType type, Double price, Color color) {
		super();
		this.brand = brand;
		this.type = type;
		this.price = price;
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public HelmetType getType() {
		return type;
	}

	public void setType(HelmetType type) {
		this.type = type;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	
	
	
	
	
	
	
	
}
