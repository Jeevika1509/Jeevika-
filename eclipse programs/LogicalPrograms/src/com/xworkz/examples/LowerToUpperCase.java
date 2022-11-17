package com.xworkz.examples;

public class LowerToUpperCase {

	public static void main(String[] args) {
		
		String input="java is a programming language";
		System.out.println("lower case of string is:"+input);
		char strArr[]=input.toCharArray();
		for(int i=0;i<strArr.length;i++) {
			if(strArr[i]>='a' && strArr[i]<='z') {
				strArr[i]=(char) ((int) strArr[i]-32);
			}
		}
		System.out.println("upper case string is:");
		for(int i=0;i<strArr.length;i++) {
			System.out.println(strArr[i]);
		}

	}

}
