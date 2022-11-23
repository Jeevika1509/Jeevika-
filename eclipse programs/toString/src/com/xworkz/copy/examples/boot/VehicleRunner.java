package com.xworkz.copy.examples.boot;

import com.xworkz.copy.examples.Vehicle;

public class VehicleRunner {
	
	public static void main(String[] args) {
		
		Vehicle vehicle=new Vehicle();
		vehicle.setBrand("Honda");
		vehicle.setColor("white");
		vehicle.setEmissionTest("yes");
		vehicle.setEngineCapacity(110);
		vehicle.setInsurance("yes");
		vehicle.setMileage(45);
		vehicle.setModel("6g");
		vehicle.setName("activa");
		vehicle.setOffers("yes");
		vehicle.setPrice(88000);
		
		Vehicle vehicle2=new Vehicle("suzuki","access 125",77000,"grey","yes","yes","BS6","10 %",64,125);
		boolean same=vehicle.equals(vehicle2);
		System.out.println(same);

	}

}
