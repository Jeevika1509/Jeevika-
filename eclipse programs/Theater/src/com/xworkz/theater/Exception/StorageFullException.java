package com.xworkz.theater.Exception;

public class StorageFullException extends RuntimeException {

	public StorageFullException() {
		
	}
	public StorageFullException(String msg) {
		super(msg);
	}
}