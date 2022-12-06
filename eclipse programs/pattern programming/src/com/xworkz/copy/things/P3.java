package com.xworkz.copy.things;

public class P3 {

	public static void main(String[] args) {
		
		int n=4;
		for(int i=1;i<=n;i++)
		{
			for(int j=n-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(i);
			}
			System.out.println("");
		}
		
		for(int i=1;i<=n;i++)
		{
			for(int j=n-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(k);
			}
			System.out.println("");
		}
		
		for(int i=1;i<=n;i++)
		{
			for(int j=n-1;j>=i;j--)
			{
				System.out.print(j);
			}
			for(int k=1;k<=i;k++) {
				System.out.print(k);
			}
			System.out.println("");
		}
		
		for(int i=1;i<=n;i++)
		{
			for(int j=n-1;j>=i;j--)
			{
				
				if(j==2)
				{
				System.out.print("jeevika");
				}
				else {
					System.out.println(j);
				}
			}
			for(int k=1;k<=i;k++) {
				
				if(k==2)
				{
				System.out.print("jeevika");
				}
				else {
					System.out.println(k);
				}
			
			}
			System.out.println("");
		}
		
		
		

	}

}
