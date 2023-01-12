package com.xworkz.springexamples.AutowireExamples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HardwareShop {

	@Autowired
	@Qualifier("ID")
	private int id;
	@Autowired
	@Qualifier("shopName")
	private String name;
	@Autowired
	@Qualifier("gst")
	private int gstno;
	@Autowired
	@Qualifier("owner")
	private String ownerName;
	@Autowired
	@Qualifier("place")
	private String address;
	@Override
	public String toString() {
		return "HardwareShop [id=" + id + ", name=" + name + ", gstno=" + gstno + ", ownerName=" + ownerName
				+ ", address=" + address + "]";
	}
	
	
	
	
}
