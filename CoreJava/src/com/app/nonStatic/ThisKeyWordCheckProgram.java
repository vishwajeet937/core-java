package com.app.nonStatic;

public class ThisKeyWordCheckProgram
{
   String name="vishwajeet kumar";
   String name1="sonu";
   String emailId="vishwajeetkumar937@gmail.com";
   public void m1()
   {
	   String name="Sonu kumar";
	   System.out.println(this.name);
	   System.out.println(name);
	   System.out.println(emailId);
	   System.out.println(this.name1);
   }
   public static void m2()
   {
	   char ch='s';
	   float f=2.2f;
	   boolean b=true;
	   int i=11;
	   double d=2.0;
	   System.out.println("ch:"+ch);
	   System.out.println("f:"+f);
	   System.out.println("b:"+b);
	   System.out.println("i:"+i);
	   System.out.println("d:"+d);   
   }
   public static void m3()
   {
	   
   }
   public static void main(String[] args)
   {
	   ThisKeyWordCheckProgram c=new ThisKeyWordCheckProgram();
	   c.m1();
	   c.m2();
   }
}
