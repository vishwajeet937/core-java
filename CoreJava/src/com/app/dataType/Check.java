package com.app.dataType;

public class Check 
{
void m1(byte b)
    {
	System.out.println("Byte-program");
	}
void m1(Short s)
   {
	System.out.println("Short-program");
   }
void m1(int i)
   {
	System.out.println("int-program");
   }
void m1(long l)
   {
	System.out.println("long-program");
   }
public static void main(String[] args)
   {
       Check c=new Check();
       c.m1(42);
   }
}
