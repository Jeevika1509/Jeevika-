package com.xworkz.copy.examples.boot;

import com.xworkz.copy.examples.Hospital;

public class HospitalRunner {

	public static void main(String[] args) {
		
		Hospital hospital=new Hospital();
		hospital.setName("Pathway");
		hospital.setAppointment(true);
		hospital.setConsultationFee(300);
		hospital.setNoOfFloors(5);
		hospital.setNoOfPatients(100);
		hospital.setNoOfStaffs(30);
		hospital.setNoOfWards(30);
		hospital.setPlace("Channasandra");
		hospital.setPrescription(true);
		hospital.setReceptionist("yes");
		
		Hospital hospital2=new Hospital("unity","rr nagar",30,100,30,2,true,true,300,"yes");
		boolean same=hospital.equals(hospital2);
		System.out.println(same);

	}

}
