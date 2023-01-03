package com.xworkz.examples.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.examples.DTO.DaughterDTO;

public class DaughterRunner {

	public static void main(String[] args) {

		Collection<DaughterDTO> collection=new ArrayList<DaughterDTO>();
		collection.add(new DaughterDTO("Ramya", 9706854318l, 20, false, true));
		collection.add(new DaughterDTO("Rakshitha",9187626345l,30, true, false));
		collection.add(new DaughterDTO("Radhika", 9729773703l, 25, false, true));
		collection.add(new DaughterDTO("Priya", 9201092830l, 35, true, false));
		
	}

}
