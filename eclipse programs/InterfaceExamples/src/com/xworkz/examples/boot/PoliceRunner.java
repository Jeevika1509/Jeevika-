package com.xworkz.examples.boot;

import com.xworkz.examples.Police;
import com.xworkz.examples.Rules;

public class PoliceRunner {

	public static void main(String[] args) {

		Police police=new Police();
		police.detentionCrime();
		police.enforceLaw();
		police.preventionCrime();
		police.protect();
		police.provideEmergencyResponse();
		System.out.println(System.lineSeparator());
		Rules rules=new Police();
		rules.detentionCrime();
		rules.enforceLaw();
		rules.preventionCrime();
		rules.protect();
		rules.provideEmergencyResponse();
		
	}

}
