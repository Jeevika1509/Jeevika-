package com.xworkz.examples.boot;

import com.xworkz.examples.Court;
import com.xworkz.examples.Rule;

public class CourtRunner {

	public static void main(String[] args) {

		Court court=new Court();
		court.determineConstitutionOfLaw();
		court.enhanceSocialOrder();
		court.Justice();
		court.resolveDisputes();
		court.InterpretLaw();
		System.out.println(System.lineSeparator());
		Rule rule=new Court();
		rule.determineConstitutionOfLaw();
		rule.enhanceSocialOrder();
		rule.InterpretLaw();
		rule.Justice();
		rule.resolveDisputes();
	}

}
