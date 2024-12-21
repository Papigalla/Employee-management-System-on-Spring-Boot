package com.example.Employee_Management_System.exception;

public class EmployeeNotFoundById extends RuntimeException{
	private final String message;
	private final String redirectTo;
	public EmployeeNotFoundById(String message, String redirectTo) {
		super();
		this.message = message;
		this.redirectTo = redirectTo;
	}
	public String getMessage() {
		return message;
	}
	public String getRedirectTo() {
		return redirectTo;
	}
	
	
	
	
	

}
