package com.xworkz.examples.boot;

import com.xworkz.examples.Guest;
import com.xworkz.examples.Hotel;

public class GuestRunner {
	public static void main(String[] args) {
		
		Guest guest=new Guest();
		guest.billsInCheque();
		guest.checkIn();
		guest.departureTime();
		guest.petsAllowed();
		guest.takeCareOfBelongings();
		System.out.println(System.lineSeparator());
		Hotel hotel=new Guest();
		hotel.billsInCheque();
		hotel.checkIn();
		hotel.departureTime();
		hotel.petsAllowed();
		hotel.takeCareOfBelongings();
	}

}
