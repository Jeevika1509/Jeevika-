package com.xworkz.examples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Watches {

	public static void main(String[] args) {

		String watch1="Fastrack";
		String watch2="Titan Raga";
		String watch3="Sonata";
		String watch4="Daniel Wellington";
		String watch5="French Connection";
		
		Collection<String> watches=new ArrayList<String>();
		watches.add(watch1);
		watches.add(watch2);
		watches.add(watch3);
		watches.add(watch4);
		watches.add(watch5);
		
		System.out.println(watches.size());
		
		System.out.println("Accessing all elements");
		for(String element:watches) {
			System.out.println(element);
		}
		System.out.println(System.lineSeparator());
		Iterator<String> iterator=watches.iterator();
		while(iterator.hasNext()) {
			String element=iterator.next();
			System.out.println(element);
		}
	}

}
