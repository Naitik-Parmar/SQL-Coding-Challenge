package com.exceptions;

public class InvalidEmailFormatHandling extends Exception{
	private String message;
	

	public InvalidEmailFormatHandling(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}

	private static final long serialVersionUID = 321541011146474208L;
	
}
