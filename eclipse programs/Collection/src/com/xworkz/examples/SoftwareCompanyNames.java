package com.xworkz.examples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SoftwareCompanyNames {

	public static void main(String[] args) {

		String company1="Mphasis";
		String company2="Infosys";
		String company3="Wipro";
		String company4="TCS";
		String company5="Cognizant";
		String company6="NTT Data";
		String company7="ITC Infotech";
		String company8="Bosch";
		String company9="Atos";
		String company10="Oracle";
		String company11="Tata Elxi";
		String company12="Sonata Software";
		String company13="IBM";
		String company14="KPMG";
		String company15="Altair";
		String company16="Samsung";
		String company17="Siemens";
		String company18="Cisco";
		String company19="Accenture";
		String company20="Mindtree";
		
		Collection<String> companies=new ArrayList<String>();
		companies.add(company1);
		companies.add(company2);
		companies.add(company3);
		companies.add(company4);
		companies.add(company5);
		companies.add(company6);
		companies.add(company7);
		companies.add(company8);
		companies.add(company9);
		companies.add(company10);
		companies.add(company11);
		companies.add(company12);
		companies.add(company13);
		companies.add(company14);
		companies.add(company15);
		companies.add(company16);
		companies.add(company17);
		companies.add(company18);
		companies.add(company19);
		companies.add(company20);
		
		System.out.println(companies.size());
		
		System.out.println("Accessing all elements");
		for(String element:companies) {
			System.out.println(element);
		}
		System.out.println(System.lineSeparator());
		Iterator<String> iterator=companies.iterator();
		while(iterator.hasNext()) {
			String element=iterator.next();
			System.out.println(element);
		}
		
	}

}
