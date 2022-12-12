package com.xworkz.copy.examples;

public class SweetList implements Sweets{

	private String[] sweets=new String[10];
	int sweetIndex=0;
	@Override
	public boolean create(String sweet) {

		System.out.println("running create method");
		if(this.sweetIndex>=this.sweets.length)
		{
			throw new SweetSizeExceededException();
		}
		this.sweets[sweetIndex]=sweet;
		this.sweetIndex++;
		return false;
	}
	
	public int total() {
		System.out.println("running total");
		return this.sweetIndex;
		
	}

	
}
