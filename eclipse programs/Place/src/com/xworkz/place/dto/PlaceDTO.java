package com.xworkz.place.dto;

public class PlaceDTO extends AbstractAuditDTO {

	public String name;
	public String city;
	public int pincode;
	public String state;
	public String country;
	@Override
	public String toString() {
		return "PlaceDTO [name=" + name + ", city=" + city + ", pincode=" + pincode + ", state=" + state + ", country="
				+ country + ", toString()=" + super.toString() + "]";
	}
	
	public PlaceDTO() {
		System.out.println("running place DTO with no arguments");
	}

	public PlaceDTO(String name, String city, int pincode, String state, String country) {
		super();
		this.name = name;
		this.city = city;
		this.pincode = pincode;
		this.state = state;
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
	
	
}
