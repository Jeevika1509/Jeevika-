package com.xworkz.copy.examples;

import java.nio.file.FileSystemAlreadyExistsException;

public class EmailList implements Emails{
	
	private String[] emails=new String[10];
	int emailIndex=0;

	@Override
	public boolean create(String email) {
		System.out.println("running create method");
		if(this.emailIndex>=this.emails.length)
		{
			throw new EmailSizeExceededException();
		}
		this.emails[emailIndex]=email;
		this.emailIndex++;
		return false;
	}
	
	public int total() {
		System.out.println("running total");
		return this.emailIndex;
		
	}

}
