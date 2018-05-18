package com.toyota.exception;

public class BusinessControllerException extends Exception{

	private static final long serialVersionUID = -6897370013879402838L;
	
	public BusinessControllerException(String message){
		super(message);
	}
}
