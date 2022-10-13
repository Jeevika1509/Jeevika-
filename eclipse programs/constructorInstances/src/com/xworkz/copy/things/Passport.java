package com.xworkz.copy.things;

public class Passport {
	
	public int no;
	public String name;
	public String expiryDate;
	public String country;
	public String issuedDate;
	
	public Passport() {
		System.out.println("constructor with default arguments");
	}
	
	public Passport(int no) {
		this.no=no;
	}
	
	public Passport(String name) {
		this.name=name;
	}
	
	public Passport(String expiryDate,String country)
	{
		this.expiryDate=expiryDate;
		this.country=country;
	}
	public Passport(String country,int no)
	{
		this.country=country;
		this.no=no;
	}
	public Passport(int no,String name,String issuedDate)
	{
		this.no=no;
		this.name=name;
		this.issuedDate=issuedDate;
	}
	public Passport(String name,String country,String issuedDate,String expiryDate)
	{
		this.name=name;
		this.country=country;
		this.issuedDate=issuedDate;
		this.expiryDate=expiryDate;
	}
	public Passport(int no,String name,String country,String issuedDate,String expiryDate)
	{
		this.no=no;
		this.name=name;
		this.country=country;
		this.issuedDate=issuedDate;
		this.expiryDate=expiryDate;
	}
		
    
}
