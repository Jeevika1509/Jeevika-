package com.xworkz.examples;
public class Jack {

	public static void main(String[] args) {
		
		int n=10;
		int temp=n;
		int count=0;
		int result;
		
		while(n!=0) {
			n=n/10;
			count++;
		}
		result=temp*(int)Math.pow(5, count);
		System.out.println(result);

	}

}
