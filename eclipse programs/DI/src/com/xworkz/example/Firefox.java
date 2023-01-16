package com.xworkz.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Firefox implements Browser{

	@Autowired
	@Qualifier("jio")
	private Provider jio;
	@Autowired
	@Qualifier("airtel")
	private Provider airtel;
	@Override
	public void browse() {
		System.out.println("running browse method in firefox");
		jio.connect();
	}

}
