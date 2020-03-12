package com.cg.java.exceptions;

public class EmpException extends Exception {

	public EmpException(String message) {
		super(message);
	}
	public EmpException(String message, Throwable throwable) {
		super(message, throwable);
	}

}
