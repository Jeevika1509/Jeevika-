package com.xworkz.copy.examples.boot;

import com.xworkz.copy.examples.Cardiologist;
import com.xworkz.copy.examples.Dentist;
import com.xworkz.copy.examples.Doctor;
import com.xworkz.copy.examples.ENT;

public class DoctorRunner {
	
	public static void main(String[] args)
	{

		Doctor doctor=new Doctor();
		System.out.println(doctor.name);
		System.out.println(doctor.fee);
		
		Doctor doctor1=new Dentist();
		Dentist dentist=(Dentist)doctor1;
		System.out.println(dentist.name);
		System.out.println(dentist.fee);
		System.out.println(dentist.age);
		System.out.println(dentist.salary);
		
		Doctor doctor2=new ENT();
		ENT ent=(ENT)doctor2;
		System.out.println(ent.name);
		System.out.println(ent.fee);
		System.out.println(ent.clinicName);
		System.out.println(ent.place);
		
		Doctor doctor3=new Cardiologist();
		Cardiologist cardiologist=(Cardiologist)doctor3;
		System.out.println(cardiologist.name);
		System.out.println(cardiologist.fee);
		System.out.println(cardiologist.gender);
		System.out.println(cardiologist.availableHours);
		
		
	}
	
	
	

}
