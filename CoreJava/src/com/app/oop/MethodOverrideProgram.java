package com.app.oop;

public class MethodOverrideProgram
{
    public void override()
    {
    	System.out.println("print super class Method");
    }
}
class MethodOverrideProgram1 extends MethodOverrideProgram
{
	@Override
	public void override()
	{
		System.out.println("print subclass Method");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MethodOverrideProgram1 m=new MethodOverrideProgram1();
		m.override();
	}

}
