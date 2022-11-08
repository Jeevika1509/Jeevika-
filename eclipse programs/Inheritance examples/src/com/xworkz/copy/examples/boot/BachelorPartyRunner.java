package com.xworkz.copy.examples.boot;

import com.xworkz.copy.examples.BachelorParty;
import com.xworkz.copy.examples.Party;

public class BachelorPartyRunner {

	public static void main(String[] args) {
		
		BachelorParty party=new Party("JP Nagar",10,"10 Nov 2022");
		System.out.println(party.place);
		System.out.println(party.time);
		System.out.println(party.date);

	}

}
