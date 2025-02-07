package com.week5_ExceptionHandling;

public class StringIsNullException extends Exception
{
	public StringIsNullException(String msg)
	{
		super();
		System.out.println(msg);
	}
	
}
