package com.xworkz.examples.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.examples.DTO.GamesDTO;

public class GamesRunner {

	public static void main(String[] args) {

		GamesDTO gamesDTO1=new GamesDTO("Cricket", "Outdoor", 11);
		GamesDTO gamesDTO2=new GamesDTO("Carrom", "Indoor", 4);
		GamesDTO gamesDTO3=new GamesDTO("Basketball", "Outdoor", 5);
		GamesDTO gamesDTO4=new GamesDTO("Badminton", "Outdoor", 2);
		GamesDTO gamesDTO5=new GamesDTO("Chess", "Indoor", 2);
		
		boolean equals=gamesDTO1.equals(gamesDTO2);
		System.out.println(equals);
		
		Collection<GamesDTO> collection=new ArrayList<GamesDTO>();
		collection.add(gamesDTO1);
		collection.add(gamesDTO2);
		collection.add(gamesDTO3);
		collection.add(gamesDTO4);
		collection.add(gamesDTO5);
		
		boolean contains=collection.contains(gamesDTO1);
		System.out.println("contains:"+contains);
		
		
		
	}

}
