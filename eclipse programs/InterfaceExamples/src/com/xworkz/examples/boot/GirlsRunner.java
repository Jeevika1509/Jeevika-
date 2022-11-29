package com.xworkz.examples.boot;

import com.xworkz.examples.Girls;
import com.xworkz.examples.Hostel;

public class GirlsRunner {

	public static void main(String[] args) {

		Girls girls=new Girls();
		girls.beInTime();
		girls.cleanliness();
		girls.laptopsAllowed();
		girls.useOfMobilePhone();
		girls.visitorsNotAllowed();
		System.out.println(System.lineSeparator());
		Hostel hostel=new Girls();
		hostel.beInTime();
		hostel.cleanliness();
		hostel.laptopsAllowed();
		hostel.useOfMobilePhone();
		hostel.visitorsNotAllowed();
	}

}
