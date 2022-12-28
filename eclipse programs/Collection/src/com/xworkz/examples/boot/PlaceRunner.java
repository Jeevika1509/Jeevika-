package com.xworkz.examples.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.examples.DTO.PlaceDTO;

public class PlaceRunner {

	public static void main(String[] args) {

		PlaceDTO placeDTO1=new PlaceDTO("Iskcon Temple", "Karnataka", "India");
		PlaceDTO placeDTO2=new PlaceDTO("Lalbagh", "Karnataka", "India");
		PlaceDTO placeDTO3=new PlaceDTO("Wonderla", "Karnataka", "India");
		PlaceDTO placeDTO4=new PlaceDTO("Bannerghatta National Park", "Karnataka", "India");
		PlaceDTO placeDTO5=new PlaceDTO("Bull Temple ", "Karnataka", "India");
		
		boolean equals=placeDTO1.equals(placeDTO2);
		System.out.println(equals);
		
		Collection<PlaceDTO> collection=new ArrayList<PlaceDTO>();
		collection.add(placeDTO1);
		collection.add(placeDTO2);
		collection.add(placeDTO3);
		collection.add(placeDTO4);
		collection.add(placeDTO5);
		
		boolean contains=collection.contains(placeDTO1);
		System.out.println("contains:"+contains);

	}

}
