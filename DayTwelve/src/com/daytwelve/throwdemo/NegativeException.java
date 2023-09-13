package com.daytwelve.throwdemo;

public class NegativeException extends Exception{

	public NegativeException(String string) {
		super(string);
	}
	
	public NegativeException() {
		super("negative value exception");
	}

}
