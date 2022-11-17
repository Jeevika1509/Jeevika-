package com.xworkz.examples;

public class RemoveWhitespaces {

	public static void main(String[] args) {
		
		String s1="Xworkz is a training institute";
		String s2="";
		System.out.println(s1);
		int l=s1.length();
		for(int i=0;i<l;i++) {
			if(s1.charAt(i)!=' ') {
				s2=s2+s1.charAt(i);
			}
			else
				continue;
		}
		System.out.println(s2);
	}

}
