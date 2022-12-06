package com.xworkz.copy.examples;

public class God {
	
	private String name;
	private String power;
	private int noOfAvatars;
	private String avatarName;
	private String gender;
	private String place;
	private String temple;
	private String weapons;
	private String otherName;
	private int noOfTemples;
	
	public God() {
		
	}
	public God(String name, String power, int noOfAvatars, String avatarName, String gender, String place,
			String temple, String weapons, String otherName, int noOfTemples) {
		super();
		this.name = name;
		this.power = power;
		this.noOfAvatars = noOfAvatars;
		this.avatarName = avatarName;
		this.gender = gender;
		this.place = place;
		this.temple = temple;
		this.weapons = weapons;
		this.otherName = otherName;
		this.noOfTemples = noOfTemples;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	public int getNoOfAvatars() {
		return noOfAvatars;
	}
	public void setNoOfAvatars(int noOfAvatars) {
		this.noOfAvatars = noOfAvatars;
	}
	public String getAvatarName() {
		return avatarName;
	}
	public void setAvatarName(String avatarName) {
		this.avatarName = avatarName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getTemple() {
		return temple;
	}
	public void setTemple(String temple) {
		this.temple = temple;
	}
	public String getWeapons() {
		return weapons;
	}
	public void setWeapons(String weapons) {
		this.weapons = weapons;
	}
	public String getOtherName() {
		return otherName;
	}
	public void setOtherName(String otherName) {
		this.otherName = otherName;
	}
	public int getNoOfTemples() {
		return noOfTemples;
	}
	public void setNoOfTemples(int noOfTemples) {
		this.noOfTemples = noOfTemples;
	}
	
	
	
	@Override
	public String toString() {
		return "God [name=" + name + ", power=" + power + ", noOfAvatars=" + noOfAvatars + ", avatarName=" + avatarName
				+ ", gender=" + gender + ", place=" + place + ", temple=" + temple + ", weapons=" + weapons
				+ ", otherName=" + otherName + ", noOfTemples=" + noOfTemples + "]";
	}
	public boolean equals(Object obj) {
		System.out.println("running equals method");
		if(obj instanceof God) {
			System.out.println("obj is currency,can check the properties");
			God casted=(God)obj;
			if(this.name.equals(casted.name) && this.gender.equals(casted.gender)) {
				System.out.println("name and gender is same");
				return true;
			}
		}
		else {
			System.out.println("obj is not currency,cannot check properties");
		}
		return false;

	}
}
