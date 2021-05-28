package com.htc.makemytrip.exception;

public class SeatNotAvailableException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public SeatNotAvailableException(String msg) {
		super(msg);
	}

}
