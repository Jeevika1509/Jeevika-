package com.xworkz.copy.examples;

public class Director {
	
	public String movieName;
	public boolean hit;
	public Director(String movieName, boolean hit) {
		super();
		this.movieName = movieName;
		this.hit = hit;
	}
	
	public void display() {
		System.out.println(this.movieName);
		System.out.println(this.hit);
	}

}
