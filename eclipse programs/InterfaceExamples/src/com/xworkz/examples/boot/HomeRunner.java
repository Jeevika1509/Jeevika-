package com.xworkz.examples.boot;

import com.xworkz.examples.Home;
import com.xworkz.examples.Members;

public class HomeRunner {

	public static void main(String[] args) {

		Members members=new Members();
		members.beInTime();
		members.noQuarelling();
		members.polite();
		members.respectElders();
		members.takePermission();
		System.out.println(System.lineSeparator());
		Home home=new Members();
		home.beInTime();
		home.noQuarelling();
		home.polite();
		home.respectElders();
		home.takePermission();
		
	}

}
