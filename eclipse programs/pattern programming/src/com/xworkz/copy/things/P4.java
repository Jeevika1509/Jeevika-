package com.xworkz.copy.things;

public class P4 {

	public static void main(String[] args) {
		
		int n=3;
		for(int i=n;i>=0;i--)
		{
			for(int j=n-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("k");
			}
			System.out.println("m");
		}
		
		for(int i=n;i>=0;i--)
		{
			for(int j=n-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(" % ");
			}
			System.out.println("");
		}
			

	}

}
