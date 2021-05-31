package com.htc.makemytrip.exception;

public class TrainNotAvailableException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public TrainNotAvailableException(String msg) {
		super(msg);
	}

}
