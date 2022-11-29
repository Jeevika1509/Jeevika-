package com.xworkz.examples.boot;

import com.xworkz.examples.Cricket;
import com.xworkz.examples.TeamMembers;

public class CricketRunner {

	public static void main(String[] args) {
		Cricket cricket=new Cricket();
		cricket.containBreak();
		cricket.noOfPlayers();
		cricket.substitute();
		cricket.runout();
		cricket.umpire();
		
		System.out.println(System.lineSeparator());
		TeamMembers members=new Cricket();
		members.containBreak();
		members.noOfPlayers();
		members.runout();
		members.substitute();
		members.umpire();
	}

}
