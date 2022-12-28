package com.xworkz.examples.DTO;

public class CalendarDTO {

	private String brand;
	private String color;
	private Double price;
	
	public CalendarDTO() {
		System.out.println("running calendar DTO with no arguments");
	}

	public CalendarDTO(String brand, String color, Double price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	public boolean equals(Object ref) {
		System.out.println("running equals method from Calendar DTO");
		if(ref!=null) {
			if(ref instanceof CalendarDTO) {
				CalendarDTO dto=(CalendarDTO)ref;
				if(dto.brand.equals(this.brand) && dto.color.equals(this.color) && dto.price.equals(this.price)){
					System.out.println("brand is matching:"+dto.brand+"color is matching:"+dto.color+"price is matching:"+dto.price);
				return true;
				}
			}
		}
		return false;
		
	}

	@Override
	public String toString() {
		return "CalendarDTO [brand=" + brand + ", color=" + color + ", price=" + price + "]";
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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	
	
}
