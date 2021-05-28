package com.htc.makemytrip.exception;

public class FlightNotAvailableException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public FlightNotAvailableException(String msg) {
		super(msg);
	}

}
