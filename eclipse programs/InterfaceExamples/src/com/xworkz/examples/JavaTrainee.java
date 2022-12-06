package com.xworkz.examples;

public class JavaTrainee extends Person implements XworkzRule{

	public JavaTrainee(String name, String gender, int age, long phone, String email) {
		super(name, gender, age, phone, email);
	}

	@Override
	public boolean uploadedTask() {
		System.out.println("running uploaded task");
		return true;
	}

	@Override
	public boolean completedProgram() {
		System.out.println("running completed program");
		return true;
	}

	@Override
	public void eat() {
		System.out.println("running eat method");
	}

	@Override
	public void sleep() {
		System.out.println("running sleep method");		
	}
	public void training() {
		System.out.println("running training");
	}
	public void executeProgram() {
		System.out.println("running execute program");
	}

}
