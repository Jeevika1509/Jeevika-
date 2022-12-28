package com.xworkz.examples.boot;

import java.util.Collection;
import java.util.LinkedList;

import com.xworkz.examples.DTO.HolidayDTO;

public class HolidayRunner {

	public static void main(String[] args) {

		HolidayDTO holidayDTO1=new HolidayDTO("Raksha Bandhan", "Thursday", "August");
		HolidayDTO holidayDTO2=new HolidayDTO("Onam", "Thursday", "September");
		HolidayDTO holidayDTO3=new HolidayDTO("Diwali", "monday", "October");
		HolidayDTO holidayDTO4=new HolidayDTO("Christmas", "Sunday", "December");
		HolidayDTO holidayDTO5=new HolidayDTO("Sankranti", "Saturday", "January");
		
		boolean equals=holidayDTO1.equals(holidayDTO2);
		System.out.println(equals);
		
		Collection<HolidayDTO> collection=new LinkedList<HolidayDTO>();
		collection.add(holidayDTO1);
		collection.add(holidayDTO2);
		collection.add(holidayDTO3);
		collection.add(holidayDTO4);
		collection.add(holidayDTO5);
		
		boolean contains=collection.contains(holidayDTO1);
		System.out.println("contains:"+contains);
		
		
	}

}
