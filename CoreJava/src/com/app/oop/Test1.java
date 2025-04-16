package com.app.oop;

public class Test1
{
	Test1()
       {
		this(1);
    	   System.out.println("Test no-args");
       }
     Test1(int i)
     {
    	
    	 System.out.println("Test parameterized");
     }
}
class Sample1 extends Test1
 {
	Sample1()
	{
		super();
		System.out.println("Sample no-args");
	}
 
	public static void main(String[] args) 
	{
		Sample1 s=new Sample1();
		

	}

}
