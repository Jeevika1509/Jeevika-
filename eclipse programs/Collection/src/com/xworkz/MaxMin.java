package com.xworkz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxMin {

	public static void main(String[] args) {

		List<Integer> collection=new ArrayList<Integer>();
		collection.add(45);
		collection.add(333);
		collection.add(76);
		collection.add(29);
		collection.add(900);
		collection.add(23);
		collection.add(474);
		collection.add(654);
		collection.add(29);
		collection.add(454);
		
		
		System.out.println("maximum element in the list:"+Collections.max(collection));
	
		System.out.println("minimum element in list:"+Collections.min(collection));
	}

}
