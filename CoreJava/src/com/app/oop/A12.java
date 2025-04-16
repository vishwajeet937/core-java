package com.app.oop;

public class A12
{
   static void m1()
    {
	   System.out.println("A m1");
    }
   void m2()
    {
	   System.out.println("A m2");
    }
   static void m3()
    {
	   System.out.println("A m3 no-args");
    }
   public void m3(int[] arr)
   {
	   System.out.println("bkk");
	   
   }
   int m3(String s)
   {
	   System.out.println("A m3 string-args");
	   return 50;
   }
}
 class B12 extends A12
  {
	 static void m1()
	 {
		 System.out.println("B m1");
	 }
	 void m2()
	 {
		 System.out.println("B m2");
	 }
	 void m3(float f,int x)
	 {
		 System.out.println("B m3 float,int age");
	 }
  
	public static void main(String[] args)
	{
		B12 b=new B12();
		b.m1();
		b.m2();
		b.m3();
		b.m3("hsc");
		//b.m3(12.2,123);
		b.m3(123.3f,13);
		b.m3(new int[] {});

	}

}
