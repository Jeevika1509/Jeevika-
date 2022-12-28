package com.xworkz.examples.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.examples.DTO.CalendarDTO;

public class CalendarRunner {

	public static void main(String[] args) {

		CalendarDTO calendarDTO1=new CalendarDTO("Purestory", "blue", 300D);
		CalendarDTO calendarDTO2=new CalendarDTO("Lauret", "white", 350D);
		CalendarDTO calendarDTO3=new CalendarDTO("Spring Palette", "green", 500D);
		CalendarDTO calendarDTO4=new CalendarDTO("Accuprints", "white", 330D);
		CalendarDTO calendarDTO5=new CalendarDTO("Alicia", "yellow",600D);
		
		boolean equals=calendarDTO1.equals(calendarDTO2);
		System.out.println(equals);
		
		Collection<CalendarDTO> collection=new ArrayList<CalendarDTO>();
		collection.add(calendarDTO1);
		collection.add(calendarDTO2);
		collection.add(calendarDTO3);
		collection.add(calendarDTO4);
		collection.add(calendarDTO5);
		
		boolean contains=collection.contains(calendarDTO1);
		System.out.println("contains:"+contains);
		
		
	}

}
