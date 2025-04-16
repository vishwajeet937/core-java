package com.app.staticProgram;

public class FindOutPut 
{
   static int a=10;
   static
   {
	   int b=98;
	   System.out.println("static-Block1");
	   System.out.println(FindOutPut.a);
	   System.out.println(b);
   }
   static int m1()
   {
	   m2();
	   System.out.println("m1-method");
	   
	   return 1;
   }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("main-Method");
		System.out.println(FindOutPut.a);
		System.out.println(FindOutPut.b);
		
		m1();
		
	}
		static int b=20;
		static
		{
			System.out.println("static-Block2");
		}
		static String m2()
		{
			System.out.println("m2-method");
			return "returnVal";
		}
}


