package com.xworkz.copy.examples;

public interface Sweets {

	boolean create(String sweet);
	default int total() {
		return 0;
	}

}
