package com.app.nonStatic;

public class Check6
{
	{
		System.out.println("non-static Bolock");
	}
	Check6()
	{
		this(2.1f);
		System.out.println("Constructor");
	}
	Check6(float f)
	{
		System.out.println("1-parrem Construcor");
	}
	public int m1()
	{
		System.out.println("m1");
		return 1;
	}
}
class Check7 extends Check6
  {
	static
	{
		System.out.println("Static-Block");
	}
	{
		System.out.println("non-static Block7");
	}
	public static void main(String[] args)
	{
		Check6 c=new Check7();
		c.m1();
	}

}
