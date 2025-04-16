package com.app.oop;

public class CheckOff 
{
    CheckOff()
      {
    	this(34);
      }
    CheckOff(int i)
     {
    	this("sonu");
    	System.out.println(13);
     }
    CheckOff(String s)
      {
    	this(3.2f);
    	System.out.println("xw");
      }
    public static void main(String[] args)
    {
    	CheckOff c=new CheckOff();
    }
    CheckOff(float f)
      {
    	System.out.println(3.3f);
      }
}
