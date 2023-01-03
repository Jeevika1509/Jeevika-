package com.xworkz.examples.DTO;

import com.xworkz.examples.constants.Type;

public class DataBaseVendorDTO {

	private String name;
	private String developedBy;
	private Type type;
	private double size;
	private double licenseCost;
	
	public DataBaseVendorDTO() {
		System.out.println("running constructor with no arguments");
	}

	public DataBaseVendorDTO(String name, String developedBy, Type type, double size, double licenseCost) {
		super();
		this.name = name;
		this.developedBy = developedBy;
		this.type = type;
		this.size = size;
		this.licenseCost = licenseCost;
	}
	
	@Override
	public int hashCode() {
		return 45;
	}
	public boolean equals(Object ref) {
		System.out.println("running equals method from Database Vendor DTO");
		if(ref!=null) {
			if(ref instanceof DataBaseVendorDTO) {
				DataBaseVendorDTO dto=(DataBaseVendorDTO)ref;
				if(dto.name.equals(this.name)){
					System.out.println("name is matching:"+dto.name);
				return true;
				}
			}
		}
		return false;
		
	}

	@Override
	public String toString() {
		return "DataBaseVendorDTO [name=" + name + ", developedBy=" + developedBy + ", type=" + type + ", size=" + size
				+ ", licenseCost=" + licenseCost + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDevelopedBy() {
		return developedBy;
	}

	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public double getLicenseCost() {
		return licenseCost;
	}

	public void setLicenseCost(double licenseCost) {
		this.licenseCost = licenseCost;
	}
	
	
	
}
