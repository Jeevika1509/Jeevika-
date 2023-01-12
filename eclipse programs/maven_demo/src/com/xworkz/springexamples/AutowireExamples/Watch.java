package com.xworkz.springexamples.AutowireExamples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Watch {

	@Autowired
	@Qualifier("watchName")
	private String name;
	@Autowired
	@Qualifier("watchPrice")
	private double price;
	@Autowired
	private int warranty;
	@Autowired
	private boolean working;
	@Autowired
	private byte quantity;
	@Autowired
	private short offer;
	@Autowired
	private char size;
	@Autowired
	private float bandwidth;
	@Autowired
	private long modelno;
	@Override
	public String toString() {
		return "Watch [name=" + name + ", price=" + price + ", warranty=" + warranty + ", working=" + working
				+ ", quantity=" + quantity + ", offer=" + offer + ", size=" + size + ", bandwidth=" + bandwidth
				+ ", modelno=" + modelno + "]";
	}
	
	
	
}
