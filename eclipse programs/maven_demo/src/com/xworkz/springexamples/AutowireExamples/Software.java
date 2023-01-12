package com.xworkz.springexamples.AutowireExamples;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Software {
	
	@Autowired
	@Qualifier("softwareName")
	private String name;
	@Autowired
	private int version;
	@Autowired
	@Qualifier("softwareDeveloper")
	private String developer;
	@Autowired
	private Date date;
	@Autowired
	private boolean free;
	@Override
	public String toString() {
		return "Software [name=" + name + ", version=" + version + ", developer=" + developer + ", date=" + date
				+ ", free=" + free + "]";
	}
	
	
	

}
