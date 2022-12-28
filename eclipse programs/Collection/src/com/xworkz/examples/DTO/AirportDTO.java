package com.xworkz.examples.DTO;

public class AirportDTO {

	private String name;
	private String place;
	private Integer pincode;
	
	public AirportDTO() {
		System.out.println("running airport DTO with no arguments");
	}

	public AirportDTO(String name, String place, Integer pincode) {
		super();
		this.name = name;
		this.place = place;
		this.pincode = pincode;
	}

	public boolean equals(Object ref) {
		System.out.println("running equals method from Airport DTO");
		if(ref!=null) {
			if(ref instanceof AirportDTO) {
				AirportDTO dto=(AirportDTO)ref;
				if(dto.name.equals(this.name) && dto.place.equals(this.place) && dto.pincode.equals(this.pincode)){
					System.out.println("name is matching"+dto.name+"place is matching"+dto.place+"pincode is matching"+pincode);
				return true;
				}
			}
		}
		return false;
		
	}
	@Override
	public String toString() {
		return "AirportDTO [name=" + name + ", place=" + place + ", pincode=" + pincode + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	
}
