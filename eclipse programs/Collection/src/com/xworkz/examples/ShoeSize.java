package com.xworkz.examples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ShoeSize {

	public static void main(String[] args) {

		Double ShoeSize1=5.5;
		Double ShoeSize2=6.0;
		Double ShoeSize3=6.5;
		Double ShoeSize4=7.0;
		Double ShoeSize5=7.5;
		Double ShoeSize6=8.0;
		Double ShoeSize7=8.5;
		Double ShoeSize8=9.0;
		Double ShoeSize9=9.5;
		Double ShoeSize10=10.0;
		Double ShoeSize11=10.5;
		Double ShoeSize12=11.0;
		Double ShoeSize13=11.5;
		Double ShoeSize14=12.0;
		Double ShoeSize15=12.5;
		
		Collection<Double> shoesize=new ArrayList<Double>();
		shoesize.add(ShoeSize1);
		shoesize.add(ShoeSize2);
		shoesize.add(ShoeSize3);
		shoesize.add(ShoeSize4);
		shoesize.add(ShoeSize5);
		shoesize.add(ShoeSize6);
		shoesize.add(ShoeSize7);
		shoesize.add(ShoeSize8);
		shoesize.add(ShoeSize9);
		shoesize.add(ShoeSize10);
		shoesize.add(ShoeSize11);
		shoesize.add(ShoeSize12);
		shoesize.add(ShoeSize13);
		shoesize.add(ShoeSize14);
		shoesize.add(ShoeSize15);
		
		System.out.println(shoesize.size());
		
		System.out.println("Accessing all elements");
		for(Double element:shoesize) {
			System.out.println(element);
		}
		System.out.println(System.lineSeparator());
		Iterator<Double> iterator=shoesize.iterator();
		while(iterator.hasNext()) {
			Double element=iterator.next();
			System.out.println(element);
		}
		
		
		
	}

}
