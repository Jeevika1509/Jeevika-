package com.xworkz.examples.boot;

import com.xworkz.examples.People;
import com.xworkz.examples.TrafficRules;

public class PeopleRunner {

	public static void main(String[] args) {

		People people=new People();
		people.drivingLicense();
		people.followTrafficSignals();
		people.wearHelmet();
		people.wearSeatBelt();
		people.tripleRiding();
		
		System.out.println(System.lineSeparator());
		TrafficRules rules=new People();
		rules.drivingLicense();
		rules.followTrafficSignals();
		rules.wearHelmet();
		rules.wearSeatBelt();
		rules.tripleRiding();
	}

}
