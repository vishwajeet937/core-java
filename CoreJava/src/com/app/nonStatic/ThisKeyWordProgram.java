package com.app.nonStatic;

public class ThisKeyWordProgram 
{
    int a;
    int b;
    ThisKeyWordProgram(int a,int b)
      {
    	this.a=a;
    	this.b=b;
      }
    public void m1()
     {
    	System.out.println("a:"+a+"\n"+"b:"+b);
     }
    public static void main(String[] args)
      {
    	ThisKeyWordProgram c=new ThisKeyWordProgram(23,45);
    	c.m1();
      }
}
