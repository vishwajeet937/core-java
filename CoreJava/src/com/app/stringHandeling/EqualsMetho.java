package com.app.stringHandeling;

public class EqualsMetho {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String firstName="vishwajeet kumar" ;
		String secondName="sonu kumar";
		String thirdName="vishwajeet kumar";
		
		boolean result=firstName.equals(secondName);
		System.out.println("result is:"+result);
		
		boolean result1=firstName.equals(thirdName);
		System.out.println("Result1 is:"+result1);

	}
}
