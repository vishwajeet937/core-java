package com.app.exceptionalHandeling;

public class InvalidAgeException extends Exception
{
	InvalidAgeException(String s) 
	{
		super(s);
	}
	InvalidAgeException()
	{
		super();
	}
}
