package com.app.nonStatic;
//......................ReferenceVariableProgram...................................
public class Check2
{
	int i=34;
	String name="sonu";
     Check2()
     {
    	 this(2);
    	 System.out.println("zero parrem");
     }
     Check2(int i)
     {
    	 this(new Check2());
    	 this.i=i;
    	 System.out.println(this.i);
     }
     Check2(Check2 c)
     {
    	 System.out.println(this .name);
     }
public static void main(String[] args)
  {
    Check2 c=new Check2();	
  }
}
