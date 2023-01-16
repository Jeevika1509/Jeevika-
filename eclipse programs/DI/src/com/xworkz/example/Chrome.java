package com.xworkz.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Chrome implements Browser{

	@Autowired
	@Qualifier("airtel")
	private Provider airtel;
	@Autowired
	@Qualifier("jio")
	private Provider jios;
	@Override
	public void browse() {
		System.out.println("running browse method in chrome");
		airtel.connect();
	}

}
