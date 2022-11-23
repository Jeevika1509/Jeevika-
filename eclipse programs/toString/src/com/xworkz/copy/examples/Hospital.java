package com.xworkz.copy.examples;

public class Hospital {
	
	private String name;
	private String place;
	private int noOfStaffs; 
	private int noOfPatients; 
	private int noOfWards; 
	private int noOfFloors; 
	private boolean appointment; 
	private boolean prescription; 
	private int consultationFee; 
	private String receptionist;
	
	public Hospital() {
		
	}
	
	public Hospital(String name, String place, int noOfStaffs, int noOfPatients, int noOfWards, int noOfFloors,
			boolean appointment, boolean prescription, int consultationFee, String receptionist) {
		super();
		this.name = name;
		this.place = place;
		this.noOfStaffs = noOfStaffs;
		this.noOfPatients = noOfPatients;
		this.noOfWards = noOfWards;
		this.noOfFloors = noOfFloors;
		this.appointment = appointment;
		this.prescription = prescription;
		this.consultationFee = consultationFee;
		this.receptionist = receptionist;
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
	public int getNoOfStaffs() {
		return noOfStaffs;
	}
	public void setNoOfStaffs(int noOfStaffs) {
		this.noOfStaffs = noOfStaffs;
	}
	public int getNoOfPatients() {
		return noOfPatients;
	}
	public void setNoOfPatients(int noOfPatients) {
		this.noOfPatients = noOfPatients;
	}
	public int getNoOfWards() {
		return noOfWards;
	}
	public void setNoOfWards(int noOfWards) {
		this.noOfWards = noOfWards;
	}
	public int getNoOfFloors() {
		return noOfFloors;
	}
	public void setNoOfFloors(int noOfFloors) {
		this.noOfFloors = noOfFloors;
	}
	public boolean isAppointment() {
		return appointment;
	}
	public void setAppointment(boolean appointment) {
		this.appointment = appointment;
	}
	public boolean isPrescription() {
		return prescription;
	}
	public void setPrescription(boolean prescription) {
		this.prescription = prescription;
	}
	public int getConsultationFee() {
		return consultationFee;
	}
	public void setConsultationFee(int consultationFee) {
		this.consultationFee = consultationFee;
	}
	public String getReceptionist() {
		return receptionist;
	}
	public void setReceptionist(String receptionist) {
		this.receptionist = receptionist;
	}

	

	@Override
	public String toString() {
		return "Hospital [name=" + name + ", place=" + place + ", prescription=" + prescription + "]";
	}

	public boolean equals(Object obj) {
		System.out.println("running equals method");
		if(obj instanceof Hospital) {
			System.out.println("obj is hospital,can check the properties");
			Hospital hospitals=(Hospital)obj;
			if(this.name.equals(hospitals.name) && this.place.equals(hospitals.place) && this.receptionist.equals(hospitals.receptionist)) {
				System.out.println("name,place and receptionist is same");
				return true;
			}
		}
		else {
			System.out.println("obj is not hospital,cannot check properties");
		}
		return false;
	

}
}
