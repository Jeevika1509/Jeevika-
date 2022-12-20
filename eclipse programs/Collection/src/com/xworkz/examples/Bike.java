package com.xworkz.examples;

import java.util.ArrayList;
import java.util.Collection;

public class Bike {

	public static void main(String[] args) {
		
		String bike1="Ducati";
		String bike2="BMW S 100 RR";
		String bike3="Bajaj Pulsar";
		String bike4="Ultraviolette F77";
		String bike5="QJ Motor";
		String bike6="Hero Honda";
		String bike7="Suzuki Gixxer SF";
		String bike8="Yamaha MT";
		String bike9="kawasaki";
		String bike10="honda CBR";
		String bike11="Royal Enfield";
		String bike12="Hero Xpulse 200T";
		String bike13="KTM";
		String bike14="TVS Raider";
		String bike15="Hero Splendor";
		String bike16="TVS Apache";
		String bike17="TVS Ronin";
		String bike18="Bajaj Platina 100";
		
		Collection<String> collection=new ArrayList();
		collection.add(bike1);
		collection.add(bike2);
		collection.add(bike3);
		collection.add(bike4);
		collection.add(bike5);
		collection.add(bike6);
		collection.add(bike7);
		collection.add(bike8);
		collection.add(bike9);
		collection.add(bike10);
		collection.add(bike11);
		collection.add(bike12);
		collection.add(bike13);
		collection.add(bike14);
		collection.add(bike15);
		collection.add(bike16);
		collection.add(bike17);
		collection.add(bike18);
		
		System.out.println(collection.size());
		collection.clear();
		System.out.println("after clearing the elements ");
		System.out.println(collection.size());

	}

}
