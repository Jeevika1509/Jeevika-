package com.xworkz.copy.examples.boot;

import com.xworkz.copy.examples.God;

public class GodRunner {

	public static void main(String[] args) {
		
		God god=new God();
		god.setName("ganesha");
		god.setAvatarName("Ekadanta");
		god.setGender("male");
		god.setNoOfAvatars(8);
		god.setNoOfTemples(10);
		god.setOtherName("Gajanana");
		god.setPlace("jayanagar");
		god.setPower("sri vinayaka temple");
		god.setPower("wisdom");
		god.setWeapons("paasha");
		
		God god2=new God("ganesha","prosperity",8,"vakrathunda","male","rr nagar","maha ganapati temple","ankush","balaganapati",20);
		boolean same=god.equals(god2);
		System.out.println(same);


	}

}
