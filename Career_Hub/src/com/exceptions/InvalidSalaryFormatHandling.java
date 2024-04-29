package com.exceptions;

public class InvalidSalaryFormatHandling extends Exception{
	private String message;
	

	public InvalidSalaryFormatHandling(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}

	private static final long serialVersionUID = 321541011146474208L;
	
}


