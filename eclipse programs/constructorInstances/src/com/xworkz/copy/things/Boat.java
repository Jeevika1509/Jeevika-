package com.xworkz.copy.things;

public class Boat {
   
	     public String name;
	     public String color;
	     public String companyName;
	     public String type;
	     public String owner;
	     
	     public Boat() {
	    	 System.out.println("constructor with default arguments");
	     }
	     
	     public Boat(String name) {
	    	 this.name=name;
	     }
	     
	     public Boat(String color,String companyName) {
	    	 this.color=color;
	    	 this.companyName=companyName;
	     }
	     
	     public Boat(String type,String owner,String companyName) {
	    	 this.type=type;
	    	 this.owner=owner;
	    	 this.companyName=companyName;
	    	 
	     }
	     
	     public Boat(String color,String name,String type,String owner) {
	    	 this.color=color;
	    	 this.name=name;
	    	 this.type=type;
	    	 this.owner=owner;
	     }
	    	 
	    public Boat(String color,String name,String type,String owner,String companyName) {
		    this.color=color;
		    this.name=name;
		    this.type=type;
		    this.owner=owner;
		    this.companyName=companyName;
	    	 
	     }
}
