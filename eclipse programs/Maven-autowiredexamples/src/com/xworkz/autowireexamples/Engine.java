package com.xworkz.autowireexamples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Engine {

	private String name;
	private String type;
	@Autowired
	@Qualifier("engineNumber")
	private int number;
	@Autowired
	@Qualifier("engineVersion")
	private int version;
	private String company;
	private int strokes;
	
	@Autowired
	public Engine(@Qualifier("engineName")String name,@Qualifier("engineType")String type,@Qualifier("engineCompany")String company) {
		super();
		this.name = name;
		this.type = type;
		this.company = company;
	}


	@Autowired
	@Qualifier("engineStroke")
	public void setStrokes(int strokes) {
		this.strokes = strokes;
	}



	@Override
	public String toString() {
		return "Engine [name=" + name + ", type=" + type + ", number=" + number + ", version=" + version + ", company="
				+ company + ", strokes=" + strokes + "]";
	}
	
	
	
}
