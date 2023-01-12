package com.xworkz.autowireexamples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Newspaper {

	@Autowired
	private int id;
	@Autowired
	@Qualifier("language")
	private String lang;
	private String name;
	private String owner;
	private double price;
	
	@Autowired
	public Newspaper(@Qualifier("newspaperName")String name,@Qualifier("newspaperOwner")String owner) {
		super();
		this.name = name;
		this.owner = owner;
	}

	@Autowired
	@Qualifier("newspaperPrice")
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Newspaper [id=" + id + ", lang=" + lang + ", name=" + name + ", owner=" + owner + ", price=" + price
				+ "]";
	}
	
}
