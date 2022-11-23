package com.xworkz.copy.examples;

public class Institution {

	private String name;
	private String type;
	private int fee;
	private int noOfStudents;
	private int noOfClasses;
	private int noOfTrainers;
	private String mock;
	private String presentation;
	private boolean placementOpportunities;
	private boolean interactive;
	
	public Institution() {
		
	}
	
	
	public Institution(String name, String type, int fee, int noOfStudents, int noOfClasses, int noOfTrainers,
			String mock, String presentation, boolean placementOpportunities, boolean interactive) {
		super();
		this.name = name;
		this.type = type;
		this.fee = fee;
		this.noOfStudents = noOfStudents;
		this.noOfClasses = noOfClasses;
		this.noOfTrainers = noOfTrainers;
		this.mock = mock;
		this.presentation = presentation;
		this.placementOpportunities = placementOpportunities;
		this.interactive = interactive;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public int getNoOfStudents() {
		return noOfStudents;
	}
	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}
	public int getNoOfClasses() {
		return noOfClasses;
	}
	public void setNoOfClasses(int noOfClasses) {
		this.noOfClasses = noOfClasses;
	}
	public int getNoOfTrainers() {
		return noOfTrainers;
	}
	public void setNoOfTrainers(int noOfTrainers) {
		this.noOfTrainers = noOfTrainers;
	}
	public String getMock() {
		return mock;
	}
	public void setMock(String mock) {
		this.mock = mock;
	}
	public String getPresentation() {
		return presentation;
	}
	public void setPresentation(String presentation) {
		this.presentation = presentation;
	}
	public boolean isPlacementOpportunities() {
		return placementOpportunities;
	}
	public void setPlacementOpportunities(boolean placementOpportunities) {
		this.placementOpportunities = placementOpportunities;
	}
	public boolean isInteractive() {
		return interactive;
	}
	public void setInteractive(boolean interactive) {
		this.interactive = interactive;
	}


	@Override
	public String toString() {
		return "Institution [name=" + name + ", type=" + type + ", mock=" + mock + ", presentation=" + presentation
				+ "]";
	}
	
	public boolean equals(Object obj) {
		System.out.println("running equals method");
		if(obj instanceof Institution) {
			System.out.println("obj is institution,can check the properties");
			Institution institutions=(Institution)obj;
			if(this.name.equals(institutions.name) && this.type.equals(institutions.type) && this.mock.equals(institutions.mock) && this.presentation.equals(institutions.presentation)) {
				System.out.println("name,type,mock and presentation is same");
				return true;
			}
		}
		else {
			System.out.println("obj is not institution,cannot check properties");
		}
		return false;
	

}
	
	
	
}
