package com.xworkz.copy.examples;

public class PancardList implements Pancards{

	private String[] pancards=new String[10];
	int pancardIndex=0;
	@Override
	public boolean create(String pancard) {

		System.out.println("running create method");
		if(this.pancardIndex>=this.pancards.length)
		{
			throw new PancardSizeExceededException();
		}
		this.pancards[pancardIndex]=pancard;
		this.pancardIndex++;
		return false;
	}
	
	public int total() {
		System.out.println("running total");
		return this.pancardIndex;
		
	}
	

}
