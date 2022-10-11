package com.xworkz.copy.things.boot;
import com.xworkz.copy.things.Bus;

public class BusRunner {

	public static void main(String[] args) {
		Bus bus=new Bus();
		System.out.println(bus.busNo);
		System.out.println(bus.starting);
		System.out.println(bus.destination);
		bus.busNo=1;
		bus.starting="Bangalore";
		bus.destination="Mangalore";
		System.out.println(bus.busNo);
		System.out.println(bus.starting);
		System.out.println(bus.destination);
		

	}

}
