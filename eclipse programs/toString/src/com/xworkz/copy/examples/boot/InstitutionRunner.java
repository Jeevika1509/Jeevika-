package com.xworkz.copy.examples.boot;

import com.xworkz.copy.examples.Institution;

public class InstitutionRunner {

	public static void main(String[] args) {
		Institution institution=new Institution();
		institution.setName("Xworkz");
		institution.setFee(22000);
		institution.setInteractive(true);
		institution.setMock("yes");
		institution.setNoOfClasses(3);
		institution.setNoOfStudents(50);
		institution.setNoOfTrainers(6);
		institution.setPlacementOpportunities(true);
		institution.setPresentation("yes");
		institution.setType("education");
		
		Institution institution2=new Institution("jspider","education",32000,200,4,10,"yes","yes",true,true);
		boolean same=institution.equals(institution2);
		System.out.println(same);
	}

}
