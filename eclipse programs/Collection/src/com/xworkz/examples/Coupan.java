package com.xworkz.examples;

import java.util.Collection;
import java.util.LinkedHashSet;

public class Coupan {

	public static void main(String[] args) {

		String coupan1="jiomart";
		String coupan2="myntra";
		String coupan3="zomata";
		String coupan4="swiggy";
		String coupan5="rapido";
		String coupan6="ajio";
		String coupan7="amazon";
		String coupan8="flipkart";
		String coupan9="ola";
		String coupan10="uber";
		String coupan11="dominos";
		String coupan12="purple";
		
		Collection<String> collection=new LinkedHashSet();
		collection.add(coupan1);
		collection.add(coupan2);
		collection.add(coupan3);
		collection.add(coupan4);
		collection.add(coupan5);
		collection.add(coupan6);
		collection.add(coupan7);
		collection.add(coupan8);
		collection.add(coupan9);
		collection.add(coupan10);
		collection.add(coupan11);
		collection.add(coupan12);
		
		System.out.println(collection.size());
		collection.clear();
		System.out.println("after clearing the elements ");
		System.out.println(collection.size());
		

	}

}
