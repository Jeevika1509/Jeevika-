package com.xworkz.copy.examples;

public interface Pancards {
	boolean create(String pancard);
	default int total() {
		return 0;
	}


}
