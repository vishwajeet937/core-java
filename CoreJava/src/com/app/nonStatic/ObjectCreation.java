package com.app.nonStatic;

public class ObjectCreation 
{
//non static method
	public int m1()
	{
    int x=11;
    System.out.println(x);
    return 9;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ObjectCreation oc=new ObjectCreation();    //object Create
		oc.m1();     //method calling 
	}
  
}
