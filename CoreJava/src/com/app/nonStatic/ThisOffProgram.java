package com.app.nonStatic;

//import com.app.arrays.Check;

public class ThisOffProgram 
{
	ThisOffProgram()
{
	this(23);
     System.out.println("Zero parrem constructor");	
}
	ThisOffProgram(int i)
{
	this(1,"wd");
   System.out.println("one parrem");	
}
	ThisOffProgram(int i,String s)
{
	this("dasd",21);
	System.out.println("Two parrem constructor");
}
	ThisOffProgram(String s,int i)
{
	this(5.5f);
    System.out.println("to parrem");	
}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
     // Check c=new Check();
	}
	ThisOffProgram(float f)
{
   System.out.println("float");	
}
}
