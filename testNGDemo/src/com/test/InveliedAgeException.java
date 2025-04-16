package com.test;

	public class InveliedAgeException extends ClassNotFoundException 
	{
		InveliedAgeException(String s)
		{
			super(s);
		}
		InveliedAgeException()
		{
			super();
		}
	}

