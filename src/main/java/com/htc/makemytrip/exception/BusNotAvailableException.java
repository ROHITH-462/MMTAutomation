package com.htc.makemytrip.exception;

public class BusNotAvailableException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public BusNotAvailableException(String msg) {
		super(msg);
	}

}
