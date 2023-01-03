package com.xworkz.examples.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.examples.DTO.PalaceDTO;

public class PalaceRunner {

	public static void main(String[] args) {

		Collection<PalaceDTO> collection=new ArrayList<PalaceDTO>();
		collection.add(new PalaceDTO("Mysore Palace", "Mysore", "Henry Irwin", false, 50));
		collection.add(new PalaceDTO("Bangalore Palace", "Bangalore", "Chamaraja Wodeyar", true, 30));
		collection.add(new PalaceDTO("Lalitha Mahal Palace", "Mysore", "Munivenkatappa", false, 60));
		collection.add(new PalaceDTO("Amba Vilas Palace", "Mysore", "Jayajirao", true, 40));
		
		collection.stream().filter(dto->!dto.isDestroyed()).collect(Collectors.toSet()).forEach(dto->System.out.println(dto));
	}

}
