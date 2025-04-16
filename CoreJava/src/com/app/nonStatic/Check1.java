package com.app.nonStatic;
//............................ReferenceVariableProgram..........................................
public class Check1 
{
	static Check1 c=new Check1();
     int i=164122;
     long mobNo=9570381226l;
     Check1()
     {
    	 this(c);
    	 System.out.println("zero parrem constructor");
     }
     Check1(Check1 c)
       {
    	 System.out.println("one parrem constructor");
       }
public static void main(String[] args)
     {
	     System.out.println("main method");
	     Check1 c=new Check1();
     }
}
