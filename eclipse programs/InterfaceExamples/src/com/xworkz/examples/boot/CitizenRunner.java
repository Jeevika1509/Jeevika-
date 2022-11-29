package com.xworkz.examples.boot;

import com.xworkz.examples.Bank;
import com.xworkz.examples.Citizen;

public class CitizenRunner {

	public static void main(String[] args) {

		Citizen citizen=new Citizen();
		citizen.linkAdharCard();
		citizen.linkPanCard();
		citizen.linkPhoneNumber();
		citizen.minAgeForAccountOpening();
		citizen.updatedPhoto();
		
		System.out.println(System.lineSeparator());
		Bank bank=new Citizen();
		bank.linkAdharCard();
		bank.linkPanCard();
		bank.linkPhoneNumber();
		bank.minAgeForAccountOpening();
		bank.updatedPhoto();
		
	}

}
