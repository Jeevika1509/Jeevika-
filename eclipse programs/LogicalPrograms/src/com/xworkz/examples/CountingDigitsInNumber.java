package com.xworkz.examples;

public class CountingDigitsInNumber {

	public static void main(String[] args) {
		int count = 0,num=346;
	      System.out.println("Enter a number ::"+num);
	      while(num!=0){
	          num = num/10;
	          count++;
	       }
	       System.out.println("Number of digits in the entered number are :"+count);

	}

}
