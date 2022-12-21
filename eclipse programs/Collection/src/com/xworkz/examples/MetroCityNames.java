package com.xworkz.examples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MetroCityNames {

	public static void main(String[] args) {

		String metroCityName1="Bangalore";
		String metroCityName2="Mumbai";
		String metroCityName3="Delhi";
		String metroCityName4="Chennai";
		String metroCityName5="Hyderabad";
		
		Collection<String> metrocities=new ArrayList<String>();
		metrocities.add(metroCityName1);
		metrocities.add(metroCityName2);
		metrocities.add(metroCityName3);
		metrocities.add(metroCityName4);
		metrocities.add(metroCityName5);
		
		System.out.println(metrocities.size());
		
		System.out.println("Accessing all elements");
		for(String element:metrocities) {
			System.out.println(element);
		}
		System.out.println(System.lineSeparator());
		Iterator<String> iterator=metrocities.iterator();
		while(iterator.hasNext()) {
			String element=iterator.next();
			System.out.println(element);
		}
	}

}
