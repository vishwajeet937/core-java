package com.app.exceptionalHandeling;

public class ArithmeticException1 
{
    int vall1=45;
    int vall2=2;
    public void check1()
      {
    	try
    	 {
    		//System.out.println("try");
    		System.out.println(vall1/vall2);
    	 }
    	catch(Exception e)
    	   {
    		e.printStackTrace();
    		System.out.println("catch");
    	   }
      }
    public static void main(String[] args)
         {
    	ArithmeticException1 c=new ArithmeticException1();
    	   c.check1();
         }
   }

