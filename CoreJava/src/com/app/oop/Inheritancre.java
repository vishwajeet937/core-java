package com.app.oop;



public class Inheritancre 
{                                            //alt+shift+x
	
	   static String name="Ram";
	   static int num=1234;
	   static long phnNo=7842676287l;
	   public static void m1()
	   {
		   System.out.println(name);
	   }
}
	    class Test extends Inheritancre
	   {
		   public static void m2()
		   {
			  String name="aam";
			  System.out.println(name); 
		   }
	   
	   
		public static void main(String[] args) 
		{
			Test t=new Test();
			t.m2();
			t.m1();
					
		}
}
