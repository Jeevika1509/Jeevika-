package com.xworkz.copy.thing;

public class TextileShop {

	public String ownerName;
	public String ownerWifeName;
	public String ownerDaughterName;
	public long ownerDaughterNumber;
	public int ownerNoOfWifes;
	public int shopNo;
	public long contactNo;
	
	public TextileShop() {
		System.out.println("Constructor with no arguments");
	}
	
	public TextileShop(String ownerName) {
		this.ownerName=ownerName;
	}
	
	public TextileShop(String ownerName,String ownerWifeName) {
		this(ownerName);
		this.ownerWifeName=ownerWifeName;
	}
	
	public TextileShop(String ownerName,String ownerWifeName,String ownerDaughterName) {
		this(ownerName,ownerWifeName);
		this.ownerDaughterName=ownerDaughterName;
	}
	
	public TextileShop(String ownerName,String ownerWifeName,String ownerDaughterName,long ownerDaughterNumber) {
		this(ownerName,ownerWifeName,ownerDaughterName);
		this.ownerDaughterNumber=ownerDaughterNumber;
	}
	
	public TextileShop(String ownerName,String ownerWifeName,String ownerDaughterName,long ownerDaughterNumber,int ownerNoOfWifes) {
		this(ownerName,ownerWifeName,ownerDaughterName,ownerDaughterNumber);
		this.ownerNoOfWifes=ownerNoOfWifes;
	}
	
	public TextileShop(String ownerName,String ownerWifeName,String ownerDaughterName,long ownerDaughterNumber,int ownerNoOfWifes,int shopNo) {
		this(ownerName,ownerWifeName,ownerDaughterName,ownerDaughterNumber,ownerNoOfWifes);
		this.shopNo=shopNo;
	}
	
	public TextileShop(String ownerName,String ownerWifeName,String ownerDaughterName,long ownerDaughterNumber,int ownerNoOfWifes,int shopNo,long contactNo) {
		this(ownerName,ownerWifeName,ownerDaughterName,ownerDaughterNumber,ownerNoOfWifes,shopNo);
		this.contactNo=contactNo;
	}
}
