package com.daytwelve.throwdemo;

public class GreaterValueException extends Exception {

	public GreaterValueException(String string) {
		super(string);
	}

	public GreaterValueException() {
		super("greaterValueException");
	}


}
