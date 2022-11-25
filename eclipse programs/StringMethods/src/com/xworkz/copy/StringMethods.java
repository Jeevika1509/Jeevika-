package com.xworkz.copy;

public class StringMethods {

	public static void main(String[] args) {
		
		 String str="String is a non-primitive";
		
		System.out.println(str.length());
		
		String str1="Data Type";
		System.out.println(str.compareTo(str1));
		
		str.concat(str1);
		System.out.println(str.concat(str1));
		
		System.out.println(str.contains("is"));
		
		System.out.println(str1.replace('T','t'));
		
		System.out.println(str.charAt(0));
		
		System.out.println(str.compareToIgnoreCase(str1));
		
		System.out.println(str1.contentEquals("Data Type"));
		
		System.out.println(str1.endsWith("e"));
		
		System.out.println(str.equals(str1));
		
		System.out.println(str1.indexOf("Type"));
		
		System.out.println(str.lastIndexOf("primitive"));
		
		System.out.println(str.startsWith("String"));
		
		System.out.println(str.toUpperCase());
		
		System.out.println(str1.toLowerCase());
		
		String str2="  primitive datatype";
		
		System.out.println(str2);
		
		System.out.println(str2.trim());
		
		

	}

}
