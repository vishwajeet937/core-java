package com.app.staticProgram;
import static java.lang.System.out;   //import static statement
public class StaticKeyWordProgram
{
//static variable	
    static int num;
//static block    
     static 
       {
    	 System.out.println("static Block");
       }
//static method 
     static void method()
      {
    	 System.out.println("static method");
      }
//main method
	public static void main(String[] args) 
	{
		System.out.println("main-method");
		method();
		System.out.println(StaticKeyWordProgram.num+" "+"is class level variable");
		Check.m1();         
	}
//static inner class
	private static class Check
     {
     	 static int x=89;
     	public static void m1()
     	{
     		int x=24;
     		System.out.println(Check.x);
     		System.out.println(x);
     	}
     }
}
