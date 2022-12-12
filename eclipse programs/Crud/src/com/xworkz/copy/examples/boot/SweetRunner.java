package com.xworkz.copy.examples.boot;

import com.xworkz.copy.examples.SweetList;
import com.xworkz.copy.examples.Sweets;

public class SweetRunner {

	public static void main(String[] args) {

		Sweets sweets=new SweetList();
		sweets.create("kaju katli");
		sweets.create("motichur laddu");
		sweets.create("kesar peda");
		sweets.create("gulab jamun");
		sweets.create("rasgulla");
		sweets.create("rasmalai");
		sweets.create("mysore pak");
		sweets.create("soan papdi");
		sweets.create("laddu");
		sweets.create("besan ladoo");
		System.out.println(sweets.total());
	}

}
