package com.xworkz.examples;

public class Employee implements Company{

	@Override
	public boolean idcard() {
		System.out.println("running idcard methods");
		return false;
	}

	@Override
	public boolean dressCode() {
		System.out.println("running dress code methods");
		return false;
	}

	@Override
	public boolean completeTasks() {
		System.out.println("running complete task methods");
		return false;
	}

	@Override
	public int workingHours() {
		System.out.println("running working hours methods");
		return 8;
	}

	@Override
	public boolean hasBreak() {
		System.out.println("running has break methods");
		return false;
	}

	
}
