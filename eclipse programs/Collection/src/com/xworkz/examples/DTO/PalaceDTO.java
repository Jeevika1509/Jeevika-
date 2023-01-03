package com.xworkz.examples.DTO;

public class PalaceDTO {

	private String name;
	private String location;
	private String builtBy;
	private boolean destroyed;
	private double visitingFees;
	
	public PalaceDTO() {
		System.out.println("running constructor with no arguments");
	}

	public PalaceDTO(String name, String location, String builtBy, boolean destroyed, double visitingFees) {
		super();
		this.name = name;
		this.location = location;
		this.builtBy = builtBy;
		this.destroyed = destroyed;
		this.visitingFees = visitingFees;
	}
	
	@Override
	public int hashCode() {
		
		return 30;
	}
	
	public boolean equals(Object ref) {
		System.out.println("running equals method from Palace DTO");
		if(ref!=null) {
			if(ref instanceof PalaceDTO) {
				PalaceDTO dto=(PalaceDTO)ref;
				if(dto.name.equals(this.name) && dto.location.equals(this.location)){
					System.out.println("name is matching:"+dto.name+"location is matching:"+dto.location);
				return true;
				}
			}
		}
		return false;
		
	}


	@Override
	public String toString() {
		return "PalaceDTO [name=" + name + ", location=" + location + ", builtBy=" + builtBy + ", destroyed="
				+ destroyed + ", visitingFees=" + visitingFees + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getBuiltBy() {
		return builtBy;
	}

	public void setBuiltBy(String builtBy) {
		this.builtBy = builtBy;
	}

	public boolean isDestroyed() {
		return destroyed;
	}

	public void setDestroyed(boolean destroyed) {
		this.destroyed = destroyed;
	}

	public double getVisitingFees() {
		return visitingFees;
	}

	public void setVisitingFees(double visitingFees) {
		this.visitingFees = visitingFees;
	}
	
}
