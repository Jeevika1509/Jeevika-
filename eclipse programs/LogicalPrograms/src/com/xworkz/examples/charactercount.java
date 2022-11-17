package com.xworkz.examples;
public class charactercount {

	public static void main(String[] args) {
		
		int length=0;
		String s="java";
		for(char c1:s.toCharArray())
			length++;
		System.out.println("length of string:"+length);

	}

}
