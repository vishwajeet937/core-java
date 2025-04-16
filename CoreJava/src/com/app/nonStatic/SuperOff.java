package com.app.nonStatic;
public class SuperOff extends Object 
{
	String fName="vishwajeet";
	String lName="kumar";
	SuperOff(float f)
    {
    	this(1);
    	System.out.println("Zero parrem constructor");
    	System.out.println(fName);
    }
	SuperOff(int i)
    {
    	this(3.4d,'s');
    	System.out.println("one parrem constructor");
    	System.out.println(lName);
    }
	SuperOff(double d,char ch)
    {
    	System.out.println("Two parrem constructor");
    }
}
class Check1011 extends SuperOff
    {
	  Check1011()
	     {
		  super(12);
		  System.out.println("Zero");
	     }
	  /*Check1(int i)
	     {
		  System.out.println("one");
	     }*/
    
public static void main(String[] args)
{
    Check1011 c=new Check1011();
    
}
}
