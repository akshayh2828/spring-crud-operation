package com.example.demo.exception;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;

public class EmployeeException 
{
	private  String message;
	private  Throwable throwable;
	private HttpStatus code;
	private LocalDate date;
	public EmployeeException() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeException(String message, Throwable throwable, HttpStatus code, LocalDate date) {
		super();
		this.message = message;
		this.throwable = throwable;
		this.code = code;
		this.date = date;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Throwable getThrowable() {
		return throwable;
	}
	public void setThrowable(Throwable throwable) {
		this.throwable = throwable;
	}
	public HttpStatus getCode() {
		return code;
	}
	public void setCode(HttpStatus code) {
		this.code = code;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	

}
