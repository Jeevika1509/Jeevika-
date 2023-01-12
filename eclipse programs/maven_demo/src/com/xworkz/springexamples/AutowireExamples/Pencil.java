package com.xworkz.springexamples.AutowireExamples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Pencil {
	
	@Autowired
	@Qualifier("pencilName")
	private String name;
	@Autowired
	@Qualifier("pencilType")
	private String type;
	@Autowired
	private double price;
	@Autowired
	@Qualifier("pencilColor")
	private String color;
	@Autowired
	@Qualifier("isSharp")
	private boolean sharp;
	@Autowired
	@Qualifier("isStolen")
	private boolean stolen;
	@Override
	public String toString() {
		return "Pencil [name=" + name + ", type=" + type + ", price=" + price + ", color=" + color + ", sharp=" + sharp
				+ ", stolen=" + stolen + "]";
	}
	

}
