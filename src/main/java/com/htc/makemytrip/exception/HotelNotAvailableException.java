package com.htc.makemytrip.exception;

public class HotelNotAvailableException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public HotelNotAvailableException(String msg) {
		super(msg);
	}

}
