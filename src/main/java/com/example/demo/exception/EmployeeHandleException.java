package com.example.demo.exception;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;



@ControllerAdvice
public class EmployeeHandleException 
{
	@ExceptionHandler(value= {ResorceNotFound.class})
	public ResponseEntity<Object> getEmployeeUserException(ResorceNotFound employeeNotfound)
	{
		EmployeeException ex=new EmployeeException(
				employeeNotfound.getMessage(),
				employeeNotfound.getCause(),
				HttpStatus.NOT_FOUND,
				LocalDate.now()
				);
		return new ResponseEntity<Object>(ex,HttpStatus.NOT_FOUND);
		
	}
	

}
