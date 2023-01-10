package com.xworkz.springexamples.examples;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Season {
	
	private String name;
	private float duration;
	private String startingMonth;
	
	public Season() {
		System.out.println("constructor with no arguments");
	}

	public String getName() {
		return name;
	}

	@Value("Rainy")
	public void setName(String name) {
		this.name = name;
	}

	public float getDuration() {
		return duration;
	}

	@Value("4")
	public void setDuration(float duration) {
		this.duration = duration;
	}

	public String getStartingMonth() {
		return startingMonth;
	}

	@Value("June")
	public void setStartingMonth(String startingMonth) {
		this.startingMonth = startingMonth;
	}
	
	

}
