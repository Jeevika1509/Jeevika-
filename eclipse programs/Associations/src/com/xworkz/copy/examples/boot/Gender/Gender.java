package com.xworkz.copy.examples.boot.Gender;

public enum Gender {
	
    MALE("Male"),FEMALE("Female"),TRANSGENDER("Transgender");
	
	private String name;

	private Gender(String name)
	{
		this.name = name;
	}


}
