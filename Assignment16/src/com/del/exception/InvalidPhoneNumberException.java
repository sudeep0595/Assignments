package com.del.exception;

public class InvalidPhoneNumberException extends Exception{

	private static String msg="The Phone number should consist of 10 numbers and the starting number should be either 7,8 or 9";

	public InvalidPhoneNumberException() {
		super(msg);
	}
}
