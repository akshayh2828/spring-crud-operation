package com.example.demo.exception;

public class ResorceNotFound extends Exception {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ResorceNotFound(String msg)
	{
		super(msg);
	}
	public ResorceNotFound(String msg,Throwable cause)
	{
		super(msg,cause);
	}
}
