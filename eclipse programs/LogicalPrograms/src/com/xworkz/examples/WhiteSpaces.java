package com.xworkz.examples;

public class WhiteSpaces {

	public static void main(String[] args) {
		String s1="Xworkz is a training institute";
		 
		int count=0;
		int l=s1.length();
		for(int i=0;i<l;i++) {
			
			if(s1.charAt(i)==' ') {
				count++;
			}
			else {
				continue;
		}
	
	}
		System.out.println(count);
		
	}

}
