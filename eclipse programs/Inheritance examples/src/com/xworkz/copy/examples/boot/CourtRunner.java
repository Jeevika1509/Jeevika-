package com.xworkz.copy.examples.boot;

import com.xworkz.copy.examples.Court;
import com.xworkz.copy.examples.DistrictCourt;
import com.xworkz.copy.examples.HighCourt;
import com.xworkz.copy.examples.SupremeCourt;

public class CourtRunner {

	public static void main(String[] args) {
		
		Court court=new Court();
		System.out.println(court.name);
		System.out.println(court.place);
		
		Court court1=new DistrictCourt();
		DistrictCourt districtcourt=(DistrictCourt)court1;
		System.out.println(districtcourt.name);
		System.out.println(districtcourt.place);
		System.out.println(districtcourt.noOfWorkingDays);
		System.out.println(districtcourt.workingHours);
		
		Court court2=new HighCourt();
		HighCourt highcourt=(HighCourt)court2;
		System.out.println(highcourt.name);
		System.out.println(highcourt.place);
		System.out.println(highcourt.noOfLawyers);
		System.out.println(highcourt.noOfHolidays);
		
		Court court3=new SupremeCourt();
		SupremeCourt supremecourt=(SupremeCourt)court3;
		System.out.println(supremecourt.name);
		System.out.println(supremecourt.place);
		System.out.println(supremecourt.noOfCases);
		System.out.println(supremecourt.noOfStaffs);
		
		

	}

}
