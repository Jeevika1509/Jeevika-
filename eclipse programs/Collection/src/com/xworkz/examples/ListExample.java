package com.xworkz.examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {


		List<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		
		 for(Integer integer:list) {
			 System.out.println(integer);
			
		 }
		 list.add(1,30);
		 System.out.println(System.lineSeparator());
		 for(Integer integer:list) {
			 System.out.println(integer);
			
		 }
		 
		 list.set(0, 15);
		 System.out.println(System.lineSeparator());
		 for(Integer integer:list) {
			 System.out.println(integer);
		 }
		 list.remove(0);
		 System.out.println(System.lineSeparator());
		 for(Integer integer:list) {
			 System.out.println(integer);
		 }
		 
		 System.out.println(System.lineSeparator());
		 Integer ref=list.get(0);
		 System.out.println(ref);
		 
		 
		 List<String> lists=new ArrayList<String>();
		 lists.add("V");
		 lists.add("I");
		 lists.add("B");
		 lists.add("G");
		 
		 lists.add(1,"Y");
		 System.out.println(System.lineSeparator());
		  for(String string:lists) {
			  System.out.println(string);
		  }
		  lists.set(2, "O");
		  System.out.println(System.lineSeparator());
		  for(String string:lists) {
			  System.out.println(string);
		  }
		  
		  lists.remove("O");
		  System.out.println(System.lineSeparator());
		  for(String string:lists) {
			  System.out.println(string);
		  }
		  System.out.println(System.lineSeparator());
		  String ref1=lists.get(0);
		  System.out.println(ref1);
		 
		 
		 
		 
	}

}
