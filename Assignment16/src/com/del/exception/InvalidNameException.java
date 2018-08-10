package com.del.exception;

public class InvalidNameException extends Exception {

	private static String msg="The name should only have alphabets and must start with a capital letter.";

	public InvalidNameException(){
		super(msg);
	}
}
