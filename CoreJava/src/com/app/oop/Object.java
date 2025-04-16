package com.app.oop;

public class Object 
{
	public String s;
	public void m1()
	{
		System.out.println("m1");
	}
   public Object() 
   {
	   System.out.println("Object in super class");
   }
}
class Example191 extends Object
 {
	int x=10;
	int y=20;
	
	Example191()
	{
		super();
		System.out.println("Example class");
		System.out.println(x+"\n"+y);
	}
 }
class Sample12 extends Example191
 {
	int x=50;
	int y=60;
	
	Sample12()
	{
		System.out.println("Sample class");
		System.out.println(x+" and "+y);
	}
 
	public static void main(String[] args) 
	{
		Sample12 s=new Sample12();

	}

}
