package com.xworkz.building.dto;

public class BuildingDTO extends AbstractAuditDTO {
	
	private int no;
	private String name;
	private int floors;
	private String liftIn;
	private String parkingIn;
	private String type;
	@Override
	public String toString() {
		return "BuildingDTO [no=" + no + ", name=" + name + ", floors=" + floors + ", liftIn=" + liftIn + ", parkingIn="
				+ parkingIn + ", type=" + type + ", toString()=" + super.toString() + "]";
	}
	
	public BuildingDTO() {
		System.out.println("running building DTO with no aruments");
	}

	public BuildingDTO(int no, String name, int floors, String liftIn, String parkingIn, String type) {
		super();
		this.no = no;
		this.name = name;
		this.floors = floors;
		this.liftIn = liftIn;
		this.parkingIn = parkingIn;
		this.type = type;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFloors() {
		return floors;
	}

	public void setFloors(int floors) {
		this.floors = floors;
	}

	public String getLiftIn() {
		return liftIn;
	}

	public void setLiftIn(String liftIn) {
		this.liftIn = liftIn;
	}

	public String getParkingIn() {
		return parkingIn;
	}

	public void setParkingIn(String parkingIn) {
		this.parkingIn = parkingIn;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	

}
