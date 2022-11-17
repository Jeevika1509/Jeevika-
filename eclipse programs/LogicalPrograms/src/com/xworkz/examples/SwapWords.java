package com.xworkz.examples;
public class SwapWords {

	public static void main(String[] args) {
		String originalStr="I am going to college";
		System.out.println("original string:"+originalStr);
		String words[]=originalStr.split(" ");
		String reverseString="";
		for(int i=words.length-1;i>=0;i--) {
			reverseString=reverseString+" "+words[i];
			
		}
		System.out.println("reversed string:"+reverseString);

	}

}
