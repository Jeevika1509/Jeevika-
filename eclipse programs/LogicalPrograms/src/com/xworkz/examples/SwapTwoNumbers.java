package com.xworkz.examples;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		float first = 4.5f, second = 6.55f;

        System.out.println("Before swap");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);

        float temporary = first;
        first = second;
        second = temporary;

        System.out.println("After swap");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);

	}

}
