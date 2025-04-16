package com.app.nonStatic;

public class FindOutPut 
{
  FindOutPut()
  {
	  this(12);//constructor calling
	  System.out.println("Zero-parrem Constructor");
  }
  {
	  System.out.println("Non-static block");
  }
  static
  {
	  System.out.println("static");
  }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		FindOutPut f=new FindOutPut();
       f.m1();
	}
     public String m1()
     {
    	System.out.println("m1");
    	System.err.println("err function");
    	//System.out.println("m2");
    	return "m1";
     }
     FindOutPut(int i)
     {
    	 System.out.println("one parrem constructor");
    	 System.out.println(i);
     }
}
/*
 1st static block execute
 than non static block
 than constructor
 than come main method execute 
 */
//constructor always default constructor added
//System.err.println   means error print in red colour