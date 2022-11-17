package com.xworkz.examples;
public class Frequency {

	public static void main(String[] args) {
	
		String str="hello everyone";
		char ch='l';
		int frequency=0;
		for(int i=0;i<str.length();i++) {
			if(ch==str.charAt(i)) {
				frequency++;
			}
		}
		System.out.println("frequency of"+" "+ch+" "+"="+frequency);

	}

}
