package com.xworkz.examples.boot;

import java.util.Collection;
import java.util.LinkedList;

import com.xworkz.examples.DTO.AirportDTO;

public class AirportRunner {

	public static void main(String[] args) {

		AirportDTO airportDTO1=new AirportDTO("Kempegowda International Airport", "Devanahalli", 560300);
		AirportDTO airportDTO2=new AirportDTO("Rajiv Gandhi International Airport", "hyderabad", 500016);
		AirportDTO airportDTO3=new AirportDTO("Sri Guru Ram Dass Jee International Airport", "punjab", 143006);
		AirportDTO airportDTO4=new AirportDTO("Lokpriya Gopinath Bordoloi International Airport", "Assam", 781016);
		AirportDTO airportDTO5=new AirportDTO("Biju Patnaik International Airport", "Odisha", 751020);
		
		
		boolean equals=airportDTO1.equals(airportDTO5);
		System.out.println(equals);
		
		Collection<AirportDTO> collection=new LinkedList<AirportDTO>();
		collection.add(airportDTO1);
		collection.add(airportDTO2);
		collection.add(airportDTO3);
		collection.add(airportDTO4);
		collection.add(airportDTO5);
		
		boolean contains=collection.contains(airportDTO1);
		System.out.println("contains:"+contains);
	}

}
