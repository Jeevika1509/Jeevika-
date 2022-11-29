package com.xworkz.examples.boot;

import com.xworkz.examples.Football;
import com.xworkz.examples.Team;

public class FootballRunner {

	public static void main(String[] args) {

		Football football=new Football();
		football.constitute();
		football.isbreak();
		football.matchTimings();
		football.minNoOfPlayers();
		football.referee();
		System.out.println(System.lineSeparator());
		Team team=new Football();
		team.constitute();
		team.isbreak();
		team.matchTimings();
		team.minNoOfPlayers();
		team.referee();
	}

}
