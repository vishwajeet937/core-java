package com.app.wrapper;

public class Test11
{

	public static void main(String[] args)
	{
		//autoBoxing
		int i=21;
		Integer i1= new Integer(i);
		System.out.println(i1);
		// auto unboxing
		Integer i2=new Integer(1);
		int i3=i2;
		System.out.println(i3);

	}

}
