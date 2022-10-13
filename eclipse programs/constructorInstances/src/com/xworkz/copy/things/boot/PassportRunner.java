package com.xworkz.copy.things.boot;

import com.xworkz.copy.things.Passport;

public class PassportRunner {

	public static void main(String[] args) {
		
		Passport passport=new Passport();
		System.out.println(passport.no);
		System.out.println(passport.name);
		System.out.println(passport.expiryDate);
		System.out.println(passport.country);
		System.out.println(passport.issuedDate);
		
		passport=new Passport(53388);
		System.out.println(passport.no);
		System.out.println(passport.name);
		System.out.println(passport.expiryDate);
		System.out.println(passport.country);
		System.out.println(passport.issuedDate);
		
		passport=new Passport("geetha");
		System.out.println(passport.no);
		System.out.println(passport.name);
		System.out.println(passport.expiryDate);
		System.out.println(passport.country);
		System.out.println(passport.issuedDate);
		
		passport=new Passport("18 aug 2023","India");
		System.out.println(passport.no);
		System.out.println(passport.name);
		System.out.println(passport.expiryDate);
		System.out.println(passport.country);
		System.out.println(passport.issuedDate);
		
		passport=new Passport("India",522736);
		System.out.println(passport.no);
		System.out.println(passport.name);
		System.out.println(passport.expiryDate);
		System.out.println(passport.country);
		System.out.println(passport.issuedDate);
		
		passport=new Passport(5281734,"Sanjana","20 july 2015");
		System.out.println(passport.no);
		System.out.println(passport.name);
		System.out.println(passport.expiryDate);
		System.out.println(passport.country);
		System.out.println(passport.issuedDate);
		
		passport=new Passport("Sangeetha","India","20 jan 2021","20 jan 2031");
		System.out.println(passport.no);
		System.out.println(passport.name);
		System.out.println(passport.expiryDate);
		System.out.println(passport.country);
		System.out.println(passport.issuedDate);
		
		passport=new Passport(527126,"Swathi","India","20 june 2019","20 june 2029");
		System.out.println(passport.no);
		System.out.println(passport.name);
		System.out.println(passport.expiryDate);
		System.out.println(passport.country);
		System.out.println(passport.issuedDate);
		

	}

}
