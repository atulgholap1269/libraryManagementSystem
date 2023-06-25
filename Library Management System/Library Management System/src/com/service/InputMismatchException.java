package com.service;

public class InputMismatchException extends RuntimeException{
	static String errMess="enter input not match datatype of attribute";
	public InputMismatchException()
	{
	  super(errMess);	
	}
	public InputMismatchException (String str)
	{
		errMess=str;
	}
}
