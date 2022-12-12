package com.xworkz.copy.examples;

public interface Emails {
	boolean create(String email);
	default int total() {
		return 0;
	}

}
