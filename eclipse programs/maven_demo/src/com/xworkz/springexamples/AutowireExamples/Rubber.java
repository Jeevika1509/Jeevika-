package com.xworkz.springexamples.AutowireExamples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Rubber {

	@Autowired
	@Qualifier("rubberName")
	private String name;
	@Autowired
	@Qualifier("rubberType")
	private String type;
	@Autowired
	@Qualifier("price1")
	private double price;
	@Autowired
	@Qualifier("rubberColor")
	private String color;
	@Autowired
	@Qualifier("rubberShape")
	private String shape;
	@Autowired
	private boolean stolen;
	@Autowired
	@Qualifier("rubberSize")
	private String size;
	@Override
	public String toString() {
		return "Rubber [name=" + name + ", type=" + type + ", price=" + price + ", color=" + color + ", shape=" + shape
				+ ", stolen=" + stolen + ", size=" + size + "]";
	}
	
	
}
