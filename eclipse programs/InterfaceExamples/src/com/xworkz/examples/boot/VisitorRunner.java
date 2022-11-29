package com.xworkz.examples.boot;

import com.xworkz.examples.Hospital;
import com.xworkz.examples.Visitors;

public class VisitorRunner {

	public static void main(String[] args) {

		Visitors visitor=new Visitors();
		visitor.limitVisitors();
		visitor.maintainLowVoice();
		visitor.restrictCallsAtPatientRoom();
		visitor.sanitiseHands();
		visitor.visitorTimings();
		
		System.out.println(System.lineSeparator());
		Hospital hospital=new Visitors();
		hospital.limitVisitors();
		hospital.maintainLowVoice();
		hospital.restrictCallsAtPatientRoom();
		hospital.sanitiseHands();
		hospital.visitorTimings();
	}

}
