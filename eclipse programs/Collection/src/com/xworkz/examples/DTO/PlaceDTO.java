package com.xworkz.examples.DTO;

public class PlaceDTO {

	private String name;
	private String state;
	private String country;
	
	public PlaceDTO() {
		System.out.println("running constructor with no arguments");
	}

	public PlaceDTO(String name, String state, String country) {
		super();
		this.name = name;
		this.state = state;
		this.country = country;
	}
	
	public boolean equals(Object ref) {
		System.out.println("running equals method from Place DTO");
		if(ref!=null) {
			if(ref instanceof PlaceDTO) {
				PlaceDTO dto=(PlaceDTO)ref;
				if(dto.name.equals(this.name) && dto.state.equals(this.state) && dto.country.equals(this.country)){
					System.out.println("name is matching:"+dto.name+"state is matching:"+dto.state+"country is matching:"+dto.country);
				return true;
				}
			}
		}
		return false;
		
	}

	@Override
	public String toString() {
		return "Place [name=" + name + ", state=" + state + ", country=" + country + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
