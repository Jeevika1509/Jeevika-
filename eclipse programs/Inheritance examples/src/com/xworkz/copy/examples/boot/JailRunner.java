package com.xworkz.copy.examples.boot;

import com.xworkz.copy.examples.*;

public class JailRunner {

	public static void main(String[] args) {
		
		Jail jail=new Jail();
		System.out.println(jail.name);
		System.out.println(jail.place);
		
		Jail jail1=new CentralJail();
		CentralJail centraljail=(CentralJail)jail1;
		System.out.println(centraljail.name);
		System.out.println(centraljail.place);
		System.out.println(centraljail.noOfPrisoners);
		System.out.println(centraljail.noOfCells);
		
		Jail jail2=new DistrictJail();
		DistrictJail districtjail=(DistrictJail)jail2;
		System.out.println(districtjail.name);
		System.out.println(districtjail.place);
		System.out.println(districtjail.noOfCases);
		System.out.println(districtjail.noOfpolice);
		
		Jail jail3=new SubJail();
		SubJail subjail=(SubJail)jail3;
		System.out.println(subjail.name);
		System.out.println(subjail.place);
		System.out.println(subjail.noOfSecurity);
		System.out.println(subjail.location);

		
	}

}
