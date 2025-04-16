package com.app.oop;

public class Vachicle
{
	String name="truck";
	long number=11111111111l;
	
	
}
class Enginne extends Vachicle
{
	public void engine()
	{
    System.out.println(super.name);
	}
	public void engine(int i)
	{
		System.out.println("overloaded");
	}
    
	public static void main(String[] args)
	{
		Enginne e=new Enginne();
		e.engine();
		System.out.println(e.name);
	}

}
