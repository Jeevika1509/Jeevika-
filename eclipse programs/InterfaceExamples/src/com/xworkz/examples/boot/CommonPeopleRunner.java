package com.xworkz.examples.boot;

import com.xworkz.examples.CommonPeople;
import com.xworkz.examples.CovidRules;

public class CommonPeopleRunner {

	public static void main(String[] args) {
		
		CommonPeople people=new CommonPeople();
		people.maintainDistance();
		people.quarantine();
		people.sanitize();
		people.stayHome();
		people.wearMask();
		
		System.out.println(System.lineSeparator());
		CovidRules rules=new CommonPeople();
		rules.maintainDistance();
		rules.quarantine();
		rules.sanitize();
		rules.stayHome();
		rules.wearMask();
		

	}

}
