package com.app.oop;

public class A11 
{
      static int a=10;
      int x=20;
      
      static
      {
    	  System.out.println("A is loaded");
      }
}
class B11 extends A11
 {
	static int b=30;
	int y=40;
	
	static
	{
		System.out.println("B is loaded");
	}
 }
class C11 extends B11
 {
	static int c=50;
	int z=60;
	
	static 
	{
		System.out.println("c is loaded");
	}
	
}
