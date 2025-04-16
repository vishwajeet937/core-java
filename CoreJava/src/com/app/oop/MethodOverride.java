package com.app.oop;

public class MethodOverride
{
	

	public String name="super class";
 public  Object m1(String name,Object obj)
 {
	 System.out.println("super");
	 return null;
 }
}
 class Check1113 extends MethodOverride
 {
	static  Check1113 c;

	 public String name="sub class";
	 @Override
	 public Object m1(String name,Object obj)
	 {
		 
		 System.out.println("sub:"+obj.s);
		 return null;
	 }
 
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
				c=new Check1113();
		Object ob=new Object();
		ob.s="qsqx";
		
		ob.toString();
		System.out.println(c);
		c.m1("nmsc",ob);
         System.out.println(c.name);
	}
 }

