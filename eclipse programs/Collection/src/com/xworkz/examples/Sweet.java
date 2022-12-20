package com.xworkz.examples;

import java.util.Collection;
import java.util.TreeSet;

public class Sweet {

	public static void main(String[] args) {
		
		String sweet1="Gulab Jamun";
		String sweet2="Rasgula";
		String sweet3="kaju Katli";
		String sweet4="Motichur";
		String sweet5="Kesar Peda";
		String sweet6="Dharwad Peda";
		String sweet7="Jalebi";
		String sweet8="Kheer";
		String sweet9="Rasmalai";
		String sweet10="Ladoo";
		String sweet11="Mysore Pak";
		String sweet12="Carrot Halwa";
		String sweet13="Kalakand";
		
		Collection<String> collection=new TreeSet();
		collection.add(sweet1);
		collection.add(sweet2);
		collection.add(sweet3);
		collection.add(sweet4);
		collection.add(sweet5);
		collection.add(sweet6);
		collection.add(sweet7);
		collection.add(sweet8);
		collection.add(sweet9);
		collection.add(sweet10);
		collection.add(sweet11);
		collection.add(sweet12);
		collection.add(sweet13);
		
		System.out.println(collection.size());
		collection.clear();
		System.out.println("after clearing the elements ");
		System.out.println(collection.size());

	}

}
