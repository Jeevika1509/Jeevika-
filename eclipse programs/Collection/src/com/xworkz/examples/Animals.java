package com.xworkz.examples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Animals {

	public static void main(String[] args) {


		String animal1="Lion";
		String animal2="Tiger";
		String animal3="Deer";
		String animal4="Giraffe";
		String animal5="Elephant";
		String animal6="Cow";
		String animal7="Dog";
		String animal8="Pig";
		String animal9="Bear";
		String animal10="Camel";
		
		Collection<String> animals=new ArrayList<String>();
		animals.add(animal1);
		animals.add(animal2);
		animals.add(animal3);
		animals.add(animal4);
		animals.add(animal5);
		animals.add(animal6);
		animals.add(animal7);
		animals.add(animal8);
		animals.add(animal9);
		animals.add(animal10);
		
		System.out.println(animals.size());
		
		System.out.println("Accessing all elements");
		for(String element:animals) {
			System.out.println(element);
		}
		System.out.println(System.lineSeparator());
		Iterator<String> iterator=animals.iterator();
		while(iterator.hasNext()) {
			String element=iterator.next();
			System.out.println(element);
		}
		
	}

}
